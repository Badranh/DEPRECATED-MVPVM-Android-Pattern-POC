package com.proseccommunity.githubexplore.data.api;

import com.proseccommunity.githubexplore.data.models.GitHubRepository;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {

    @GET("users/{owner}/repos")
    Single<List<GitHubRepository>> getRepos(@Path("owner") String owner);
}
