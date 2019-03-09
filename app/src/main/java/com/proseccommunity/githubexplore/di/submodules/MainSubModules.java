package com.proseccommunity.githubexplore.di.submodules;

import com.proseccommunity.githubexplore.Dashboard.Contract;
import com.proseccommunity.githubexplore.Dashboard.MyFragment;
import com.proseccommunity.githubexplore.Dashboard.Presenter;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;
import com.proseccommunity.githubexplore.di.utils.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;


@Module
public abstract class MainSubModules {

    @ActivityScoped
    @Binds
    abstract Contract.Presenter
    MainPresenter(Presenter presenter);


    @ContributesAndroidInjector
    abstract MyFragment myFragment();






}
