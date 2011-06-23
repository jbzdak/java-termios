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

import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;

/**
 * Created by: Jacek Bzdak
 */
public class LocalFlag extends MaskedEnum{

   public static final LocalFlag  ISIG = new LocalFlag(0000001);
   public static final LocalFlag  ICANON = new LocalFlag(0000002);

   public static final LocalFlag  XCASE = new LocalFlag(0000004);

   public static final LocalFlag  ECHO = new LocalFlag(0000010);
   public static final LocalFlag  ECHOE = new LocalFlag(0000020);
   public static final LocalFlag  ECHOK = new LocalFlag(0000040);
   public static final LocalFlag  ECHONL = new LocalFlag(0000100);
   public static final LocalFlag  NOFLSH = new LocalFlag(0000200);
   public static final LocalFlag  TOSTOP = new LocalFlag(0000400);

   public static final LocalFlag  ECHOCTL = new LocalFlag(0001000);
   public static final LocalFlag  ECHOPRT = new LocalFlag(0002000);
   public static final LocalFlag  ECHOKE = new LocalFlag(0004000);
   public static final LocalFlag  FLUSHO = new LocalFlag(0010000);
   public static final LocalFlag  PENDIN = new LocalFlag(0040000);

   public static final LocalFlag  IEXTEN = new LocalFlag(0100000);

   public static final LocalFlag  EXTPROC = new LocalFlag(0200000);

   public LocalFlag(int constant) {
      super(constant);
   }

   public LocalFlag(int constant, boolean useInDecomposition) {
      super(constant, useInDecomposition);
   }

   public LocalFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }
}
