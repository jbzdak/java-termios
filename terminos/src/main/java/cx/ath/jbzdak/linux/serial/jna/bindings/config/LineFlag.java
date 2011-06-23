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
import cx.ath.jbzdak.common.nativeUtils.MaskedFakeEnum;

/**
 * Created by: Jacek Bzdak
 */
public class LineFlag extends MaskedEnum {

   public static final LineFlag ISIG = new LineFlag(0000001);
   public static final LineFlag ICANON = new LineFlag(0000002);
   public static final LineFlag XCASE = new LineFlag(0000004);
   public static final LineFlag ECHO = new LineFlag(0000010);
   public static final LineFlag ECHOE = new LineFlag(0000020);
   public static final LineFlag ECHOK = new LineFlag(0000040);
   public static final LineFlag ECHONL = new LineFlag(0000100);
   public static final LineFlag NOFLSH = new LineFlag(0000200);
   public static final LineFlag TOSTOP = new LineFlag(0000400);
   public static final LineFlag ECHOCTL = new LineFlag(0001000);
   public static final LineFlag ECHOPRT = new LineFlag(0002000);
   public static final LineFlag ECHOKE = new LineFlag(0004000);
   public static final LineFlag FLUSHO = new LineFlag(0010000);
   public static final LineFlag PENDIN = new LineFlag(0040000);
   public static final LineFlag IEXTEN = new LineFlag(0100000);
   public static final LineFlag EXTPROC = new LineFlag(0200000);

   public static final MaskedFakeEnum<LineFlag> FAKE_ENUM = new MaskedFakeEnum<LineFlag>(LineFlag.class);

   LineFlag(int constant) {
      super(constant);
   }

   LineFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }
}
