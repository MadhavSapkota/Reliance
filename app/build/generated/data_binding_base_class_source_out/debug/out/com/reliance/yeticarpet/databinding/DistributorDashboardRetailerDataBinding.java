// Generated by view binder compiler. Do not edit!
package com.reliance.yeticarpet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.reliance.yeticarpet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DistributorDashboardRetailerDataBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView tvRetailerAmount;

  @NonNull
  public final TextView tvRetailerName;

  private DistributorDashboardRetailerDataBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView cardView, @NonNull TextView tvRetailerAmount,
      @NonNull TextView tvRetailerName) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.tvRetailerAmount = tvRetailerAmount;
    this.tvRetailerName = tvRetailerName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DistributorDashboardRetailerDataBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DistributorDashboardRetailerDataBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.distributor_dashboard_retailer_data, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DistributorDashboardRetailerDataBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.tv_retailer_amount;
      TextView tvRetailerAmount = ViewBindings.findChildViewById(rootView, id);
      if (tvRetailerAmount == null) {
        break missingId;
      }

      id = R.id.tv_retailer_name;
      TextView tvRetailerName = ViewBindings.findChildViewById(rootView, id);
      if (tvRetailerName == null) {
        break missingId;
      }

      return new DistributorDashboardRetailerDataBinding((RelativeLayout) rootView, cardView,
          tvRetailerAmount, tvRetailerName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
