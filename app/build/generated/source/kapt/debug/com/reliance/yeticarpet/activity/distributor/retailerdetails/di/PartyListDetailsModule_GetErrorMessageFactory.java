// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.distributor.retailerdetails.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PartyListDetailsModule_GetErrorMessageFactory implements Factory<String> {
  private final PartyListDetailsModule module;

  public PartyListDetailsModule_GetErrorMessageFactory(PartyListDetailsModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return getErrorMessage(module);
  }

  public static PartyListDetailsModule_GetErrorMessageFactory create(
      PartyListDetailsModule module) {
    return new PartyListDetailsModule_GetErrorMessageFactory(module);
  }

  public static String getErrorMessage(PartyListDetailsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getErrorMessage());
  }
}