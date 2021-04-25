package com.mids.papersolution4439.Q1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mids.papersolution4439.R;

public class Q1part2 extends AppCompatActivity {
    private String selected_course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1part2);

        selected_course = getIntent().getExtras().getString("SELECTED_COURSE");
        getSupportActionBar().setTitle(selected_course);


    }
}