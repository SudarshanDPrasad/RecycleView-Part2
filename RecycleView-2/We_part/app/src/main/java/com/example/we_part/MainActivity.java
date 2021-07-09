package com.example.we_part;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView recyclerView;
    private ArrayList<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intidviews();
        buildrecycleview();
        setrecycleview();
    }

    private void setrecycleview() {
        StudentAdaptor studentAdaptor = new StudentAdaptor(students, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdaptor);


    }

    private void buildrecycleview() {
        students = new ArrayList<>();
        Student student1 = new Student("Sudarshan", "18-07-1994", 27, "mysore", R.drawable.jeff_bezos);
        students.add(student1);

    }

    private void intidviews() {
        recyclerView = findViewById(R.id.recycleviewr);
    }

    @Override
    public void onClick(Student student, int adapterPosition) {
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        student.getAge() + "\n"
                        +student.getAddress() + "\n"
                        +student.getDob() + "\n"
                        +student.getName()
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