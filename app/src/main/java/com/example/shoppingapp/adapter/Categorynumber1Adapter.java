package com.example.shoppingapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.Categorynumber1;
import com.example.shoppingapp.R;
import com.example.shoppingapp.model.Category;
import com.example.shoppingapp.model.Categorynumber1Model;

import java.util.List;

public class Categorynumber1Adapter extends RecyclerView.Adapter<Categorynumber1Adapter.Categorynumber1ViewHolder> {

    Context context;
    List<Categorynumber1Model> categoryList;

    public Categorynumber1Adapter(Context context, List<Categorynumber1Model> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public Categorynumber1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.categorynumber1_row_items,parent,false);

        return new Categorynumber1ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Categorynumber1ViewHolder holder, int position) {

        holder.categoryImage.setImageResource(categoryList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public static class Categorynumber1ViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;

        public Categorynumber1ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.categoryImage);

        }
    }

}
