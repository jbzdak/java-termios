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

import cx.ath.jbzdak.linux.serial.jna.bindings.config.ConfigFlag;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.SetConfigTime;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.TermiosConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.ByteBuffer;

/**
 * Created by: Jacek Bzdak
 */
public class TermiosWrapper extends CLibWrapper<Termios> {

   private static final Logger LOGGER = LoggerFactory.getLogger(TermiosWrapper.class);

   public TermiosWrapper(Termios lib) {
      super(lib);
   }

//   @Override
//   public int open(String name, int mode) throws NativeException {
//      LOGGER.info("Opening port '{}'", name);
//      int fd =  super.open(name, mode);
//      LOGGER.info("Fd for port '{}' is {}", name, fd);
//      return fd;
//   }

   public TermiosConfig getConfig(int portFD) throws NativeException{
      TermiosConfig termiosConfig = new TermiosConfig();
      checkError(this.lib.tcgetattr(portFD, termiosConfig), "Getting termios config");
      LOGGER.info("Reading configuration for port {}. It is: {}", portFD, termiosConfig.toStringDecomposeFlags());
      return termiosConfig;
   }

   public void applyConfig(int portFd, SetConfigTime setConfigTime, TermiosConfig termiosConfig) throws NativeException {
      LOGGER.info("Setting configuration for port {}. It is: {}. Using {} option",
              new Object[]{portFd, termiosConfig.toStringDecomposeFlags(), setConfigTime});
      checkError(this.lib.tcsetattr(portFd, setConfigTime.getConstant(), termiosConfig));
   }

   public void applyConfig(int portFd, TermiosConfig termiosConfig) throws NativeException {
      applyConfig(portFd, SetConfigTime.NOW, termiosConfig);
   }

   public void setInputBaudRate(TermiosConfig config, int baudRate) throws NativeException{
      checkError(lib.cfsetispeed(config,  baudRate));
   }

   public void setInputBaudRate(TermiosConfig config, ConfigFlag baudRate) throws NativeException{
      if((baudRate.getConstant() & ConfigFlag.CBAUD.getConstant()) == 0){
         throw new NativeException("Config flag " + baudRate + " does not represent baud rate", -1);
      }
      checkError(lib.cfsetispeed(config,  baudRate.getConstant()));
   }

   public void setOutputBaudRate(TermiosConfig config, int baudRate) throws NativeException{
      checkError(lib.cfsetospeed(config,  baudRate));
   }

   public void setOutputBaudRate(TermiosConfig config, ConfigFlag baudRate) throws NativeException{
      if((baudRate.getConstant() & ConfigFlag.CBAUD.getConstant()) == 0){
         throw new NativeException("Config flag " + baudRate + " does not represent baud rate", -1);
      }
      checkError(lib.cfsetospeed(config,  baudRate.getConstant()));
   }

   public void setBaudRate(TermiosConfig termiosConfig, int baudRate) throws NativeException{
      setInputBaudRate(termiosConfig, baudRate);
      setOutputBaudRate(termiosConfig, baudRate);
   }

   public void setBaudRate(TermiosConfig termiosConfig, ConfigFlag baudRate) throws NativeException{
      setInputBaudRate(termiosConfig, baudRate);
      setOutputBaudRate(termiosConfig, baudRate);
   }

   public void read(int port, byte[] buffer) throws NativeException {
      checkError(lib.read(port, buffer, buffer.length));
   }

   public void read(int port, ByteBuffer buffer) throws NativeException {
      buffer.clear();
      int bytesRead = lib.read(port, buffer, buffer.capacity());
      if(bytesRead < 0){
         int errno = CLibEntryPoint.errno();

         if(errno == Errno.EAGAIN.getErrno()){
            buffer.clear();
            buffer.limit(0);
            return;
         }
         onNativeError(errno, "While reading from port");
      }
      buffer.limit(bytesRead);
   }

   public void write(int port, byte[] data) throws NativeException{
      checkError(lib.write(port, data, data.length));
   }

   public void write(int port, String data) throws NativeException{
      checkError(lib.write(port, data, data.length()));
   }

   public void write(int port, ByteBuffer data) throws NativeException{
      checkError(lib.write(port, data.array(), data.limit()));
   }
}

