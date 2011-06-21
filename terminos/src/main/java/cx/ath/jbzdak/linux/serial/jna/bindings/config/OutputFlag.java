package cx.ath.jbzdak.linux.serial.jna.bindings.config;

import cx.ath.jbzdak.common.fakeEnum.FakeEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedFakeEnum;

/**
 * Created by: Jacek Bzdak
 */
public class OutputFlag extends MaskedEnum{

   public static final OutputFlag OPOST = new OutputFlag(0000001);
   public static final OutputFlag OLCUC = new OutputFlag(0000002);
   public static final OutputFlag ONLCR = new OutputFlag(0000004);
   public static final OutputFlag OCRNL = new OutputFlag(0000010);
   public static final OutputFlag ONOCR = new OutputFlag(0000020);
   public static final OutputFlag ONLRET = new OutputFlag(0000040);
   public static final OutputFlag OFILL = new OutputFlag(0000100);
   public static final OutputFlag OFDEL = new OutputFlag(0000200);

   public static final MaskedFakeEnum<OutputFlag> FAKE_ENUM = new MaskedFakeEnum<OutputFlag>(OutputFlag.class);

   OutputFlag(int constant) {
      super(constant);
   }

   OutputFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }
}
