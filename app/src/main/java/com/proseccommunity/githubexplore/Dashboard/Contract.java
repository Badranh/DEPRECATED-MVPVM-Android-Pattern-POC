package com.proseccommunity.githubexplore.Dashboard;

public interface Contract {

    interface View{
        void showToast(String Message);
    }

    interface Presenter{
        int calculate(int a, int b);
    }
}
