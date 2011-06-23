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

package cx.ath.jbzdak.linux.serial.jna.bindings.config;

import cx.ath.jbzdak.common.fakeEnum.FakeEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedFakeEnum;

import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by: Jacek Bzdak
 */
public class ConfigFlag extends MaskedEnum {

   /**
    * Baud rate mask
    */
   public static final ConfigFlag CBAUD = new ConfigFlag(0010017);

   public static final ConfigFlag CBAUDEX = new ConfigFlag(0010000);
   /** Baud rate 0 */ public static final ConfigFlag B0 = new BaudRate(0000000, 0);
   /** Baud rate 50 */ public static final ConfigFlag B50 = new BaudRate(0000001, 50);
   /** Baud rate 75 */ public static final ConfigFlag B75 = new BaudRate(0000002, 75);
   /** Baud rate 110 */ public static final ConfigFlag B110 = new BaudRate(0000003, 110);
   /** Baud rate 134 */ public static final ConfigFlag B134 = new BaudRate(0000004, 134);
   /** Baud rate 150 */ public static final ConfigFlag B150 = new BaudRate(0000005, 150);
   /** Baud rate 200 */ public static final ConfigFlag B200 = new BaudRate(0000006, 200);
   /** Baud rate 300 */ public static final ConfigFlag B300 = new BaudRate(0000007, 300);
   /** Baud rate 600 */ public static final ConfigFlag B600 = new BaudRate(0000010, 600);
   /** Baud rate 1200 */ public static final ConfigFlag B1200 = new BaudRate(0000011, 1200);
   /** Baud rate 1800 */ public static final ConfigFlag B1800 = new BaudRate(0000012, 1800);
   /** Baud rate 2400 */ public static final ConfigFlag B2400 = new BaudRate(0000013, 2400);
   /** Baud rate 4800 */ public static final ConfigFlag B4800 = new BaudRate(0000014, 4800);
   /** Baud rate 9600 */ public static final ConfigFlag B9600 = new BaudRate(0000015, 9600);
   /** Baud rate 19200 */ public static final ConfigFlag B19200 = new BaudRate(0000016, 19200);
   /** Baud rate 57600 */ public static final ConfigFlag B57600 = new BaudRate(0010001, 57600);
   /** Baud rate 115200 */ public static final ConfigFlag B115200 = new BaudRate(0010002, 115200);
   /** Baud rate 230400 */ public static final ConfigFlag B230400 = new BaudRate(0010003, 230400);
   /** Baud rate 460800 */ public static final ConfigFlag B460800 = new BaudRate(0010004, 460800);
   /** Baud rate 500000 */ public static final ConfigFlag B500000 = new BaudRate(0010005, 500000);
   /** Baud rate 576000 */ public static final ConfigFlag B576000 = new BaudRate(0010006, 576000);
   /** Baud rate 921600 */ public static final ConfigFlag B921600 = new BaudRate(0010007, 921600);
   /** Baud rate 1000000 */ public static final ConfigFlag B1000000 = new BaudRate(0010010, 1000000);
   /** Baud rate 1152000 */ public static final ConfigFlag B1152000 = new BaudRate(0010011, 1152000);
   /** Baud rate 1500000 */ public static final ConfigFlag B1500000 = new BaudRate(0010012, 1500000);
   /** Baud rate 2000000 */ public static final ConfigFlag B2000000 = new BaudRate(0010013, 2000000);
   /** Baud rate 2500000 */ public static final ConfigFlag B2500000 = new BaudRate(0010014, 2500000);
   /** Baud rate 3000000 */ public static final ConfigFlag B3000000 = new BaudRate(0010015, 3000000);
   /** Baud rate 3500000 */ public static final ConfigFlag B3500000 = new BaudRate(0010016, 3500000);
   /** Baud rate 4000000 */ public static final ConfigFlag B4000000 = new BaudRate(0010017, 4000000);


   /**
    * Bit mask for data bits
    */
   public static final ConfigFlag CSIZE = new ConfigFlag(0000060, false);

   /**
    * 5 data bits
    */
   public static final ConfigFlag CS5 = new ConfigFlag(0000000);
   /**
    * 6 data bits
    */
   public static final ConfigFlag CS6 = new ConfigFlag(0000020);
   /**
    * 7 data bits
    */
   public static final ConfigFlag CS7 = new ConfigFlag(0000040);
   /**
    * 8 data bits
    */
   public static final ConfigFlag CS8 = new ConfigFlag(0000060);

   /**
    * Use two stop bits (1 otherwise)
    */
   public static final ConfigFlag CSTOPB = new ConfigFlag(0000100);
   /**
    * Enable recliever
    */
   public static final ConfigFlag CREAD = new ConfigFlag(0000200);
   /**
    * Enable parity checks
    */
   public static final ConfigFlag PARENB = new ConfigFlag(0000400);
   /**
    * Check odd parity (instead of even)
    */
   public static final ConfigFlag PARODD = new ConfigFlag(0001000);

   /**
    * Hangup on last close.
    */
   public static final ConfigFlag HUPCL = new ConfigFlag(0002000);

   /**
    * Do not become 'owner' of port.
    */
   public static final ConfigFlag CLOCAL = new ConfigFlag(0004000);


   public static final ConfigFlag __MAX_BAUD = new ConfigFlag(B4000000);

   public static final ConfigFlag CIBAUD = new ConfigFlag(002003600000);
   public static final ConfigFlag CMSPAR = new ConfigFlag(010000000000);
   public static final ConfigFlag CRTSCTS = new ConfigFlag(020000000000);

   public static final MaskedFakeEnum<ConfigFlag> FAKE_ENUM = new MaskedFakeEnum<ConfigFlag>(ConfigFlag.class);

   private static final Map<Integer, BaudRate> BAUD_RATES;

   static {
      Map<Integer, BaudRate> BAUD_RATES_ = new HashMap<Integer, BaudRate>();
      for (ConfigFlag flag : FAKE_ENUM.values()) {
         if (flag instanceof BaudRate) {
            BaudRate baudRate = (BaudRate) flag;
            BAUD_RATES_.put(baudRate.getBaudRate(), baudRate);
         }
      }
      BAUD_RATES = Collections.unmodifiableMap(BAUD_RATES_);
   }


   public static ConfigFlag getBaudRateConstant(int baudRate) {
      ConfigFlag flag = BAUD_RATES.get(baudRate);
      if(flag == null){
         throw  new InvalidParameterException("Unknown baud rate");
      }
      return flag;
   }

   private ConfigFlag(int constant) {
      super(constant);
   }


   public ConfigFlag(int constant, int baudRate, boolean isBaud) {
      super(constant);
   }

   public ConfigFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }

   public ConfigFlag(int constant, boolean useInDecomposition) {
      super(constant, useInDecomposition);
   }

   @Override
   public String toString() {
      return FAKE_ENUM.nameOf(this);
   }

   public boolean isBaudRate(){
      return false;
   }


   private static class BaudRate extends ConfigFlag{
      final int baudRate;

      private BaudRate(int constant, int baudRate) {
         super(constant);
         this.baudRate = baudRate;
      }

      public int getBaudRate() {
         return baudRate;
      }

      @Override
      public boolean isBaudRate() {
         return true;
      }
   }
}
