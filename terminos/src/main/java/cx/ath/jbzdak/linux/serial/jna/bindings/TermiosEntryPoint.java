package cx.ath.jbzdak.linux.serial.jna.bindings;

import com.sun.jna.Function;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import cx.ath.jbzdak.linux.serial.jna.bindings.Termios;

/**
 * Created by: Jacek Bzdak
 */
public class TermiosEntryPoint extends CLibEntryPoint{

   public static final Termios TERMIOS = buildTermiosLibrary();

   public static final TermiosWrapper TERMIOS_WRAPPER = new TermiosWrapper(TERMIOS);

   public static Termios buildTermiosLibrary(){
      return (Termios) Native.loadLibrary(LIBRARY_NAME, Termios.class);
   }



}
