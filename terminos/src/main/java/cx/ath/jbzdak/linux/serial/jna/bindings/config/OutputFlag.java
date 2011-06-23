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
public class OutputFlag extends MaskedEnum{

   public static final OutputFlag OPOST = new OutputFlag(0000001);
   public static final OutputFlag OLCUC = new OutputFlag(0000002);
   public static final OutputFlag ONLCR = new OutputFlag(0000004);
   public static final OutputFlag OCRNL = new OutputFlag(0000010);
   public static final OutputFlag ONOCR = new OutputFlag(0000020);
   public static final OutputFlag ONLRET = new OutputFlag(0000040);
   public static final OutputFlag OFILL = new OutputFlag(0000100);
   public static final OutputFlag OFDEL = new OutputFlag(0000200);

   public static final MaskedFakeEnum<OutputFlag> FAKE_ENUM = new MaskedFakeEnum<OutputFlag>(OutputFlag.class);

   OutputFlag(int constant) {
      super(constant);
   }

   OutputFlag(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }
}
