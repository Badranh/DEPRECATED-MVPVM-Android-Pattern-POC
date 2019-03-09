package com.proseccommunity.githubexplore.di.modules;


import com.proseccommunity.githubexplore.Dashboard.MainActivity;
import com.proseccommunity.githubexplore.di.submodules.MainSubModules;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainSubModules.class)
    abstract MainActivity bindMainActivity();



}
