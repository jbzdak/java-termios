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
