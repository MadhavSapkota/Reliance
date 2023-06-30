// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.login.di;

import com.reliance.yeticarpet.activity.login.mvp.LoginModel;
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
public final class LoginModule_GetLoginModelFactory implements Factory<LoginModel> {
  private final LoginModule module;

  private final Provider<Webservice> webserviceProvider;

  public LoginModule_GetLoginModelFactory(LoginModule module,
      Provider<Webservice> webserviceProvider) {
    this.module = module;
    this.webserviceProvider = webserviceProvider;
  }

  @Override
  public LoginModel get() {
    return getLoginModel(module, webserviceProvider.get());
  }

  public static LoginModule_GetLoginModelFactory create(LoginModule module,
      Provider<Webservice> webserviceProvider) {
    return new LoginModule_GetLoginModelFactory(module, webserviceProvider);
  }

  public static LoginModel getLoginModel(LoginModule instance, Webservice webservice) {
    return Preconditions.checkNotNullFromProvides(instance.getLoginModel(webservice));
  }
}