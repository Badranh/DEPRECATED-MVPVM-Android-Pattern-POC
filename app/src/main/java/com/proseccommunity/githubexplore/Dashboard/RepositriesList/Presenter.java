package com.proseccommunity.githubexplore.Dashboard.RepositriesList;

import android.annotation.SuppressLint;
import android.util.Log;

import com.proseccommunity.githubexplore.Dashboard.RepositriesList.Adapter.RepoAdapter;
import com.proseccommunity.githubexplore.base.BasePresenter;
import com.proseccommunity.githubexplore.data.api.DataRepository;
import com.proseccommunity.githubexplore.data.models.GitHubRepository;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;
import java.util.List;
import java.util.Objects;

import javax.inject.Inject;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

@ActivityScoped
public class Presenter implements Contract.Presenter, BasePresenter<Contract.View> {

    @Inject
    RepositiriesViewModel viewModel;

    @Inject
    DataRepository dataRepository;

    CompositeDisposable disposable = new CompositeDisposable();

    private Contract.View view;

    @Inject
    public Presenter(RepositiriesViewModel viewModel) {
        this.viewModel = viewModel;
    }




    @Override
    public void AssignView(Contract.View view) {
        this.view = view;
    }

    @Override
    public void RemoveView() {
        if(view !=null)
            view = null;
    }

    @SuppressLint("CheckResult")
    @Override
    public void fetchData() {
        viewModel.getIsLoading().setValue(true);
        disposable.add(dataRepository.getRepo("badranH").subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribeWith(new DisposableSingleObserver<List<GitHubRepository>>() {
                    @Override
                    public void onSuccess(List<GitHubRepository> value) {
                        viewModel.getRepos().setValue(value);
                        viewModel.getGotAnError().setValue(false);
                        viewModel.getIsLoading().setValue(false);
                    }

                    @Override
                    public void onError(Throwable e) {
                        viewModel.getGotAnError().setValue(true);
                        viewModel.getIsLoading().setValue(false);
                    }
                }));
    }

    @Override
    public void bindViewHolders(RepoAdapter.ViewHolder holder, int pos) {
        if(viewModel.getRepos().getValue()!=null && holder.Reponame !=null)
            holder.Reponame.setText(viewModel.getRepos().getValue().get(pos).name);
    }

    @Override
    public int getDataCount() {
        return viewModel.getRepos().getValue() == null ? 0 : viewModel.getRepos().getValue().size();
    }
}
