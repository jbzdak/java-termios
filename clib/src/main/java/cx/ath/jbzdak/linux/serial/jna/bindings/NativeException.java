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

import java.io.IOException;

/**
 * Created by: Jacek Bzdak
 */
public class NativeException extends Exception{

   final int errNo;

   final Errno errNoEnum;

   public NativeException(String message, int errNo) {
      super(message);
      this.errNo = errNo;
      this.errNoEnum = Errno.valueOf(errNo);
   }

   @Override
   public String getMessage() {
      return super.getMessage() + " [errno=" + errNo + ", description"+(errNoEnum!=null?errNoEnum.getErrorMsg():"No description")+"]";
   }

   public int getErrNo() {
      return errNo;
   }

   public Errno getErrNoEnum() {
      return errNoEnum;
   }
}
