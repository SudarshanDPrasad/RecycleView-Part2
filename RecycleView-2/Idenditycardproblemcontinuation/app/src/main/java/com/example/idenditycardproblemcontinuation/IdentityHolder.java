package com.example.idenditycardproblemcontinuation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.PrimitiveIterator;

public class IdentityHolder extends RecyclerView.ViewHolder {

    private TextView mtvName;
    private TextView mtvAge;
    private TextView mtvProfession;
    private ImageView mivimage;

    public IdentityHolder(@NonNull View itemView) {
        super(itemView);
        intidviews(itemView);
    }

    private void intidviews(View itemview) {
        mtvAge = itemview.findViewById(R.id.tvAge);
        mtvName = itemview.findViewById(R.id.tvName);
        mtvProfession = itemview.findViewById(R.id.tvProfession);
        mivimage = itemview.findViewById(R.id.ivimage);

    }

    public void setData(Identity identity, Interfaceclick interfaceclick) {
        mtvName.setText(identity.getName());
        mtvProfession.setText(identity.getProfession());
        mtvAge.setText(identity.getAge() + " ");
        mivimage.setBackgroundResource(identity.getImage());
        mivimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceclick.onCLick(identity, getAdapterPosition());
            }
        });
    }
}
