package com.mids.papersolution4439.Q3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mids.papersolution4439.R;

public class Question3 extends AppCompatActivity {

   private Button btncolor, btntext;
    private TextView Hellotxt;
    private int[] colors = {
            R.color.purple_200,
            R.color.purple_500,
            R.color.purple_700,
            R.color.teal_200,
            R.color.teal_700,
            R.color.black
    };
    private int selectedColor = 0;
    private Typeface[] typefaces = {
            Typeface.SANS_SERIF,
            Typeface.MONOSPACE,
            Typeface.DEFAULT
    };
    private int selectedTypeFace = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        btntext=findViewById(R.id.btntext);
        btncolor=findViewById(R.id.btncolor);
        Hellotxt=findViewById(R.id.Hellotxt);
        
        btntext.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                changetext();
            }
        });
      
        btncolor.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
            changecolor();
            }
        });
    }
//Mids

    private void changetext() {
        if (selectedTypeFace != 3) {
        Hellotxt.setTypeface(typefaces[selectedTypeFace]);
        selectedTypeFace++;
    } else {
        selectedTypeFace = 0;
    }

    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    private void changecolor() {
        if (selectedColor != 6) {
            Hellotxt.setTextColor(getColor(colors[selectedColor]));
            selectedColor++;
        } else {
            selectedColor = 0;
        }

    }
}