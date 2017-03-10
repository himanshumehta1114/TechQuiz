package com.example.android.techquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.techquiz.R.id.mobile3;

public class MainActivity extends AppCompatActivity {

    boolean ans1 = false;
    boolean ans4 = false;
    boolean Mobile3 = false;
    boolean Tablet3 = false;
    boolean Led3 = false;
    boolean laptops3 = false;
    int score=0;
    String ans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ques1(View view) {
        RadioButton mark = (RadioButton) findViewById(R.id.mark1);
        ans1 = mark.isChecked();

        if (ans1) {
            Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void ques2(View view) {
        EditText studio = (EditText) findViewById(R.id.text2);
        String ans2 = studio.getText().toString();
        Toast.makeText(this, ans2, Toast.LENGTH_SHORT).show();
        if (ans2 == "a") {
            Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show();
        }

    }

    public void ques3(View view) {
        CheckBox mobile = (CheckBox) findViewById(mobile3);
        Mobile3 = mobile.isChecked();

        CheckBox tablet = (CheckBox) findViewById(R.id.tablets3);
        Tablet3 = tablet.isChecked();

        CheckBox led = (CheckBox) findViewById(R.id.led3);
        Led3 = led.isChecked();

        CheckBox laptop = (CheckBox) findViewById(R.id.laptops3);
        laptops3 = laptop.isChecked();

        if (Mobile3 && Tablet3 && Led3) {
                    Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            score++;
                }

        else {
                    Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void ques4(View view) {
        RadioButton android = (RadioButton) findViewById(R.id.android4);
        ans4 = android.isChecked();

        if (ans4) {
            Toast.makeText(this, "Your answer is correct", Toast.LENGTH_SHORT).show();
            score++;
        } else {
            Toast.makeText(this, "Your answer is incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void finalScore(View view){
        Toast.makeText(this,"You score : " + score,Toast.LENGTH_SHORT).show();
    }
}

