package com.proseccommunity.githubexplore.Dashboard.RepositriesList;

import com.proseccommunity.githubexplore.data.models.GitHubRepository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

@Singleton
public class RepositiriesViewModel extends ViewModel {


    private final MutableLiveData<List<GitHubRepository>> repos = new MutableLiveData<>();
    private final MutableLiveData<Boolean> gotAnError = new MutableLiveData<>();
    private final MutableLiveData<Boolean> isLoading = new MutableLiveData<>();

    @Inject
    public RepositiriesViewModel() {
    }

    public MutableLiveData<List<GitHubRepository>> getRepos() {
        return repos;
    }

    public MutableLiveData<Boolean> getGotAnError() {
        return gotAnError;
    }

    public MutableLiveData<Boolean> getIsLoading() {
        return isLoading;
    }
}
