package cx.ath.jbzdak.linux.serial.jna.bindings.config;

import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;

/**
 * Created by: Jacek Bzdak
 */
public class LocalFlag extends MaskedEnum{

   public static final LocalFlag  ISIG = new LocalFlag(0000001);
   public static final LocalFlag  ICANON = new LocalFlag(0000002);

   public static final LocalFlag  XCASE = new LocalFlag(0000004);

   public static final LocalFlag  ECHO = new LocalFlag(0000010);
   public static final LocalFlag  ECHOE = new LocalFlag(0000020);
   public static final LocalFlag  ECHOK = new LocalFlag(0000040);
   public static final LocalFlag  ECHONL = new LocalFlag(0000100);
   public static final LocalFlag  NOFLSH = new LocalFlag(0000200);
   public static final LocalFlag  TOSTOP = new LocalFlag(0000400);

   public static final LocalFlag  ECHOCTL = new LocalFlag(0001000);
   public static final LocalFlag  ECHOPRT = new LocalFlag(0002000);
   public static final LocalFlag  ECHOKE = new LocalFlag(0004000);
   public static final LocalFlag  FLUSHO = new LocalFlag(0010000);
   public static final LocalFlag  PENDIN = new LocalFlag(0040000);

   public static final LocalFlag  IEXTEN = new LocalFlag(0100000);

   public static final LocalFlag  EXTPROC = new LocalFlag(0200000);

   public LocalFlag(int constant) {
      super(constant);
   }

   public LocalFlag(int constant, boolean useInDecomposition) {
      super(constant, useInDecomposition);
   }

   public LocalFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }
}
