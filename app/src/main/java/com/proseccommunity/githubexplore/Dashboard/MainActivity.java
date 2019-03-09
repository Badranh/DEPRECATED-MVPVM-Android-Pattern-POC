package com.proseccommunity.githubexplore.Dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.proseccommunity.githubexplore.R;
import com.proseccommunity.githubexplore.base.BaseActivity;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;
import com.proseccommunity.githubexplore.di.utils.FragmentScoped;

import javax.inject.Inject;

import dagger.Lazy;


public class MainActivity extends BaseActivity  {

    @Override
    protected int LayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LayoutRes());


    }



}
