package com.proseccommunity.githubexplore.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.support.DaggerFragment;

public abstract class BaseFragment extends DaggerFragment {

    private Unbinder unbinder;
    private AppCompatActivity activity;

    @LayoutRes
    protected abstract int LayoutRes();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        assert container != null;
        View view  =  LayoutInflater.from(container.getContext()).inflate(LayoutRes(),container,false);
        unbinder = ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (AppCompatActivity) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        activity = null;
    }
    public AppCompatActivity getBaseActivity() {
        return activity;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if(unbinder!=null){
            unbinder.unbind();
            unbinder = null;
        }
    }
}
