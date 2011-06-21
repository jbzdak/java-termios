//package cx.ath.jbzdak.linux.serial.jna.bindings;
//
//import com.sun.jna.Native;
//
///**
// * Created by: Jacek Bzdak
// */
//public class TermiosDirect implements Termios{
//
//   static {
//      Native.register(Const.LIBRARY_NAME);
//   }
//
//   @Override
//   public native int open(String name, int openMode);
//
//   @Override
//   public native int close(int fd);
//
//	public static native int cfgetospeed(termios __termios_p);
//	/**
//	 * Return the input baud rate stored in *TERMIOS_P.<br>
//	 * Original signature : <code>speed_t cfgetispeed(termios*)</code><br>
//	 * <i>native declaration : line 226</i>
//	 */
//
//	public static native int cfgetispeed(termios __termios_p);
//	/**
//	 * Set the output baud rate stored in *TERMIOS_P to SPEED.<br>
//	 * Original signature : <code>int cfsetospeed(termios*, speed_t)</code><br>
//	 * <i>native declaration : line 229</i>
//	 */
//
//	public static native int cfsetospeed(termios __termios_p, int __speed);
//	/**
//	 * Set the input baud rate stored in *TERMIOS_P to SPEED.<br>
//	 * Original signature : <code>int cfsetispeed(termios*, speed_t)</code><br>
//	 * <i>native declaration : line 232</i>
//	 */
//
//	public static native int cfsetispeed(termios __termios_p, int __speed);
//	/**
//	 * Send zero bits on FD.<br>
//	 * Original signature : <code>int tcsendbreak(int, int)</code><br>
//	 * <i>native declaration : line 250</i>
//	 */
//
//	public static native int tcsendbreak(int __fd, int __duration);
//	/**
//	 * Wait for pending output to be written on FD.<br>
//	 * This function is a cancellation point and therefore not marked with<br>
//	 * __THROW.<br>
//	 * Original signature : <code>int tcdrain(int)</code><br>
//	 * <i>native declaration : line 256</i>
//	 */
//
//	public static native int tcdrain(int __fd);
//	/**
//	 * Flush pending data on FD.<br>
//	 * Values for QUEUE_SELECTOR (TC{I,O,IO}FLUSH) are in <bits/termios.h>.<br>
//	 * Original signature : <code>int tcflush(int, int)</code><br>
//	 * <i>native declaration : line 260</i>
//	 */
//
//	public static native int tcflush(int __fd, int __queue_selector);
//	/**
//	 * Suspend or restart transmission on FD.<br>
//	 * Values for ACTION (TC[IO]{OFF,ON}) are in <bits/termios.h>.<br>
//	 * Original signature : <code>int tcflow(int, int)</code><br>
//	 * <i>native declaration : line 264</i>
//	 */
//
//	public static native int tcflow(int __fd, int __action);
//	/**
//	 * Original signature : <code>int open(__const char*, int)</code><br>
//	 * <i>native declaration : line 266</i><br>
//	 * @deprecated use the safer methods {@link #open(java.lang.String, int)} and {@link #open(com.sun.jna.Pointer, int)} instead
//	 */
//
//	@Deprecated
//	public static native int open(Pointer __file, int __oflag);
//	/**
//	 * Original signature : <code>int open(__const char*, int)</code><br>
//	 * <i>native declaration : line 266</i>
//	 */
//
//	public static native int open(String __file, int __oflag);
//}
