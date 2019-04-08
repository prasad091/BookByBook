package com.prasad.book.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.prasad.book.R;
import com.prasad.book.model.NewBookModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewArrivedBookAdapter extends RecyclerView.Adapter<NewArrivedBookAdapter.NewArrivedViewHolder> {

    private Context context;
    List<NewBookModel> data;
    public NewArrivedBookAdapter(Context context, List<NewBookModel> data){
        this.context = context;
        this.data = data;
    }
    @NonNull
    @Override
    public NewArrivedViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_new_books,viewGroup,false);
        return new NewArrivedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewArrivedViewHolder holder, int pos) {
        NewBookModel newBookModel = data.get(pos);
        holder.authName.setText(newBookModel.getAuthorName());
        holder.bookName.setText(newBookModel.getBookName());
        holder.bookImage.setImageDrawable(context.getDrawable(newBookModel.getImgSrc()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class NewArrivedViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.bookImage)
        ImageView bookImage;
        @BindView(R.id.bookName)
        TextView bookName;
        @BindView(R.id.authName)
        TextView authName;
        public NewArrivedViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
