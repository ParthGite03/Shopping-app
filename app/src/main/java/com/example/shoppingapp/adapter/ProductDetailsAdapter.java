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
import com.example.shoppingapp.model.ProductDetailsModel;

import java.util.List;

public class ProductDetailsAdapter extends RecyclerView.Adapter<ProductDetailsAdapter.ProductDetailsViewHolder> {

    Context context;
    List<ProductDetailsModel> categoryList;

    public ProductDetailsAdapter (Context context, List<ProductDetailsModel> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public ProductDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.productdetails_row_items,parent,false);

        return new ProductDetailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductDetailsViewHolder holder, int position) {

        holder.categoryImage.setImageResource(categoryList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public static class ProductDetailsViewHolder extends RecyclerView.ViewHolder{

        ImageView categoryImage;

        public ProductDetailsViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage = itemView.findViewById(R.id.categoryImage);

        }
    }

}
