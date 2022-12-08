package com.example.exempletoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        btn.setText(R.string.buttontitle)
        btn.setOnClickListener {
            Toast.makeText(applicationContext , R.string.toast , Toast.LENGTH_LONG).show()

        }
    }
}