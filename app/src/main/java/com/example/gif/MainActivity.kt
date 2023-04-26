package com.example.gif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(getApplicationContext(), "It only takes 10 to 15 minutes.", Toast.LENGTH_SHORT).show();

    }
}