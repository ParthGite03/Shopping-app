package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shoppingapp.adapter.CategoryAdapter;
import com.example.shoppingapp.adapter.Categorynumber1Adapter;
import com.example.shoppingapp.model.Category;
import com.example.shoppingapp.model.Categorynumber1Model;

import java.util.ArrayList;
import java.util.List;

public class Categorynumber1 extends AppCompatActivity {

    RecyclerView categorynumber1Recycler;
    Categorynumber1Adapter categorynumber1Adapter;
    ImageView back1;
    ImageView cat1_1;

    List<Categorynumber1Model> categorynumber1ModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorynumber1);

        categorynumber1Recycler = findViewById(R.id.categorynumber1);
        back1 = findViewById(R.id.back1);
        cat1_1 = findViewById(R.id.cat1_1);


        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Categorynumber1.this, AllCategory.class);
                startActivity(back);
                finish();
            }
        });

        cat1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Categorynumber1.this, ProductDetails.class);
                startActivity(i);
                finish();
            }
        });

        // Substitute the images here from drawable to discount
        categorynumber1ModelList= new ArrayList<>();
        categorynumber1ModelList.add(new Categorynumber1Model(1,R.drawable.cat1_1));
        categorynumber1ModelList.add(new Categorynumber1Model(2,R.drawable.cat1_2));
        categorynumber1ModelList.add(new Categorynumber1Model(3,R.drawable.cat1_3));
        categorynumber1ModelList.add(new Categorynumber1Model(4,R.drawable.cat1_4));
        categorynumber1ModelList.add(new Categorynumber1Model(5,R.drawable.cat1_5));
        categorynumber1ModelList.add(new Categorynumber1Model(6,R.drawable.cat1_6));
        categorynumber1ModelList.add(new Categorynumber1Model(7,R.drawable.cat1_7));
        categorynumber1ModelList.add(new Categorynumber1Model(8,R.drawable.cat1_8));
        categorynumber1ModelList.add(new Categorynumber1Model(9,R.drawable.cat1_9));
        categorynumber1ModelList.add(new Categorynumber1Model(10,R.drawable.cat1_10));
        categorynumber1ModelList.add(new Categorynumber1Model(11,R.drawable.cat1_11));
        categorynumber1ModelList.add(new Categorynumber1Model(12,R.drawable.cat1_12));

        setCategoryRecycler(categorynumber1ModelList);



    }

    private void setCategoryRecycler(List<Categorynumber1Model> categorynumber1ModelList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
        categorynumber1Recycler.setLayoutManager(layoutManager);
        categorynumber1Adapter = new Categorynumber1Adapter(this,categorynumber1ModelList);
        categorynumber1Recycler.setAdapter(categorynumber1Adapter);
    }
}