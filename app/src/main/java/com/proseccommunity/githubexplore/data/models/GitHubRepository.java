package com.proseccommunity.githubexplore.data.models;
import com.google.gson.annotations.SerializedName;

public class GitHubRepository {

    public final long id;
    public final String name;
    public final String desc;
    public final GitUser owner;
    @SerializedName("stargazers_count")
    public final long stars;
    @SerializedName("forks_count")
    public final long forks;

    public GitHubRepository(long id, String name, String description, GitUser owner, long stars, long forks) {
        this.id = id;
        this.name = name;
        this.desc = description;
        this.owner = owner;
        this.stars = stars;
        this.forks = forks;
    }
}
