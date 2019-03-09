package com.proseccommunity.githubexplore.data.api;

import com.proseccommunity.githubexplore.data.models.GitHubRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class DataRepository {

    private GithubService gitService;

    @Inject
    public DataRepository(GithubService gitService) {
        this.gitService = gitService;
    }


    public Single<List<GitHubRepository>> getRepo(String owner) {
        return gitService.getRepos(owner);
    }
}
