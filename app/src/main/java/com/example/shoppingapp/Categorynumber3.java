package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shoppingapp.adapter.Categorynumber1Adapter;
import com.example.shoppingapp.model.Categorynumber1Model;

import java.util.ArrayList;
import java.util.List;

public class Categorynumber3 extends AppCompatActivity {

    RecyclerView categorynumber3Recycler;
    Categorynumber1Adapter categorynumber3Adapter;
    ImageView back3;

    List<Categorynumber1Model> categorynumber3ModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorynumber3);

        categorynumber3Recycler = findViewById(R.id.categorynumber3);
        back3 = findViewById(R.id.back3);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Categorynumber3.this, AllCategory.class);
                startActivity(back);
                finish();
            }
        });

        // Substitute the images here from drawable to discount
        categorynumber3ModelList = new ArrayList<>();
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_1));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_2));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_3));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_4));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_5));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_6));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_7));
        categorynumber3ModelList.add(new Categorynumber1Model(1, R.drawable.cat3_8));

        setCategoryRecycler(categorynumber3ModelList);

    }

    private void setCategoryRecycler(List<Categorynumber1Model> categorynumber1ModelList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        categorynumber3Recycler.setLayoutManager(layoutManager);
        categorynumber3Adapter = new Categorynumber1Adapter(this, categorynumber1ModelList);
        categorynumber3Recycler.setAdapter(categorynumber3Adapter);
    }
}