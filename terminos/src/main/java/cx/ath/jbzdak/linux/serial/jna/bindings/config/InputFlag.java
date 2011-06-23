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

import cx.ath.jbzdak.common.fakeEnum.FakeEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;
import cx.ath.jbzdak.common.nativeUtils.MaskedFakeEnum;

/**
 * Created by: Jacek Bzdak
 */
public class InputFlag extends MaskedEnum{

   public static final InputFlag IGNBRK = new InputFlag(0000001);
   public static final InputFlag BRKINT = new InputFlag(0000002);
   public static final InputFlag IGNPAR = new InputFlag(0000004);
   public static final InputFlag PARMRK = new InputFlag(0000010);
   public static final InputFlag INPCK = new InputFlag(0000020);
   public static final InputFlag ISTRIP = new InputFlag(0000040);
   public static final InputFlag INLCR = new InputFlag(0000100);
   public static final InputFlag IGNCR = new InputFlag(0000200);
   public static final InputFlag ICRNL = new InputFlag(0000400);
   public static final InputFlag IUCLC = new InputFlag(0001000);
   public static final InputFlag IXON = new InputFlag(0002000);
   public static final InputFlag IXANY = new InputFlag(0004000);
   public static final InputFlag IXOFF = new InputFlag(0010000);
   public static final InputFlag IMAXBEL = new InputFlag(0020000);
   public static final InputFlag IUTF8 = new InputFlag(0040000);


   public static final MaskedFakeEnum<InputFlag> FAKE_ENUM = new MaskedFakeEnum<InputFlag>(InputFlag.class);

   InputFlag(int constant) {
      super(constant);
   }

   InputFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }

   @Override
   public String toString() {
      return FAKE_ENUM.nameOf(this);
   }
}
