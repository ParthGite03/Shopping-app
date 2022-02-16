package com.example.shoppingapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shoppingapp.R;
import com.example.shoppingapp.model.Categorynumber1Model;
import com.example.shoppingapp.model.Categorynumber2Model;

import java.util.List;

public class Categorynumber2Adapter extends RecyclerView.Adapter<Categorynumber2Adapter.Categorynumber2ViewHolder> {

    Context context;
    List<Categorynumber2Model> categoryList;

    public Categorynumber2Adapter(Context context, List<Categorynumber2Model> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public Categorynumber2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.categorynumber2_row_items,parent,false);

        return new Categorynumber2ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Categorynumber2ViewHolder holder, int position) {

        holder.categoryImage.setImageResource(categoryList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public static class Categorynumber2ViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;

        public Categorynumber2ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.categoryImage);

        }
    }

}
