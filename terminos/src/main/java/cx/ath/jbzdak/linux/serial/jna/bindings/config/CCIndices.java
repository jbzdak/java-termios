/*
 * Copyright for Jacek Bzdak 2011.
 *
 * This file is part of Linux serial io, utility library to do serial
 * port communication using native APIs and JNA to bind them to java.
 *
 * Linux serial io is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Linux serial io is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Linux serial io.  If not, see <http://www.gnu.org/licenses/>.
 */

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
