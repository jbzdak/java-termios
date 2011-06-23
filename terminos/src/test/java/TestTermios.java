
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

import cx.ath.jbzdak.linux.serial.jna.bindings.Termios;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.TermiosConfig;
import cx.ath.jbzdak.linux.serial.jna.bindings.TermiosEntryPoint;

/**
 * Created by: Jacek Bzdak
 */
public class TestTermios{

   @org.junit.Before
   public void setUp() throws Exception {

   }

   public static void main(String[] args) throws InterruptedException {
      Termios termios = TermiosEntryPoint.TERMIOS;

      int port = termios.open("/dev/ttyUSB0", 2306);

      TermiosConfig termiosConfig = new TermiosConfig();

      termios.tcgetattr(port, termiosConfig);

      termiosConfig.c_iflag = 6144;
      termiosConfig.c_oflag = 0;
      termiosConfig.c_cflag = 3261;
      termiosConfig.c_lflag = 0;
      termiosConfig.c_cc[5] = 10;
      termiosConfig.c_cc[6] = 1;

      termios.cfsetispeed(termiosConfig, 15);
      termios.cfsetospeed(termiosConfig, 15);
      termios.tcsetattr(port, 0, termiosConfig);

      String message = "Hello World!\n";
      termios.write(port, message, message.length()+1);
      synchronized (""){
         "".wait(100);
      }
      byte[] buffer = new byte[30];
      termios.read(port, buffer, message.length()+1);
      termios.close(port);
      System.out.println(new String(buffer));

   }
}
