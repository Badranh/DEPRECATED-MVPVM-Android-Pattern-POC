package com.proseccommunity.githubexplore.data.api;

import com.proseccommunity.githubexplore.data.models.GitHubRepository;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {

    @GET("repos/{owner}/{name}")
    Single<GitHubRepository> getRepos(@Path("owner") String owner, @Path("name") String name);}
