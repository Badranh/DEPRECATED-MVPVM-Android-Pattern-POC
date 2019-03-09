package com.proseccommunity.githubexplore.Dashboard;

import android.os.Bundle;
import com.proseccommunity.githubexplore.Dashboard.RepositriesList.FragmentReposList;
import com.proseccommunity.githubexplore.R;
import com.proseccommunity.githubexplore.base.BaseActivity;



public class MainActivity extends BaseActivity  {

    @Override
    protected int LayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LayoutRes());

        getSupportFragmentManager().beginTransaction().replace(R.id.content,new FragmentReposList()).commit();

    }



}
