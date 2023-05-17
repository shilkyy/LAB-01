package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText ta;
    EditText tb;
    TextView tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.txt_a);
        tb = findViewById(R.id.txt_b);
        tc = findViewById(R.id.txt_c);
    }
    public void on_add_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        float fc = fa + fb; // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_sub_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        float fc = fa - fb; // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_mul_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        float fc = fa * fb; // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_div_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        float fc = fa / fb; // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_Sin_click(View v)
    {
        float fc;
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        fc = (float) Math.sin(fa); // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_Cos_click(View v)
    {
        float fc;
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        fc = (float) Math.cos(fa); // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_Stepen_click(View v)
    {
        float fc;
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa); // convert string to float
        float fb = Float.parseFloat(sb); // convert string to float

        fc = (float) Math.pow(fa, fb); // deistviy

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
}