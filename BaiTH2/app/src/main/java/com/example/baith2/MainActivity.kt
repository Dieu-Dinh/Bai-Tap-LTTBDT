package com.example.baith2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.graphics.Color
import com.example.baith2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.Email)
        val result = findViewById<TextView>(R.id.Result)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val emailText = email.text.toString().trim()

            if (emailText.isEmpty()) {
                result.text = "Email không hợp lệ"
                result.setTextColor(Color.RED)
            }
            else if (!emailText.contains("@")) {
                result.text = "Email không đúng định dạng"
                result.setTextColor(Color.RED)
            }
            else {
                result.text = "Bạn đã nhập email hợp lệ"
            }
        }
    }
}