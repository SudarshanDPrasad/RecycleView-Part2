package com.example.birdsgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemonClick {
    private RecyclerView recycleviewr;
    private ArrayList<Bird> birdslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidviews();
        buildrecycleview();
        setrecycleview();
    }

    private void setrecycleview() {
        BirdAdapter birdAdapter = new BirdAdapter(birdslist, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recycleviewr.setLayoutManager(gridLayoutManager);
        recycleviewr.setAdapter(birdAdapter);
    }

    private void buildrecycleview() {
        birdslist = new ArrayList<>();
        Bird bird1 = new Bird(R.drawable.parrot, "Parrot");
        birdslist.add(bird1);
        Bird bird2 = new Bird(R.drawable.birds2, "Sparrow");
        birdslist.add(bird2);
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                birdslist.add(bird1);
            } else if (i % 4 == 1) {
                birdslist.add(bird2);
            }
        }
    }

    private void intidviews() {
        recycleviewr = findViewById(R.id.recycleviewr);
    }


    @Override
    public void onClick(Bird bird, int adapterPosition) {
        Toast.makeText(this, bird.getName(), Toast.LENGTH_SHORT).show();
    }
}