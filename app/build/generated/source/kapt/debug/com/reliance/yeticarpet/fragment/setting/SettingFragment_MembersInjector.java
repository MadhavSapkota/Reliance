// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.fragment.setting;

import com.reliance.yeticarpet.fragment.setting.mvp.SettingPresenter;
import com.reliance.yeticarpet.fragment.setting.mvp.SettingView;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingFragment_MembersInjector implements MembersInjector<SettingFragment> {
  private final Provider<SettingView> settingViewProvider;

  private final Provider<SettingPresenter> settingPresenterProvider;

  public SettingFragment_MembersInjector(Provider<SettingView> settingViewProvider,
      Provider<SettingPresenter> settingPresenterProvider) {
    this.settingViewProvider = settingViewProvider;
    this.settingPresenterProvider = settingPresenterProvider;
  }

  public static MembersInjector<SettingFragment> create(Provider<SettingView> settingViewProvider,
      Provider<SettingPresenter> settingPresenterProvider) {
    return new SettingFragment_MembersInjector(settingViewProvider, settingPresenterProvider);
  }

  @Override
  public void injectMembers(SettingFragment instance) {
    injectSettingView(instance, settingViewProvider.get());
    injectSettingPresenter(instance, settingPresenterProvider.get());
  }

  @InjectedFieldSignature("com.reliance.yeticarpet.fragment.setting.SettingFragment.settingView")
  public static void injectSettingView(SettingFragment instance, SettingView settingView) {
    instance.settingView = settingView;
  }

  @InjectedFieldSignature("com.reliance.yeticarpet.fragment.setting.SettingFragment.settingPresenter")
  public static void injectSettingPresenter(SettingFragment instance,
      SettingPresenter settingPresenter) {
    instance.settingPresenter = settingPresenter;
  }
}