package com.proseccommunity.githubexplore.Dashboard.RepositriesList;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.proseccommunity.githubexplore.Dashboard.RepositriesList.Adapter.RepoAdapter;
import com.proseccommunity.githubexplore.Factories.ViewModelFactory;
import com.proseccommunity.githubexplore.R;
import com.proseccommunity.githubexplore.base.BaseFragment;
import com.proseccommunity.githubexplore.base.BasePresenter;
import com.proseccommunity.githubexplore.di.utils.ActivityScoped;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

@ActivityScoped
public class FragmentReposList extends BaseFragment implements Contract.View {

    @Inject
    ViewModelFactory viewModelFactory;

    @Inject
    ViewModelFactory viewModelFactory2;

    @Inject
    Contract.Presenter presenter;

    @Inject
    RepositiriesViewModel viewModel;

    @Inject
    RepoAdapter repoAdapter ;

    @BindView
   (R.id.recycler) RecyclerView recyclerView;

    @BindView(R.id.loading_view)
    ProgressBar progressBar;

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
        recyclerView.setAdapter(repoAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        observableViewModel();
        presenter.fetchData();
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

    private void observableViewModel() {
        viewModel.getRepos().observe(this, repos -> {
            if(repos != null) {
                Log.d("downlaz","asd");
                repoAdapter.notifyDataSetChanged();
            }
        });

        viewModel.getGotAnError().observe(this, isError -> {
            if (isError != null) if(isError) {
                showToast("Error Loading Repos");
            }
        });

        viewModel.getIsLoading().observe(this, isLoading -> {
            if (isLoading != null) {
                progressBar.setVisibility(isLoading ? View.VISIBLE : View.GONE);
            }
        });
    }
}
