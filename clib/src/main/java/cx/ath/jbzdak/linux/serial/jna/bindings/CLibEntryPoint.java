package cx.ath.jbzdak.linux.serial.jna.bindings;

import com.sun.jna.Function;
import com.sun.jna.NativeLibrary;

/**
 * Created by: Jacek Bzdak
 */
public class CLibEntryPoint {

   public static int DEFAULT_BUFFER_SIZE = 128;

   public static final String LIBRARY_NAME = "c";

   public static final NativeLibrary TERMIOS_NATIVE = NativeLibrary.getInstance(LIBRARY_NAME);

   private static final Function errnoFun = TERMIOS_NATIVE.getFunction("errno");

   public static int errno(){
      return errnoFun.getInt(0);
   }



}
