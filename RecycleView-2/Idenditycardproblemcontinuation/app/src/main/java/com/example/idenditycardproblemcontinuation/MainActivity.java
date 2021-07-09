package com.example.idenditycardproblemcontinuation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.LayoutInflater;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Interfaceclick{

    private RecyclerView recyclerView;
    private ArrayList<Identity> identityArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidviews();
        buildrecycleview();
        setrecycleview();
    }

    private void setrecycleview() {
        IdentityAdaptor identityAdaptor = new IdentityAdaptor(identityArrayList,this);
        StaggeredGridLayoutManager gridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(identityAdaptor);
    }

    private void buildrecycleview() {
        identityArrayList = new ArrayList<>();
        Identity identity = new Identity("Prateek", 31, "Business", R.drawable.prateek);
        identityArrayList.add(identity);
        Identity identity1 = new Identity("Yogesh", 36,"Business",R.drawable.yogesh);
        identityArrayList.add(identity1);
        Identity identity2 = new Identity("Lloyd",27,"Android Developer",R.drawable.lloyd);
        identityArrayList.add(identity2);
        Identity identity3 = new Identity("Nrupul",45,"Business",R.drawable.nrupul);
        identityArrayList.add(identity3);
    }

    private void intidviews() {
        recyclerView = findViewById(R.id.recycleView);
    }


    @Override
    public void onCLick(Identity identity, int position) {
        Toast.makeText(this,"Position" + position,Toast.LENGTH_SHORT).show();
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        identity.getName() + "\n"
                                + identity.getAge()
                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();
    }
}