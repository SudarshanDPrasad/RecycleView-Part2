package com.example.idenditycardproblemcontinuation;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IdentityAdaptor extends RecyclerView.Adapter<IdentityHolder> {
    private ArrayList<Identity> identityArrayList;
    private Interfaceclick interfaceclick;


    public IdentityAdaptor(ArrayList<Identity> identityArrayList,Interfaceclick interfaceclick) {
        this.identityArrayList = identityArrayList;
        this.interfaceclick = interfaceclick;

    }

    @NonNull
    @Override
    public IdentityHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new IdentityHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IdentityHolder holder, int position) {
        Identity identity = identityArrayList.get(position);
        holder.setData(identity,interfaceclick);
    }

    @Override
    public int getItemCount() {
        return identityArrayList.size();
    }
}
