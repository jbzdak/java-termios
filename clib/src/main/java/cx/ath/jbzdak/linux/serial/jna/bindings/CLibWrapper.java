package cx.ath.jbzdak.linux.serial.jna.bindings;

/**
 * Created by: Jacek Bzdak
 */
public class CLibWrapper<CLIB extends CLib> {

   protected final CLIB lib;

   public CLibWrapper(CLIB lib) {
      this.lib = lib;
   }

   public String currErrorDescription(){
      return currErrorDescription(CLibEntryPoint.errno());
   }

   protected int checkError(int error, String customMessage) throws NativeException {
      if(error == 0){
         return error;
      }
      int errno = CLibEntryPoint.errno();
      String errDesc = this.currErrorDescription(errno);
      throw new NativeException("Error during termios operation: '" + errDesc + "'. Custom message is '" + customMessage + "'", errno);
   }

   protected int checkError(int error) throws NativeException {
      return checkError(error, "");
   }

   public String currErrorDescription(int errno){
      byte[] buffer = new byte[CLibEntryPoint.DEFAULT_BUFFER_SIZE];
      lib.strerror_r(errno, buffer, CLibEntryPoint.DEFAULT_BUFFER_SIZE);
      return new String(buffer);
   }


   public int open(String name, OpenMode... openModes) throws NativeException {
      int mode = OpenMode.or(openModes);
      return open(name, mode);
   }

   public int open(String name, Iterable<String> openModes) throws NativeException {
      int mode = OpenMode.or(OpenMode.FAKE_ENUM, openModes);
      return open(name, mode);
   }

   public int open(String name, int mode) throws NativeException{
      return checkError(lib.open(name, mode));
   }

   public int close(int fileDescriptor) throws NativeException{
      return checkError(lib.close(fileDescriptor));
   }



}
