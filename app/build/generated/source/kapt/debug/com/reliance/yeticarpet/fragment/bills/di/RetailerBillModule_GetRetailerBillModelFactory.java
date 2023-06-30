// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.bills.di;

import com.reliance.yeticarpet.app.Webservice;
import com.reliance.yeticarpet.fragment.bills.mvp.RetailerBillModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetailerBillModule_GetRetailerBillModelFactory implements Factory<RetailerBillModel> {
  private final RetailerBillModule module;

  private final Provider<Webservice> webserviceProvider;

  public RetailerBillModule_GetRetailerBillModelFactory(RetailerBillModule module,
      Provider<Webservice> webserviceProvider) {
    this.module = module;
    this.webserviceProvider = webserviceProvider;
  }

  @Override
  public RetailerBillModel get() {
    return getRetailerBillModel(module, webserviceProvider.get());
  }

  public static RetailerBillModule_GetRetailerBillModelFactory create(RetailerBillModule module,
      Provider<Webservice> webserviceProvider) {
    return new RetailerBillModule_GetRetailerBillModelFactory(module, webserviceProvider);
  }

  public static RetailerBillModel getRetailerBillModel(RetailerBillModule instance,
      Webservice webservice) {
    return Preconditions.checkNotNullFromProvides(instance.getRetailerBillModel(webservice));
  }
}