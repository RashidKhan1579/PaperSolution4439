package com.mids.papersolution4439;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.mids.papersolution4439.Q1.Question1;
import com.mids.papersolution4439.Q10.Question10;
import com.mids.papersolution4439.Q2.Question2;
import com.mids.papersolution4439.Q3.Question3;
import com.mids.papersolution4439.Q4.Question4;
import com.mids.papersolution4439.Q5.Question5;
import com.mids.papersolution4439.Q6.Question6;
import com.mids.papersolution4439.Q7.Question7;
import com.mids.papersolution4439.Q8.Question8;
import com.mids.papersolution4439.Q9.Question9;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button q1, q2, q3, q4, q5, q6, q7, q8, q9, q10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1 = findViewById(R.id.Q1);
        q2 = findViewById(R.id.Q2);
        q3 = findViewById(R.id.Q3);
        q4 = findViewById(R.id.Q4);
        q5 = findViewById(R.id.Q5);
        q6 = findViewById(R.id.Q6);
        q7 = findViewById(R.id.Q7);
        q8 = findViewById(R.id.Q8);
        q9 = findViewById(R.id.Q9);
        q10 = findViewById(R.id.Q10);

        q1.setOnClickListener(this);
        q2.setOnClickListener(this);
        q3.setOnClickListener(this);
        q4.setOnClickListener(this);
        q5.setOnClickListener(this);
        q6.setOnClickListener(this);
        q7.setOnClickListener(this);
        q8.setOnClickListener(this);
        q9.setOnClickListener(this);
        q10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Q1:
                startActivity(new Intent(MainActivity.this, Question1.class));
                break;
            case R.id.Q2:
                startActivity(new Intent(MainActivity.this, Question2.class));
                break;
            case R.id.Q3:
                startActivity(new Intent(MainActivity.this, Question3.class));
                break;
            case R.id.Q4:
                startActivity(new Intent(MainActivity.this, Question4.class));
                break;
            case R.id.Q5:
                startActivity(new Intent(MainActivity.this, Question5.class));
                break;
            case R.id.Q6:
                startActivity(new Intent(MainActivity.this, Question6.class));
                break;
            case R.id.Q7:
                startActivity(new Intent(MainActivity.this, Question7.class));
                break;
            case R.id.Q8:
                startActivity(new Intent(MainActivity.this, Question8.class));
                break;
            case R.id.Q9:
                startActivity(new Intent(MainActivity.this, Question9.class));
                break;
            case R.id.Q10:
                startActivity(new Intent(MainActivity.this, Question10.class));
                break;
        }
    }
}