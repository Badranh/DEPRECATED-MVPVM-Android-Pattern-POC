package com.proseccommunity.githubexplore.data.api;

import com.proseccommunity.githubexplore.data.models.GitHubRepository;

import javax.inject.Inject;

import io.reactivex.Single;

public class DataRepository {

    private GithubService gitService;

    @Inject
    public DataRepository(GithubService gitService) {
        this.gitService = gitService;
    }


    public Single<GitHubRepository> getRepo(String owner, String name) {
        return gitService.getRepos(owner, name);
    }
}
