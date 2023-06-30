// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.retailer.bill.di;

import com.reliance.yeticarpet.activity.retailer.bill.RetailerBillActivity;
import com.reliance.yeticarpet.activity.retailer.bill.RetailerBillActivity_MembersInjector;
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillModel;
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillPresenter;
import com.reliance.yeticarpet.activity.retailer.bill.mvp.RetailerBillView;
import com.reliance.yeticarpet.app.AppComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerRetailerBillComponent implements RetailerBillComponent {
  private final RetailerBillModule retailerBillModule;

  private final AppComponent appComponent;

  private Provider<RetailerBillView> getRetailerBillViewProvider;

  private DaggerRetailerBillComponent(RetailerBillModule retailerBillModuleParam,
      AppComponent appComponentParam) {
    this.retailerBillModule = retailerBillModuleParam;
    this.appComponent = appComponentParam;
    initialize(retailerBillModuleParam, appComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  private RetailerBillModel retailerBillModel() {
    return RetailerBillModule_GetRetailerBillModelFactory.getRetailerBillModel(retailerBillModule, Preconditions.checkNotNullFromComponent(appComponent.webservice()));
  }

  private RetailerBillPresenter retailerBillPresenter() {
    return RetailerBillModule_GetRetailerBillPresenterFactory.getRetailerBillPresenter(retailerBillModule, getRetailerBillViewProvider.get(), retailerBillModel());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final RetailerBillModule retailerBillModuleParam,
      final AppComponent appComponentParam) {
    this.getRetailerBillViewProvider = DoubleCheck.provider(RetailerBillModule_GetRetailerBillViewFactory.create(retailerBillModuleParam));
  }

  @Override
  public void inject(RetailerBillActivity retailerBillActivity) {
    injectRetailerBillActivity(retailerBillActivity);
  }

  private RetailerBillActivity injectRetailerBillActivity(RetailerBillActivity instance) {
    RetailerBillActivity_MembersInjector.injectRetailerBillView(instance, getRetailerBillViewProvider.get());
    RetailerBillActivity_MembersInjector.injectRetailerBillPresenter(instance, retailerBillPresenter());
    return instance;
  }

  public static final class Builder {
    private RetailerBillModule retailerBillModule;

    private AppComponent appComponent;

    private Builder() {
    }

    public Builder retailerBillModule(RetailerBillModule retailerBillModule) {
      this.retailerBillModule = Preconditions.checkNotNull(retailerBillModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public RetailerBillComponent build() {
      Preconditions.checkBuilderRequirement(retailerBillModule, RetailerBillModule.class);
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new DaggerRetailerBillComponent(retailerBillModule, appComponent);
    }
  }
}