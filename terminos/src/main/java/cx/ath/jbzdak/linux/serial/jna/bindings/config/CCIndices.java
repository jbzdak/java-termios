package cx.ath.jbzdak.linux.serial.jna.bindings.config;

/**
 * Created by: Jacek Bzdak
 */
public enum CCIndices {
   VINTR(0),
   VQUIT(1),
   VERASE(2),
   VKILL(3),
   VEOF(4),
   /**
    * Time (in tenths of seconds) to wait for input
    */
   VTIME(5),
   /**
    * Ninimal number of characters to read from inbput
     */
   VMIN(6),
   VSWTC(7),
   VSTART(8),
   VSTOP(9),
   VSUSP(10),
   VEOL(11),
   VREPRINT(12),
   VDISCARD(13),
   VWERASE(14),
   VLNEXT(15),
   VEOL2(16);

   public final int value;

   CCIndices(int value){
      this.value = value;
   }


}
