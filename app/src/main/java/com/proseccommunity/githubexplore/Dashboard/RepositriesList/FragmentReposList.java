package com.proseccommunity.githubexplore.Dashboard.RepositriesList;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.proseccommunity.githubexplore.R;
import com.proseccommunity.githubexplore.base.BaseFragment;
import com.proseccommunity.githubexplore.base.BasePresenter;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;

import javax.inject.Inject;

import androidx.annotation.Nullable;

@ActivityScoped
public class FragmentReposList extends BaseFragment implements Contract.View {

    @Inject
    Contract.Presenter presenter;

    @Override
    public void onResume() {
        super.onResume();
    }

    @Inject
    public FragmentReposList() {
    }

    @Override
    protected int LayoutRes() {
        return R.layout.frag_view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((BasePresenter<Contract.View>) presenter).AssignView(this);
        Log.d("Scopes","frag"+presenter.hashCode());
        presenter.calculate(4,3);
    }

    @Override
    public void showToast(String Message) {
        Toast.makeText(getActivity(),Message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ((BasePresenter<Contract.View>) presenter).RemoveView();

    }
}
