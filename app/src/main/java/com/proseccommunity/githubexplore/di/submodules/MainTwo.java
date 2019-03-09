package com.proseccommunity.githubexplore.di.submodules;
import com.proseccommunity.githubexplore.Dashboard.Contract;
import com.proseccommunity.githubexplore.Dashboard.Presenter;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class MainTwo {

    @Binds
    abstract Contract.Presenter
    MainPresenter(Presenter presenter);


}
