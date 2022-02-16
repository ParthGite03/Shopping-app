package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.shoppingapp.adapter.Categorynumber1Adapter;
import com.example.shoppingapp.model.Categorynumber1Model;
import com.example.shoppingapp.model.ProductDetailsModel;

import java.util.ArrayList;
import java.util.List;

public class ProductDetails extends AppCompatActivity {

    RecyclerView ProductDetailsRecycler;
    Categorynumber1Adapter ProductDetailsAdapter;

    List<ProductDetailsModel> ProductDetailsModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        ProductDetailsModelList= new ArrayList<>();
        ProductDetailsModelList.add(new ProductDetailsModel(1,R.drawable.cat1_1));
        ProductDetailsModelList.add(new ProductDetailsModel(2,R.drawable.cat1_2));
        ProductDetailsModelList.add(new ProductDetailsModel(3,R.drawable.cat1_3));
        ProductDetailsModelList.add(new ProductDetailsModel(4,R.drawable.cat1_4));
        ProductDetailsModelList.add(new ProductDetailsModel(5,R.drawable.cat1_5));
        ProductDetailsModelList.add(new ProductDetailsModel(6,R.drawable.cat1_6));
        ProductDetailsModelList.add(new ProductDetailsModel(7,R.drawable.cat1_7));
        ProductDetailsModelList.add(new ProductDetailsModel(8,R.drawable.cat1_8));
        ProductDetailsModelList.add(new ProductDetailsModel(9,R.drawable.cat1_9));
        ProductDetailsModelList.add(new ProductDetailsModel(10,R.drawable.cat1_10));
        ProductDetailsModelList.add(new ProductDetailsModel(11,R.drawable.cat1_11));
        ProductDetailsModelList.add(new ProductDetailsModel(12,R.drawable.cat1_12));

        setCategoryRecycler(ProductDetailsModelList);


    }

    private void setCategoryRecycler(List<ProductDetailsModel> ProductDetailsModelList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        ProductDetailsRecycler.setLayoutManager(layoutManager);
        ProductDetailsAdapter = new ProductDetailsAdapter(this,ProductDetailsModelList);
        ProductDetailsRecycler.setAdapter(ProductDetailsAdapter);
    }
}
