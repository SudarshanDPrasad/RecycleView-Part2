package com.example.birdsgridview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BIrdHOlder extends RecyclerView.ViewHolder {
    private ImageView mivBirds;

    public BIrdHOlder(@NonNull View itemView) {
        super(itemView);
        intidviews(itemView);

    }

    private void intidviews(View itemView) {
        mivBirds = itemView.findViewById(R.id.ivBirds);
    }

    public void setData(Bird bird, ItemonClick itemonClick) {
        mivBirds.setBackgroundResource(bird.getImage());
        mivBirds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemonClick.onClick(bird, getAdapterPosition());
            }
        });
    }
}
