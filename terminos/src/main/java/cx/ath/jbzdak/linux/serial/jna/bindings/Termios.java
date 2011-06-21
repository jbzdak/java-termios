package cx.ath.jbzdak.linux.serial.jna.bindings;


import cx.ath.jbzdak.linux.serial.jna.bindings.config.TermiosConfig;

import java.nio.ByteBuffer;

/**
 * Created by: Jacek Bzdak
 */
public interface Termios extends CLib{


   int write (int port, String string, int stringLen);

   int read (int port, byte[] buff, int bufffLen);

   int read (int port, ByteBuffer buffer, int bufffLen);



   public int tcgetattr(int port, TermiosConfig byReference);


   public int tcsetattr(int port, int mode, TermiosConfig byReference);

   public int cfsetispeed(TermiosConfig config, int speed);

   public int cfsetospeed(TermiosConfig config, int speed);


	/**
	 * Send zero bits on FD.<br>
	 * Original signature : <code>int tcsendbreak(int, int)</code><br>
	 * <i>native declaration : line 250</i>
	 */

	public  int tcsendbreak(int __fd, int __duration);
	/**
	 * Wait for pending output to be written on FD.<br>
	 * This function is a cancellation point and therefore not marked with<br>
	 * __THROW.<br>
	 * Original signature : <code>int tcdrain(int)</code><br>
	 * <i>native declaration : line 256</i>
	 */

	public  int tcdrain(int __fd);
	/**
	 * Flush pending data on FD.<br>
	 * Values for QUEUE_SELECTOR (TC{I,O,IO}FLUSH) are in <bits/termios.h>.<br>
	 * Original signature : <code>int tcflush(int, int)</code><br>
	 * <i>native declaration : line 260</i>
	 */

	public  int tcflush(int __fd, int __queue_selector);
	/**
	 * Suspend or restart transmission on FD.<br>
	 * Values for ACTION (TC[IO]{OFF,ON}) are in <bits/termios.h>.<br>
	 * Original signature : <code>int tcflow(int, int)</code><br>
	 * <i>native declaration : line 264</i>
	 */

	public  int tcflow(int __fd, int __action);
	/**
	 * Original signature : <code>int open(__const char*, int)</code><br>
	 * <i>native declaration : line 266</i><br>
	 * @deprecated use the safer methods {@link #open(java.lang.String, int)} and {@link #open(com.sun.jna.Pointer, int)} instead
	 */

}
