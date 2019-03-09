package com.proseccommunity.githubexplore.Dashboard.RepositriesList;

import com.proseccommunity.githubexplore.base.BasePresenter;

import javax.inject.Inject;
public class Presenter implements Contract.Presenter, BasePresenter<Contract.View> {

    private Contract.View view;

    @Inject
    public Presenter() {
    }

    @Override
    public int calculate(int a, int b) {
        view.showToast(String.valueOf(a+b));
        return a+b;
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
}
