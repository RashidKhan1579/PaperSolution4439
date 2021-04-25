package com.mids.papersolution4439.Q5;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.mids.papersolution4439.R;

public class Question5 extends AppCompatActivity implements View.OnClickListener {
    private EditText edtIO;
    private MaterialButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnMultiply, btnDivide, btnEqual, btnClear;
    private TextView txtResult;
    private String first, second, operator;
    private int length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        edtIO = findViewById(R.id.edtIO);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);
        txtResult = findViewById(R.id.txtResult);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                edtIO.setText(edtIO.getText().toString() + "0");
                break;
            case R.id.btn1:
                edtIO.setText(edtIO.getText().toString() + "1");
                break;
            case R.id.btn2:
                edtIO.setText(edtIO.getText().toString() + "2");
                break;
            case R.id.btn3:
                edtIO.setText(edtIO.getText().toString() + "3");
                break;
            case R.id.btn4:
                edtIO.setText(edtIO.getText().toString() + "4");
                break;
            case R.id.btn5:
                edtIO.setText(edtIO.getText().toString() + "5");
                break;
            case R.id.btn6:
                edtIO.setText(edtIO.getText().toString() + "6");
                break;
            case R.id.btn7:
                edtIO.setText(edtIO.getText().toString() + "7");
                break;
            case R.id.btn8:
                edtIO.setText(edtIO.getText().toString() + "8");
                break;
            case R.id.btn9:
                edtIO.setText(edtIO.getText().toString() + "9");
                break;
            case R.id.btnClear:
                edtIO.setText("");
                txtResult.setText("Result: 0");
                break;
            case R.id.btnPlus:
                first = edtIO.getText().toString();
                edtIO.setText(edtIO.getText().toString() + "+");
                operator = "+";
                length = first.length() + 1;
                break;
            case R.id.btnMinus:
                first = edtIO.getText().toString();
                edtIO.setText(edtIO.getText().toString() + "-");
                operator = "-";
                length = first.length() + 1;
                break;
            case R.id.btnMultiply:
                first = edtIO.getText().toString();
                edtIO.setText(edtIO.getText().toString() + "*");
                operator = "*";
                length = first.length() + 1;
                break;
            case R.id.btnDivide:
                first = edtIO.getText().toString();
                edtIO.setText(edtIO.getText().toString() + "/");
                length = first.length() + 1;
                operator = "/";
                break;
            case R.id.btnEqual:
                second = edtIO.getText().toString().substring(length);
                int v1 = Integer.valueOf(first);
                int v2 = Integer.valueOf(second);
                double result2 = 0.0;
                int result = 0;
                if (operator.equals("+")) {
                    result = v1 + v2;
                    txtResult.setText("Result: " + result);
                } else if (operator.equals("-")) {
                    result = v1 - v2;
                    txtResult.setText("Result: " + result);
                } else if (operator.equals("*")) {
                    result = v1 * v2;
                    txtResult.setText("Result: " + result);
                } else if (operator.equals("/")) {
                    result2 = v1 / v2;
                    txtResult.setText("Result: " + result2);
                }
                edtIO.setText("");
                break;
        }

    }
}