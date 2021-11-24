package com.example.chessproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        login=findViewById(R.id.loginstringalt)
        password=findViewById(R.id.passwordstringalt)
    }

    fun registration(view: android.view.View) {
        if (login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            val intent = Intent(this@SignUpActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else {
            val alert= AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("ОК", null)
                .create()
                .show()
        }
    }
}