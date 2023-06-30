// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.userprofile.di;

import com.reliance.yeticarpet.activity.userprofile.UserProfileActivity;
import com.reliance.yeticarpet.activity.userprofile.UserProfileActivity_MembersInjector;
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileModel;
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfilePresenter;
import com.reliance.yeticarpet.activity.userprofile.mvp.UserProfileView;
import com.reliance.yeticarpet.app.AppComponent;
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerUserProfileComponent implements UserProfileComponent {
  private final UserProfileModule userProfileModule;

  private final AppComponent appComponent;

  private Provider<String> getErrorMessageProvider;

  private Provider<CredentialsErrorDialog> getCredentialsErrorDialogProvider;

  private Provider<UserProfileView> getUserProfileViewProvider;

  private DaggerUserProfileComponent(UserProfileModule userProfileModuleParam,
      AppComponent appComponentParam) {
    this.userProfileModule = userProfileModuleParam;
    this.appComponent = appComponentParam;
    initialize(userProfileModuleParam, appComponentParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  private UserProfileModel userProfileModel() {
    return UserProfileModule_GetUserProfileModelFactory.getUserProfileModel(userProfileModule, Preconditions.checkNotNullFromComponent(appComponent.webservice()));
  }

  private UserProfilePresenter userProfilePresenter() {
    return UserProfileModule_GetSettingPresenterFactory.getSettingPresenter(userProfileModule, userProfileModel(), getUserProfileViewProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final UserProfileModule userProfileModuleParam,
      final AppComponent appComponentParam) {
    this.getErrorMessageProvider = UserProfileModule_GetErrorMessageFactory.create(userProfileModuleParam);
    this.getCredentialsErrorDialogProvider = UserProfileModule_GetCredentialsErrorDialogFactory.create(userProfileModuleParam, getErrorMessageProvider);
    this.getUserProfileViewProvider = DoubleCheck.provider(UserProfileModule_GetUserProfileViewFactory.create(userProfileModuleParam, getCredentialsErrorDialogProvider));
  }

  @Override
  public void inject(UserProfileActivity userProfileActivity) {
    injectUserProfileActivity(userProfileActivity);
  }

  private UserProfileActivity injectUserProfileActivity(UserProfileActivity instance) {
    UserProfileActivity_MembersInjector.injectUserProfileView(instance, getUserProfileViewProvider.get());
    UserProfileActivity_MembersInjector.injectUserProfilePresenter(instance, userProfilePresenter());
    return instance;
  }

  public static final class Builder {
    private UserProfileModule userProfileModule;

    private AppComponent appComponent;

    private Builder() {
    }

    public Builder userProfileModule(UserProfileModule userProfileModule) {
      this.userProfileModule = Preconditions.checkNotNull(userProfileModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }

    public UserProfileComponent build() {
      Preconditions.checkBuilderRequirement(userProfileModule, UserProfileModule.class);
      Preconditions.checkBuilderRequirement(appComponent, AppComponent.class);
      return new DaggerUserProfileComponent(userProfileModule, appComponent);
    }
  }
}
