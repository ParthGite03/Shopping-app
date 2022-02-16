package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shoppingapp.adapter.AllCategoryAdapter;
import com.example.shoppingapp.adapter.CategoryAdapter;
import com.example.shoppingapp.model.AllCategoryModel;
import com.example.shoppingapp.model.Category;

import java.util.ArrayList;
import java.util.List;

public  class AllCategory extends AppCompatActivity {

    RecyclerView AllCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategoryModel> allCategoryModelList;

    ImageView back;
    ImageView categorynum1;
    ImageView Hello;
   // Button button;
    ImageView cat1;
    ImageView cat2;
    ImageView cat3;
   // Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        AllCategoryRecycler = findViewById(R.id.all_category);
        back = findViewById(R.id.back);
        categorynum1 = findViewById(R.id.categoryImage);
        //button = findViewById(R.id.button);
        cat1 = findViewById(R.id.cat1);
        cat2 = findViewById(R.id.cat2);
        cat3 = findViewById(R.id.cat3);
       // Hello = findViewById(R.id.hello);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i =new Intent(AllCategory.this , Categorynumber1.class);
//                startActivity(i);
//            }
//        });
        cat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AllCategory.this, Categorynumber1.class);
                startActivity(back);
                finish();
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AllCategory.this, Catagorynumber2.class);
                startActivity(back);
                finish();
            }
        });

        cat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AllCategory.this, Categorynumber3.class);
                startActivity(back);
                finish();
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(AllCategory.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent back = new Intent(AllCategory.this, Categorynumber3.class);
//                startActivity(back);
//                finish();
//            }
//        });

//        categorynum1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(AllCategory.this, Categorynumber1.class);
//                startActivity(i);
//                finish();
//
//            }
//        });
//        Hello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent back = new Intent(AllCategory.this, Categorynumber1.class);
//                startActivity(back);
//                finish();
//            }
//        });

        allCategoryModelList= new ArrayList<>();
        allCategoryModelList.add(new AllCategoryModel(1,R.drawable.farming_tools));

        setCategoryRecycler(allCategoryModelList);


    }

    private void setCategoryRecycler(List<AllCategoryModel> allcategoryModelList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,3);
        AllCategoryRecycler.setLayoutManager(layoutManager);
        allCategoryAdapter = new AllCategoryAdapter(this,allcategoryModelList);
        AllCategoryRecycler.setAdapter(allCategoryAdapter);
    }
}