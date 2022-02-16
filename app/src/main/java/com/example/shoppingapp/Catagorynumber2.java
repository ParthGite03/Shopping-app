package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.shoppingapp.adapter.Categorynumber1Adapter;
import com.example.shoppingapp.adapter.Categorynumber2Adapter;
import com.example.shoppingapp.model.Categorynumber1Model;
import com.example.shoppingapp.model.Categorynumber2Model;

import java.util.ArrayList;
import java.util.List;

public class Catagorynumber2 extends AppCompatActivity {

    RecyclerView categorynumber2Recycler;
    Categorynumber2Adapter categorynumber2Adapter;
    ImageView back2;

    List<Categorynumber2Model> categorynumber2ModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagorynumber2);

        categorynumber2Recycler = findViewById(R.id.categorynumber2);
        back2 = findViewById(R.id.back2);


        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Catagorynumber2.this, AllCategory.class);
                startActivity(back);
                finish();
            }
        });


// Substitute the images here from drawable to discount
        categorynumber2ModelList= new ArrayList<>();
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_1));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_2));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_3));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_4));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_5));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_6));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_7));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_8));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_9));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_10));
        categorynumber2ModelList.add(new Categorynumber2Model(1,R.drawable.cat2_11));

    setCategoryRecycler(categorynumber2ModelList);



}

    private void setCategoryRecycler(List<Categorynumber2Model> categorynumber1ModelList) {
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        categorynumber2Recycler.setLayoutManager(layoutManager);
        categorynumber2Adapter = new Categorynumber2Adapter(this,categorynumber2ModelList);
        categorynumber2Recycler.setAdapter(categorynumber2Adapter);
    }
}