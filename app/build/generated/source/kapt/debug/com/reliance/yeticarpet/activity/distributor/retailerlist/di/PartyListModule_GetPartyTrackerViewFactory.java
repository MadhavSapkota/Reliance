// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.distributor.retailerlist.di;

import com.reliance.yeticarpet.activity.distributor.retailerlist.adapter.PartyListAdapter;
import com.reliance.yeticarpet.activity.distributor.retailerlist.mvp.PartyListView;
import com.reliance.yeticarpet.dialog.CredentialsErrorDialog;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PartyListModule_GetPartyTrackerViewFactory implements Factory<PartyListView> {
  private final PartyListModule module;

  private final Provider<CredentialsErrorDialog> loginErrorDialogProvider;

  private final Provider<PartyListAdapter> partyListAdapterProvider;

  public PartyListModule_GetPartyTrackerViewFactory(PartyListModule module,
      Provider<CredentialsErrorDialog> loginErrorDialogProvider,
      Provider<PartyListAdapter> partyListAdapterProvider) {
    this.module = module;
    this.loginErrorDialogProvider = loginErrorDialogProvider;
    this.partyListAdapterProvider = partyListAdapterProvider;
  }

  @Override
  public PartyListView get() {
    return getPartyTrackerView(module, loginErrorDialogProvider.get(), partyListAdapterProvider.get());
  }

  public static PartyListModule_GetPartyTrackerViewFactory create(PartyListModule module,
      Provider<CredentialsErrorDialog> loginErrorDialogProvider,
      Provider<PartyListAdapter> partyListAdapterProvider) {
    return new PartyListModule_GetPartyTrackerViewFactory(module, loginErrorDialogProvider, partyListAdapterProvider);
  }

  public static PartyListView getPartyTrackerView(PartyListModule instance,
      CredentialsErrorDialog loginErrorDialog, PartyListAdapter partyListAdapter) {
    return Preconditions.checkNotNullFromProvides(instance.getPartyTrackerView(loginErrorDialog, partyListAdapter));
  }
}