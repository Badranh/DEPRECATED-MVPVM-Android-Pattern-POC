package com.proseccommunity.githubexplore.di.modules;


import javax.inject.Singleton;

import dagger.Module;

//it should be singleton in all app life cycle !

@Module
@Singleton
public abstract class ViewModelModule {
    //insert all ViewModels Here as an abstract method
    //Binds Annotation
    //don't forget to insert the factory

}
