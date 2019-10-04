package com.example.a3homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonPers, buttonequal, buttonDiv,
            buttonMin, buttonC, buttonPlus;
    EditText result;
    float mValueOne, mValueTwo;
    boolean addition, subtract, division, persent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0= findViewById(R.id.num_0);
        button1 = findViewById(R.id.num1);
        button2 = findViewById(R.id.num2);
        button3 = findViewById(R.id.num3);
        button4 = findViewById(R.id.num4);
        button5 = findViewById(R.id.num5);
        button6 = findViewById(R.id.num6);
        button7 = findViewById(R.id.num7);
        button8 = findViewById(R.id.num8);
        button9 = findViewById(R.id.num9);
        buttonC = findViewById(R.id.text_C);
        buttonPlus = findViewById(R.id.text_plus);
        buttonPers = findViewById(R.id.text_pers);
        buttonDiv = findViewById(R.id.text_div);
        buttonequal=findViewById(R.id.text_equal);
        buttonMin=findViewById(R.id.text_min);
        result=findViewById(R.id.result);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        buttonPers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (result == null) {
                    result.setText("");
                } else {
                    mValueOne = Float.parseFloat(result.getText() + "");
                    addition = true;
                    result.setText(null);
                }
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(result.getText() + "");
                addition = true;
                result.setText(null);
            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(result.getText() + "");
                subtract = true;
                result.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(result.getText() + "");
                division = true;
                result.setText(null);
            }
        });
        buttonPers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(result.getText() + "");
                persent = true;
                result.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(result.getText() + "");

                if (addition == true) {
                    result.setText(mValueOne + mValueTwo + "");
                    addition = false;
                }

                if (subtract == true) {
                    result.setText(mValueOne - mValueTwo + "");
                    subtract = false;
                }

                if (division == true) {
                    result.setText(mValueOne / mValueTwo + "");
                    division = false;
                }
                if (persent == true) {
                    result.setText((mValueOne / 100) * mValueTwo + "");
                    persent = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
    }
}


