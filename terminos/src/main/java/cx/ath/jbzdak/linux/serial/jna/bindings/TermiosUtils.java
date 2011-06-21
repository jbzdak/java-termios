package cx.ath.jbzdak.linux.serial.jna.bindings;

import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;

/**
 * Created by: Jacek Bzdak
 */
public class TermiosUtils {

   public static int updateMask(int base, MaskedEnum mask, MaskedEnum value){
      base = MaskedEnum.switchOff(base, mask);
      base = MaskedEnum.switchOn(base, value);
      return base;
   }
}
