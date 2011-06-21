package cx.ath.jbzdak.linux.serial.jna.bindings;

import cx.ath.jbzdak.linux.serial.jna.bindings.config.ConfigFlag;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.SetConfigTime;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.TermiosConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by: Jacek Bzdak
 */
public class TermiosWrapper extends CLibWrapper<Termios> {

   private static final Logger LOGGER = LoggerFactory.getLogger(TermiosWrapper.class);

   public TermiosWrapper(Termios lib) {
      super(lib);
   }

   @Override
   public int open(String name, int mode) throws NativeException {
      LOGGER.info("Opening port {}", name);
      int fd =  super.open(name, mode);
      LOGGER.info("Fd for port {} is {}", name, fd);
      return fd;
   }

   public TermiosConfig getConfig(int portFD) throws NativeException{
      TermiosConfig termiosConfig = new TermiosConfig();
      checkError(this.lib.tcgetattr(portFD, termiosConfig), "Getting termios config");
      LOGGER.info("Reading configuration for port {}. It is: {}", portFD, termiosConfig);
      return termiosConfig;
   }

   public void applyConfig(int portFd, SetConfigTime setConfigTime, TermiosConfig termiosConfig) throws NativeException {
      LOGGER.info("Setting configuration for port {}. It is: {}. Using {} option",
              new Object[]{portFd, termiosConfig, setConfigTime});
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




}
