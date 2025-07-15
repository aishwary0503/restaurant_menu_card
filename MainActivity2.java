package com.example.ary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void displayToast(View v){
        Toast.makeText(this, "Thanks For Ordering..", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Your Order is Preparing..", Toast.LENGTH_SHORT).show();
    }
}