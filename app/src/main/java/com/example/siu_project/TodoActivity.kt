package com.example.siu_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        findViewById<ImageView>(R.id.write).setOnClickListener {
            startActivity(Intent(this, TodoWriteActivity::class.java))
        }
    }
}