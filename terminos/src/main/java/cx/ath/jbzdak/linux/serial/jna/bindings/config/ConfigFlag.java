package cx.ath.jbzdak.linux.serial.jna.bindings.config;

import cx.ath.jbzdak.common.fakeEnum.FakeEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedFakeEnum;

import java.util.Map;

/**
 * Created by: Jacek Bzdak
 */
public class ConfigFlag extends MaskedEnum {

   /**
    * Baud rate mask
    */
   public static final ConfigFlag CBAUD = new ConfigFlag(0010017);

   /**
    * Baud rate 0
    */
   public static final ConfigFlag B0 = new ConfigFlag(0000000);
   /**
    * Baud rate 50
    */
   public static final ConfigFlag B50 = new ConfigFlag(0000001);
   /**
    * Baud rate 75
    */
   public static final ConfigFlag B75 = new ConfigFlag(0000002);
   /**
    * Baud rate 110
    */
   public static final ConfigFlag B110 = new ConfigFlag(0000003);
   /**
    * Baud rate 134
    */
   public static final ConfigFlag B134 = new ConfigFlag(0000004);
   /**
    * Baud rate 150
    */
   public static final ConfigFlag B150 = new ConfigFlag(0000005);
   /**
    * Baud rate 200
    */
   public static final ConfigFlag B200 = new ConfigFlag(0000006);
   /**
    * Baud rate 300
    */
   public static final ConfigFlag B300 = new ConfigFlag(0000007);
   /**
    * Baud rate 600
    */
   public static final ConfigFlag B600 = new ConfigFlag(0000010);
   /**
    * Baud rate 1200
    */
   public static final ConfigFlag B1200 = new ConfigFlag(0000011);
   /**
    * Baud rate 1800
    */
   public static final ConfigFlag B1800 = new ConfigFlag(0000012);
   /**
    * Baud rate 2400
    */
   public static final ConfigFlag B2400 = new ConfigFlag(0000013);
   /**
    * Baud rate 4800
    */
   public static final ConfigFlag B4800 = new ConfigFlag(0000014);
   /**
    * Baud rate 9600
    */
   public static final ConfigFlag B9600 = new ConfigFlag(0000015);
   /**
    * Baud rate 19200
    */
   public static final ConfigFlag B19200 = new ConfigFlag(0000016);
   /**
    * Baud rate 38400
    */
   public static final ConfigFlag B38400 = new ConfigFlag(0000017);
   /**
    * Baud rate 57600
    */
   public static final ConfigFlag B57600 = new ConfigFlag(0010001);
   /**
    * Baud rate 115200
    */
   public static final ConfigFlag B115200 = new ConfigFlag(0010002);
   /**
    * Baud rate 230400
    */
   public static final ConfigFlag B230400 = new ConfigFlag(0010003);
   /**
    * Baud rate 460800
    */
   public static final ConfigFlag B460800 = new ConfigFlag(0010004);
   /**
    * Baud rate 500000
    */
   public static final ConfigFlag B500000 = new ConfigFlag(0010005);
   /**
    * Baud rate 576000
    */
   public static final ConfigFlag B576000 = new ConfigFlag(0010006);
   /**
    * Baud rate 921600
    */
   public static final ConfigFlag B921600 = new ConfigFlag(0010007);
   /**
    * Baud rate 1000000
    */
   public static final ConfigFlag B1000000 = new ConfigFlag(0010010);
   /**
    * Baud rate 1152000
    */
   public static final ConfigFlag B1152000 = new ConfigFlag(0010011);
   /**
    * Baud rate 1500000
    */
   public static final ConfigFlag B1500000 = new ConfigFlag(0010012);
   /**
    * Baud rate 2000000
    */
   public static final ConfigFlag B2000000 = new ConfigFlag(0010013);
   /**
    * Baud rate 2500000
    */
   public static final ConfigFlag B2500000 = new ConfigFlag(0010014);
   /**
    * Baud rate 3000000
    */
   public static final ConfigFlag B3000000 = new ConfigFlag(0010015);
   /**
    * Baud rate 3500000
    */
   public static final ConfigFlag B3500000 = new ConfigFlag(0010016);
   /**
    * Baud rate 4000000
    */
   public static final ConfigFlag B4000000 = new ConfigFlag(0010017);

   /**
    * External rate clock
    */
   public static final ConfigFlag EXTA = new ConfigFlag(B19200);

   /**
    * External rate clock
    */
   public static final ConfigFlag EXTB = new ConfigFlag(B38400);

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

   public static final ConfigFlag CBAUDEX = new ConfigFlag(0010000);

   public static final ConfigFlag __MAX_BAUD = new ConfigFlag(B4000000);

   public static final ConfigFlag CIBAUD = new ConfigFlag(002003600000);
   public static final ConfigFlag CMSPAR = new ConfigFlag(010000000000);
   public static final ConfigFlag CRTSCTS = new ConfigFlag(020000000000);

   public static final MaskedFakeEnum<ConfigFlag> FAKE_ENUM = new MaskedFakeEnum<ConfigFlag>(ConfigFlag.class);

   private ConfigFlag(int constant) {
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
}
