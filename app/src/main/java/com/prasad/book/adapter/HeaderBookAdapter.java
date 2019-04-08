package com.prasad.book.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.prasad.book.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HeaderBookAdapter extends RecyclerView.Adapter<HeaderBookAdapter.ProjectViewHolder> {
    private Context context;

    public HeaderBookAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_book_header, viewGroup, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ProjectViewHolder extends RecyclerView.ViewHolder {


        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
