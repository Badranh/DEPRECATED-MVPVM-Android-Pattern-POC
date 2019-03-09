package com.proseccommunity.githubexplore.Dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.proseccommunity.githubexplore.R;
import com.proseccommunity.githubexplore.base.BaseActivity;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;

import javax.inject.Inject;

public class Main2Activity extends BaseActivity {

    @Inject
    Contract.Presenter presenter;

    @Inject
    Contract.Presenter presenter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LayoutRes());

        Log.d("scopes","2nd Act "+ presenter.hashCode() + "pres 2 " + presenter2.hashCode());
    }

    @Override
    protected int LayoutRes() {
        return R.layout.activity_main2;
    }
}
