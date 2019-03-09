package com.proseccommunity.githubexplore.base;

public interface BasePresenter<T> {
    void AssignView(T view);
    void RemoveView();
}
