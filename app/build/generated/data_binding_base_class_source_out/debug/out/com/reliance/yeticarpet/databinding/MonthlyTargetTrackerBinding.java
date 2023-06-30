// Generated by view binder compiler. Do not edit!
package com.reliance.yeticarpet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.reliance.yeticarpet.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MonthlyTargetTrackerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView headerTextView;

  @NonNull
  public final ProgressBar idPbar;

  @NonNull
  public final ImageView ivForward;

  @NonNull
  public final RelativeLayout ivForwardButton;

  @NonNull
  public final RelativeLayout llCompleteStatus;

  @NonNull
  public final DashboardRecyclerviewBinding myDashboardTrackerRecylerView;

  @NonNull
  public final DashboardRecyclerviewBinding retailerTrackerRecyclerview;

  @NonNull
  public final RelativeLayout rlHeader;

  @NonNull
  public final RelativeLayout rlHorizontalPercentage;

  @NonNull
  public final RelativeLayout rlMonthlyDetails;

  private MonthlyTargetTrackerBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView headerTextView, @NonNull ProgressBar idPbar, @NonNull ImageView ivForward,
      @NonNull RelativeLayout ivForwardButton, @NonNull RelativeLayout llCompleteStatus,
      @NonNull DashboardRecyclerviewBinding myDashboardTrackerRecylerView,
      @NonNull DashboardRecyclerviewBinding retailerTrackerRecyclerview,
      @NonNull RelativeLayout rlHeader, @NonNull RelativeLayout rlHorizontalPercentage,
      @NonNull RelativeLayout rlMonthlyDetails) {
    this.rootView = rootView;
    this.headerTextView = headerTextView;
    this.idPbar = idPbar;
    this.ivForward = ivForward;
    this.ivForwardButton = ivForwardButton;
    this.llCompleteStatus = llCompleteStatus;
    this.myDashboardTrackerRecylerView = myDashboardTrackerRecylerView;
    this.retailerTrackerRecyclerview = retailerTrackerRecyclerview;
    this.rlHeader = rlHeader;
    this.rlHorizontalPercentage = rlHorizontalPercentage;
    this.rlMonthlyDetails = rlMonthlyDetails;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MonthlyTargetTrackerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MonthlyTargetTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.monthly_target_tracker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MonthlyTargetTrackerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.headerTextView;
      TextView headerTextView = ViewBindings.findChildViewById(rootView, id);
      if (headerTextView == null) {
        break missingId;
      }

      id = R.id.id_pbar;
      ProgressBar idPbar = ViewBindings.findChildViewById(rootView, id);
      if (idPbar == null) {
        break missingId;
      }

      id = R.id.ivForward;
      ImageView ivForward = ViewBindings.findChildViewById(rootView, id);
      if (ivForward == null) {
        break missingId;
      }

      id = R.id.ivForwardButton;
      RelativeLayout ivForwardButton = ViewBindings.findChildViewById(rootView, id);
      if (ivForwardButton == null) {
        break missingId;
      }

      id = R.id.ll_complete_status;
      RelativeLayout llCompleteStatus = ViewBindings.findChildViewById(rootView, id);
      if (llCompleteStatus == null) {
        break missingId;
      }

      id = R.id.my_dashboard_tracker_recyler_view;
      View myDashboardTrackerRecylerView = ViewBindings.findChildViewById(rootView, id);
      if (myDashboardTrackerRecylerView == null) {
        break missingId;
      }
      DashboardRecyclerviewBinding binding_myDashboardTrackerRecylerView = DashboardRecyclerviewBinding.bind(myDashboardTrackerRecylerView);

      id = R.id.retailer_tracker_recyclerview;
      View retailerTrackerRecyclerview = ViewBindings.findChildViewById(rootView, id);
      if (retailerTrackerRecyclerview == null) {
        break missingId;
      }
      DashboardRecyclerviewBinding binding_retailerTrackerRecyclerview = DashboardRecyclerviewBinding.bind(retailerTrackerRecyclerview);

      id = R.id.rlHeader;
      RelativeLayout rlHeader = ViewBindings.findChildViewById(rootView, id);
      if (rlHeader == null) {
        break missingId;
      }

      id = R.id.rlHorizontalPercentage;
      RelativeLayout rlHorizontalPercentage = ViewBindings.findChildViewById(rootView, id);
      if (rlHorizontalPercentage == null) {
        break missingId;
      }

      id = R.id.rl_monthly_details;
      RelativeLayout rlMonthlyDetails = ViewBindings.findChildViewById(rootView, id);
      if (rlMonthlyDetails == null) {
        break missingId;
      }

      return new MonthlyTargetTrackerBinding((RelativeLayout) rootView, headerTextView, idPbar,
          ivForward, ivForwardButton, llCompleteStatus, binding_myDashboardTrackerRecylerView,
          binding_retailerTrackerRecyclerview, rlHeader, rlHorizontalPercentage, rlMonthlyDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}