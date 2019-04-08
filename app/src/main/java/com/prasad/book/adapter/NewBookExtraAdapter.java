package com.prasad.book.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prasad.book.R;

import butterknife.ButterKnife;

public class NewBookExtraAdapter extends RecyclerView.Adapter<NewBookExtraAdapter.NewBookExtraViewHolder> {

    private Context context;
    public NewBookExtraAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public NewBookExtraViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_newbook_extra,viewGroup,false);
        return new NewBookExtraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewBookExtraViewHolder newBookExtraViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class NewBookExtraViewHolder extends RecyclerView.ViewHolder{

        public NewBookExtraViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
