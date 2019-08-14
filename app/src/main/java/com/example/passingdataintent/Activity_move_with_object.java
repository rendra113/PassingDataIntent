package com.example.passingdataintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity_move_with_object extends AppCompatActivity {

    public static final String EXTRA_PERSON = "Rendra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
    }
}
