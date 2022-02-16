package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shoppingapp.adapter.CategoryAdapter;
import com.example.shoppingapp.adapter.DiscountedProductAdapter;
import com.example.shoppingapp.model.Category;
import com.example.shoppingapp.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView, categoryRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;


    ImageView allCategory;
   ImageView categorynumber1;
    ImageView categoryimage;

    ImageView category1image;
    ImageView category2image;
    ImageView category3image;



//    Button button;
//    Button button2;
//    Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);

        //category1image = findViewById(R.id.category1image);
        //category2image = findViewById(R.id.category2image);
        //category3image = findViewById(R.id.category3image);
        //categorynumber1 = findViewById(R.id.categorynumber1Image);
//        button = findViewById(R.id.button);
//        button2 = findViewById(R.id.button2);
//        button3 = findViewById(R.id.button3);

//        category1image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Categorynumber1.class);
//                startActivity(i);
//            }
//        });

//        category2image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Catagorynumber2.class);
//                startActivity(i);
//            }
//        });

//        category3image.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Categorynumber3.class);
//                startActivity(i);
//            }
//        });


        //categoryimage = findViewById(R.id.categoryImage);

//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Categorynumber1.class);
//                startActivity(i);
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Categorynumber3.class);
//                startActivity(i);
//            }
//        });
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Catagorynumber2.class);
//                startActivity(i);
//            }
//        });

//        categorynumber1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, Categorynumber1.class);
//                startActivity(i);
//            }
//        });



        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AllCategory.class);
                startActivity(i);
            }
        });

// Substitute the images here from drawable to discount
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1,R.drawable.discountproduct1));
        discountedProductsList.add(new DiscountedProducts(2,R.drawable.discountproduct2));
        discountedProductsList.add(new DiscountedProducts(3,R.drawable.discountproduct3));
        discountedProductsList.add(new DiscountedProducts(3,R.drawable.discountproduct4));

         //Substitute the images here from drawable to discount
        categoryList= new ArrayList<>();
        //categoryList.add(new Category(1,R.drawable.farming_tools));
        categoryList.add(new Category(1,R.drawable.category1));
        categoryList.add(new Category(2,R.drawable.category2));
        categoryList.add(new Category(3,R.drawable.category3));


        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);


    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }


}