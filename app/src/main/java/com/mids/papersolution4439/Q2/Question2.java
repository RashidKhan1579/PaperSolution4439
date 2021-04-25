package com.mids.papersolution4439.Q2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mids.papersolution4439.R;

public class Question2 extends AppCompatActivity {
    private EditText edtiNumber;
    private Button btnValidate;
    private TextView txtStt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        edtiNumber = findViewById(R.id.edittext1);
        btnValidate = findViewById(R.id.validatebtn);
        txtStt = findViewById(R.id.statusCheck);
        btnValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateNumber()) {
                    txtStt.setText("Status: Valid");
                } else {
                    txtStt.setText("Status: Invalid");
                }

            }
        });

    }

    private boolean validateNumber() {

        String number = edtiNumber.getText().toString();
        if (number.isEmpty()) {
            edtiNumber.setError("Phone Number Required");
            return false;
        } else {
            if (number.length() < 12) {
                edtiNumber.setError("Full Phone Number Required");
                return false;
            } else {
                String areaCode = number.substring(0, 2);
                if (areaCode.equals("92") || areaCode.equals("93") || areaCode.equals("94") || areaCode.equals("95")) {
                    String networkCode = number.substring(2, 5);
                    if (networkCode.equals("300") || networkCode.equals("301") || networkCode.equals("302") ||
                            networkCode.equals("303") || networkCode.equals("304") || networkCode.equals("305") ||
                            networkCode.equals("306") || networkCode.equals("307") || networkCode.equals("308") ||
                            networkCode.equals("309")) {
                        Toast.makeText(this, "Number : " + number, Toast.LENGTH_SHORT).show();
                        return true;
                    } else {
                        edtiNumber.setError("Invalid Network Code");
                        return false;
                    }
                } else {
                    edtiNumber.setError("Invalid Area Code");
                    return false;
                }
            }
        }
    }
}


