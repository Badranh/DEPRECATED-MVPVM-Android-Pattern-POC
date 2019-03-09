package com.proseccommunity.githubexplore.data.models;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GitHubRepository {

    private final long id;
    private final String name;
    private final String desc;
    @SerializedName("stargazers_count")
    private final long stars;
    @SerializedName("forks_count")
    private final long forks;

    public GitHubRepository(long id, String name, String description, long stars, long forks) {
        this.id = id;
        this.name = name;
        this.desc = description;
        this.stars = stars;
        this.forks = forks;
    }

}
