package com.proseccommunity.githubexplore.di.component;


import android.app.Application;

import com.proseccommunity.githubexplore.base.BaseApplication;
import com.proseccommunity.githubexplore.di.modules.ActivityBindingModule;
import com.proseccommunity.githubexplore.di.modules.ApplicationModule;
import com.proseccommunity.githubexplore.di.modules.ViewModelModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        ViewModelModule.class,
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent  extends AndroidInjector<BaseApplication> {


    @Component.Builder
    interface Builder{

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
