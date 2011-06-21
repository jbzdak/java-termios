package cx.ath.jbzdak.linux.serial.jna.bindings;

import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/**
 * Created by: Jacek Bzdak
 */
public class TermiosConfPointer extends PointerType {

   public TermiosConfPointer() {
   }

   public TermiosConfPointer(Pointer p) {
      super(p);
   }
}
