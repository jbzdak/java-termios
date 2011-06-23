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

package cx.ath.jbzdak.linux.serial.jna.bindings;

import cx.ath.jbzdak.common.fakeEnum.FakeEnum;
import cx.ath.jbzdak.common.fakeEnum.FakeEnumItem;
import cx.ath.jbzdak.common.nativeUtils.MaskedEnum;

/**
 * Created by: Jacek Bzdak
 */
public class OpenMode extends MaskedEnum{

   public static final OpenMode ACCMODE = new OpenMode(0003);
   public static final OpenMode RDONLY = new OpenMode(00);
   public static final OpenMode WRONLY = new OpenMode(01);
   public static final OpenMode RDWR = new OpenMode(02);
   public static final OpenMode CREAT = new OpenMode(0100);
   public static final OpenMode EXCL = new OpenMode(0200);
   public static final OpenMode NOCTTY = new OpenMode(0400);
   public static final OpenMode TRUNC = new OpenMode(01000);
   public static final OpenMode APPEND = new OpenMode(02000);
   public static final OpenMode NONBLOCK = new OpenMode(04000);
   public static final OpenMode NDELAY = new OpenMode(NONBLOCK);
   public static final OpenMode SYNC = new OpenMode(04010000);
   public static final OpenMode FSYNC = new OpenMode(SYNC);
   public static final OpenMode ASYNC = new OpenMode(020000);

   public static final FakeEnum<OpenMode> FAKE_ENUM = new FakeEnum<OpenMode>(OpenMode.class);


   public OpenMode(int constant) {
      super(constant);
   }

   public OpenMode(MaskedEnum maskedEnum) {
      super(maskedEnum);
   }
}

