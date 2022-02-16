package com.example.shoppingapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.R;
import com.example.shoppingapp.model.Categorynumber2Model;
import com.example.shoppingapp.model.Categorynumber3Model;

import java.util.List;

public class Categorynumber3Adapter extends RecyclerView.Adapter<Categorynumber3Adapter.Categorynumber3ViewHolder> {

    Context context;
    List<Categorynumber3Model> categoryList;

    public Categorynumber3Adapter(Context context, List<Categorynumber3Model> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public Categorynumber3ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.categorynumber3_row_items,parent,false);

        return new Categorynumber3ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Categorynumber3ViewHolder holder, int position) {

        holder.categoryImage.setImageResource(categoryList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public static class Categorynumber3ViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;

        public Categorynumber3ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.categoryImage);

        }
    }

}
