package com.proseccommunity.githubexplore.di.modules;


import com.proseccommunity.githubexplore.Dashboard.RepositriesList.RepositiriesViewModel;
import com.proseccommunity.githubexplore.Factories.ViewModelFactory;
import com.proseccommunity.githubexplore.di.utils.ViewModelKey;

import javax.inject.Singleton;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

//it should be singleton in all app life cycle !

@Module
public abstract class ViewModelModule {
    //insert all ViewModels Here as an abstract method
    //Binds Annotation
    //don't forget to insert the factory
    // type should be the base and in parameter the Impl of class


    @Singleton
    @Binds
    @IntoMap
    @ViewModelKey(RepositiriesViewModel.class)
    abstract ViewModel bindRepoViewMode(RepositiriesViewModel repositiriesViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

}
