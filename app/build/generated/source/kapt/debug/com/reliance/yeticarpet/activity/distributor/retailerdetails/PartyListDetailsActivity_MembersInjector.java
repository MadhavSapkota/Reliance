// Generated by Dagger (https://dagger.dev).
package com.reliance.yeticarpet.activity.distributor.retailerdetails;

import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsPresenter;
import com.reliance.yeticarpet.activity.distributor.retailerdetails.mvp.PartyListDetailsView;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PartyListDetailsActivity_MembersInjector implements MembersInjector<PartyListDetailsActivity> {
  private final Provider<PartyListDetailsView> partyListDetailsViewProvider;

  private final Provider<PartyListDetailsPresenter> partyListDetailsPresenterProvider;

  public PartyListDetailsActivity_MembersInjector(
      Provider<PartyListDetailsView> partyListDetailsViewProvider,
      Provider<PartyListDetailsPresenter> partyListDetailsPresenterProvider) {
    this.partyListDetailsViewProvider = partyListDetailsViewProvider;
    this.partyListDetailsPresenterProvider = partyListDetailsPresenterProvider;
  }

  public static MembersInjector<PartyListDetailsActivity> create(
      Provider<PartyListDetailsView> partyListDetailsViewProvider,
      Provider<PartyListDetailsPresenter> partyListDetailsPresenterProvider) {
    return new PartyListDetailsActivity_MembersInjector(partyListDetailsViewProvider, partyListDetailsPresenterProvider);
  }

  @Override
  public void injectMembers(PartyListDetailsActivity instance) {
    injectPartyListDetailsView(instance, partyListDetailsViewProvider.get());
    injectPartyListDetailsPresenter(instance, partyListDetailsPresenterProvider.get());
  }

  @InjectedFieldSignature("com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity.partyListDetailsView")
  public static void injectPartyListDetailsView(PartyListDetailsActivity instance,
      PartyListDetailsView partyListDetailsView) {
    instance.partyListDetailsView = partyListDetailsView;
  }

  @InjectedFieldSignature("com.reliance.yeticarpet.activity.distributor.retailerdetails.PartyListDetailsActivity.partyListDetailsPresenter")
  public static void injectPartyListDetailsPresenter(PartyListDetailsActivity instance,
      PartyListDetailsPresenter partyListDetailsPresenter) {
    instance.partyListDetailsPresenter = partyListDetailsPresenter;
  }
}