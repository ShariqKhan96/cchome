package com.webxert.cc_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TaskDetials extends AppCompatActivity {

    String task_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detials);

        task_id = getIntent().getStringExtra("task_id");

    }
}
