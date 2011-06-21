package cx.ath.jbzdak.linux.serial.jna.bindings;

import java.io.IOException;

/**
 * Created by: Jacek Bzdak
 */
public class NativeException extends IOException{

   final int errNo;

   public NativeException(String message, int errNo) {
      super(message);
      this.errNo = errNo;
   }

   @Override
   public String getMessage() {
      return super.getMessage() + " [errno=" + errNo + "]";
   }
}
