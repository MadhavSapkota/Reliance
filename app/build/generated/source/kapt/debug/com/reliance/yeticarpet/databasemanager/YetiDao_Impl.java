package com.reliance.yeticarpet.databasemanager;

import androidx.room.RoomDatabase;
import java.lang.Class;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class YetiDao_Impl implements YetiDao {
  private final RoomDatabase __db;

  public YetiDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
