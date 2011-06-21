package cx.ath.jbzdak.linux.serial.jna.bindings;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

/**
 * Created by: Jacek Bzdak
 */
public interface CLib extends Library {

   int strerror_r(int errno, byte[] buffer, int bufflen);

	@Deprecated
	public  int open(Pointer __file, int __oflag);

	/**
	 * Original signature : <code>int open(__const char*, int)</code><br>
	 * <i>native declaration : line 266</i>
	 */

	public  int open(String __file, int __oflag);

   int close(int fileDescriptor);

}
