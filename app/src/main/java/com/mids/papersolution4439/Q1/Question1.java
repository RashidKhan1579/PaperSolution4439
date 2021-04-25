package com.mids.papersolution4439.Q1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.mids.papersolution4439.R;

public class Question1 extends AppCompatActivity  {
    Button menu1;
    private int selectedItems=0;
    private String[] item={
            "Java",
            "Python",
            "Android",
            "Angular JS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        menu1= findViewById(R.id.menu1);
      menu1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              showCourses();
          }
      });


}

    private void showCourses() {
        MaterialAlertDialogBuilder dialogMenu = new MaterialAlertDialogBuilder(Question1.this);
        dialogMenu.setTitle("Select Your Course");
        dialogMenu.setCancelable(false);
        dialogMenu.setSingleChoiceItems(item, selectedItems, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                selectedItems = which;
            }
        });
        dialogMenu.setNeutralButton("Get Course", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String selected_course = item[selectedItems];
                startActivity(new Intent(Question1.this, Q1part2.class).putExtra("SELECTED_COURSE",
                        selected_course));
                dialog.dismiss();
            }
        });
        dialogMenu.create().show();
    }

}
