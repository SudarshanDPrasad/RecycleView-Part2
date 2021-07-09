package com.example.birdsgridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BIrdHOlder> {
    private ArrayList<Bird> birds;
    private ItemonClick itemonClick;

    public BirdAdapter(ArrayList<Bird> birdslist,ItemonClick itemonClick) {
        this.birds = birdslist;
        this.itemonClick = itemonClick;
    }

    @NonNull
    @Override
    public BIrdHOlder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new BIrdHOlder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BIrdHOlder holder, int position) {
        Bird bird = birds.get(position);
        holder.setData(bird,itemonClick);
    }

    @Override
    public int getItemCount() {
        return birds.size();
    }
}
