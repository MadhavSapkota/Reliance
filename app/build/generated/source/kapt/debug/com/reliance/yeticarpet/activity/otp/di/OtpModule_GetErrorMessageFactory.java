// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.otp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OtpModule_GetErrorMessageFactory implements Factory<String> {
  private final OtpModule module;

  public OtpModule_GetErrorMessageFactory(OtpModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static OtpModule_GetErrorMessageFactory create(OtpModule module) {
    return new OtpModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(OtpModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}
