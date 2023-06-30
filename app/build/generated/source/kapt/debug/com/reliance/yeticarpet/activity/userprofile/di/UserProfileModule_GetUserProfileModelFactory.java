// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.userprofile.di;

import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileModel;
import com.reliance.yeticarpet.app.Webservice;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserProfileModule_GetUserProfileModelFactory implements Factory<UserProfileModel> {
  private final UserProfileModule module;

  private final Provider<Webservice> webserviceProvider;

  public UserProfileModule_GetUserProfileModelFactory(UserProfileModule module,
      Provider<Webservice> webserviceProvider) {
    this.module = module;
    this.webserviceProvider = webserviceProvider;
  }

  @Override
  public UserProfileModel get() {
    return getUserProfileModel(module, webserviceProvider.get());
  }

  public static UserProfileModule_GetUserProfileModelFactory create(UserProfileModule module,
      Provider<Webservice> webserviceProvider) {
    return new UserProfileModule_GetUserProfileModelFactory(module, webserviceProvider);
  }

  public static UserProfileModel getUserProfileModel(UserProfileModule instance,
      Webservice webservice) {
    return Preconditions.checkNotNullFromProvides(instance.getUserProfileModel(webservice));
  }
}
