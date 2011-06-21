package cx.ath.jbzdak.linux.serial.jna.bindings.config;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.TypeMapper;
import org.apache.commons.lang.builder.*;

/**
 * Created by: Jacek Bzdak
 */
public class TermiosConfig extends Structure{

   /**
    * input mode flags<br>
    * C type : tcflag_t
    */
   public int c_iflag;
   /**
    * output mode flags<br>
    * C type : tcflag_t
    */
   public int c_oflag;
   /**
    * control mode flags<br>
    * C type : tcflag_t
    */
   public int c_cflag;
   /**
    * local mode flags<br>
    * C type : tcflag_t
    */
   public int c_lflag;
   /**
    * line discipline<br>
    * C type : cc_t
    */
   public byte c_line;
   /**
    * control characters<br>
    * C type : cc_t[32]
    */
   public byte[] c_cc = new byte[(32)];
   /**
    * input speed<br>
    * C type : speed_t
    */
   public int c_ispeed;
   /**
    * output speed<br>
    * C type : speed_t
    */
   public int c_ospeed;

   public TermiosConfig() {
   }

   public TermiosConfig(TypeMapper mapper) {
      super(mapper);
   }

   public TermiosConfig(Pointer p) {
      super(p);
   }

   public TermiosConfig(Pointer p, int alignment) {
      super(p, alignment);
   }

   public TermiosConfig(Pointer p, int alignment, TypeMapper mapper) {
      super(p, alignment, mapper);
   }

   public void setIFlag(InputFlag... iFlag){
      c_iflag = InputFlag.or(iFlag);
   }

   public void setOFlag(OutputFlag... oflag){
      c_oflag = OutputFlag.or(oflag);
   }

   public void setLFlag(LineFlag... lconfig){
      c_lflag = LineFlag.or(lconfig);
   }

   public void setCFlag(ConfigFlag... configFlags){
      c_cflag = ConfigFlag.or(configFlags);
   }

   @Override
   public String toString() {
      return new ToStringBuilder(this).
              append("c_iflag", c_iflag).
              append("c_oflag", c_oflag).
              append("c_cflag", c_cflag).
              append("c_lflag", c_lflag).
              append("c_line", c_line).
              append("c_cc", c_cc).
              append("c_ispeed", c_ispeed).
              append("c_ospeed", c_ospeed).
              toString();
   }

   public String toStringDecomposeFlags(){
      ToStringBuilder toStringBuilder = new ToStringBuilder(this).
              append("c_iflag", c_iflag).
              append("c_oflag", c_oflag).
              append("c_cflag", c_cflag).
              append("c_lflag", c_lflag).
              append("c_line", c_line).
              append("c_cc", c_cc).
              append("c_ispeed", c_ispeed).
              append("c_ospeed", c_ospeed);

      toStringBuilder.append("c_iflag_decomposed", InputFlag.FAKE_ENUM.decomposite(c_iflag));
      toStringBuilder.append("c_oflag_decomposed", OutputFlag.FAKE_ENUM.decomposite(c_oflag));
      toStringBuilder.append("c_cflag_decomposed", ConfigFlag.FAKE_ENUM.decomposite(c_cflag));
      toStringBuilder.append("c_cllag_decomposed", LineFlag.FAKE_ENUM.decomposite(c_oflag));

      return toStringBuilder.toString();


   }
}
