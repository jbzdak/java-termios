import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.ConfigFlag;
import cx.ath.jbzdak.linux.serial.jna.bindings.config.InputFlag;
import org.junit.Test;

/**
 * Created by: Jacek Bzdak
 */
public class TestFoo {

   @Test
   public void testName() throws Exception {
      System.out.println(ConfigFlag.FAKE_ENUM.decomposite(3261));
   }

   @Test
   public void testdsds() throws Exception {
      System.out.println(InputFlag.FAKE_ENUM.decomposite(6144));
   }
}
