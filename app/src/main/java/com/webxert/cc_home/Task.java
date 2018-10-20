package com.webxert.cc_home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Task extends AppCompatActivity implements RecyclerTouchListener {

    RecyclerView recyclerView;
    MyAdapter adapter;
    List<String> tasks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        recyclerView = findViewById(R.id.task_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(getList(), this, this);
        recyclerView.setAdapter(adapter);
    }

    private List<String> getList() {
        tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tasks.add("This is task: " + i);
        }

        return tasks;
    }

    @Override
    public void onItemClicked(int position) {

        Intent intent = new Intent(Task.this, TaskDetials.class);
        intent.putExtra("task_id", tasks.get(position));
        startActivity(intent);

    }
}
