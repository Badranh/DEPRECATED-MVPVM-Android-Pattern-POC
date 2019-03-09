package com.proseccommunity.githubexplore.Dashboard.RepositriesList;

import com.proseccommunity.githubexplore.Dashboard.RepositriesList.Adapter.RepoAdapter;

public interface Contract {

    interface View{
        void showToast(String Message);
    }

    interface Presenter{
        void fetchData();
        void bindViewHolders(RepoAdapter.ViewHolder holder,int pos);
        int getDataCount();
    }
}
