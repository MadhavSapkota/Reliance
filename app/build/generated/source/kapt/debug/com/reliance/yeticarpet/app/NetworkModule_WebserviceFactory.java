// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.app;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_WebserviceFactory implements Factory<Webservice> {
  private final NetworkModule module;

  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_WebserviceFactory(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public Webservice get() {
    return webservice(module, retrofitProvider.get());
  }

  public static NetworkModule_WebserviceFactory create(NetworkModule module,
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_WebserviceFactory(module, retrofitProvider);
  }

  public static Webservice webservice(NetworkModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(instance.webservice(retrofit));
  }
}