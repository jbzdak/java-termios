/*
 * Copyright for Jacek Bzdak 2011.
 *
 * This file is part of Linux serial io, utility library to do serial
 * port communication using native APIs and JNA to bind them to java.
 *
 * Linux serial io is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Linux serial io is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Linux serial io.  If not, see <http://www.gnu.org/licenses/>.
 */

package cx.ath.jbzdak.linux.serial.jna.bindings;

/**
 * Created by: Jacek Bzdak
 */
public class CLibWrapper<CLIB extends CLib> {

   protected final CLIB lib;

   public CLibWrapper(CLIB lib) {
      this.lib = lib;
   }

   public String currErrorDescription(){
      return currErrorDescription(CLibEntryPoint.errno());
   }

   protected int checkError(int error, String customMessage) throws NativeException {
      if(error >= 0){
         return error;
      }
      onNativeError(error, customMessage);
      return error;
   }

   protected void onNativeError(int error, String customMessage) throws NativeException{
      int errno = CLibEntryPoint.errno();
      String errDesc = this.currErrorDescription(errno);
      throw new NativeException("Error during termios operation: '" + errDesc + "'. Custom message is '" + customMessage + "'", errno);
   }

   protected int checkError(int error) throws NativeException {
      return checkError(error, "");
   }

   public String currErrorDescription(int errno){
      return lib.strerror(errno);
   }


   public int open(String name, OpenMode... openModes) throws NativeException {
      int mode = OpenMode.or(openModes);
      return open(name, mode);
   }

   public int open(String name, Iterable<String> openModes) throws NativeException {
      int mode = OpenMode.or(OpenMode.FAKE_ENUM, openModes);
      return open(name, mode);
   }

   public int open(String name, int mode) throws NativeException{
      return checkError(lib.open(name, mode));
   }

   public int close(int fileDescriptor) throws NativeException{
      return checkError(lib.close(fileDescriptor));
   }



}
