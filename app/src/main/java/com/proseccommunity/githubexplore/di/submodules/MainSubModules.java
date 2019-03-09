package com.proseccommunity.githubexplore.di.submodules;

import com.proseccommunity.githubexplore.Dashboard.RepositriesList.Contract;
import com.proseccommunity.githubexplore.Dashboard.RepositriesList.FragmentReposList;
import com.proseccommunity.githubexplore.Dashboard.RepositriesList.Presenter;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;
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
    abstract FragmentReposList myFragment();


}
