// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.setting.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingModule_GetErrorMessageFactory implements Factory<String> {
  private final SettingModule module;

  public SettingModule_GetErrorMessageFactory(SettingModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static SettingModule_GetErrorMessageFactory create(SettingModule module) {
    return new SettingModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(SettingModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}
