package com.example.passingdataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity_move_with_data extends AppCompatActivity {

    public static final String EXTRA_NAME = "Rendra Muhammad Fadhil";
    public static final String EXTRA_AGE = "17";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
    }
}
