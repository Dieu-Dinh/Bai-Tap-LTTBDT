package com.example.tuan2_btvn

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import androidx.core.widget.addTextChangedListener
import com.example.tuan2_btvn.R
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.inputName)
        val ageEditText = findViewById<EditText>(R.id.inputAge)
        val resultTextView = findViewById<TextView>(R.id.result)
        val btnCheck = findViewById<Button>(R.id.btnCheck)

        btnCheck.setOnClickListener {
            val nameValue = nameEditText.text.toString().trim()
            val ageValue = ageEditText.text.toString().trim()

            if(nameValue.isEmpty() || ageValue.isEmpty()){
                Toast.makeText(this, "Vui lòng nhập đủ thông tin", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val ageInt = ageValue.toIntOrNull()
            if(ageInt == null || ageInt < 0){
                Toast.makeText(this,"Tuổi không hợp lệ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val ageCategory = when {
                ageInt > 65 -> "Người già"
                ageInt in 6..65 -> "Người lớn"
                ageInt in 3..5 -> "Trẻ em"
                ageInt  in 0..2 -> "Em bé"
                else -> "Không xác định"
            }

            resultTextView.text = "$nameValue là $ageCategory"


        }
    
    }
}