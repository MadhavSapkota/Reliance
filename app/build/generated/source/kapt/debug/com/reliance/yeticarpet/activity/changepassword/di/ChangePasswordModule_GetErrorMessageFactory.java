// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.changepassword.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChangePasswordModule_GetErrorMessageFactory implements Factory<String> {
  private final ChangePasswordModule module;

  public ChangePasswordModule_GetErrorMessageFactory(ChangePasswordModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static ChangePasswordModule_GetErrorMessageFactory create(ChangePasswordModule module) {
    return new ChangePasswordModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(ChangePasswordModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}