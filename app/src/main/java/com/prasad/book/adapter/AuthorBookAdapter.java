package com.prasad.book.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.prasad.book.R;
import com.prasad.book.model.AuthorModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AuthorBookAdapter extends RecyclerView.Adapter<AuthorBookAdapter.AuthorViewHolder> {

    private Context context;
    private List<AuthorModel> data;
    public AuthorBookAdapter(Context context, List<AuthorModel> data){
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_author,viewGroup,false);
        return new AuthorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder holder, int pos) {
        Glide.with(context)
                .load(data.get(pos).getImgSrc())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.authImage);
        holder.authName.setText(data.get(pos).getAuthorName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class AuthorViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.authImage)
        ImageView authImage;
        @BindView(R.id.authName)
        TextView authName;
        public AuthorViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
