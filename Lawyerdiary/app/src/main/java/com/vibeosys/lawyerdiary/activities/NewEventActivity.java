package com.vibeosys.lawyerdiary.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vibeosys.lawyerdiary.R;

public class NewEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        setTitle("Add Reminder");
    }
}
