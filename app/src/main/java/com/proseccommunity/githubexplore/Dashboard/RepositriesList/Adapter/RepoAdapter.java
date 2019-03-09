package com.proseccommunity.githubexplore.Dashboard.RepositriesList.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.proseccommunity.githubexplore.Dashboard.RepositriesList.Contract;
import com.proseccommunity.githubexplore.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder>  {


    private Contract.Presenter presenter;

    public RepoAdapter(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            presenter.bindViewHolders(holder,position);
    }

    @Override
    public int getItemCount() {
        return presenter.getDataCount();
    }

    public static final class ViewHolder extends RecyclerView.ViewHolder {
     public TextView Reponame;

         ViewHolder(@NonNull View itemView) {
            super(itemView);
            Reponame = itemView.findViewById(R.id.name);
        }
    }


}
