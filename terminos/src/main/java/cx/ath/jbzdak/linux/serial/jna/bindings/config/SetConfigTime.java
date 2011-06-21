package cx.ath.jbzdak.linux.serial.jna.bindings.config;

/**
 * Created by: Jacek Bzdak
 */
public enum  SetConfigTime {
   /**
    * Make changes now
    */
   NOW(0),
   /**
    * Make changes when everything in port has been transmited
    */
   DRAIN(1),
   /**
    * Flush everything before change
    */
   FLUSH(2);

   private final int constant;

   SetConfigTime(int constant) {
      this.constant = constant;
   }

   public int getConstant() {
      return constant;
   }

   //#define	TCSANOW		0
//#define	TCSADRAIN	1
//#define	TCSAFLUSH	2


}
