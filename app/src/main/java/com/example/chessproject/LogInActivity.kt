package com.example.chessproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

lateinit var login: EditText
lateinit var password: EditText
class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        login=findViewById(R.id.loginstring)
        password=findViewById(R.id.passwordstring)
    }

    fun sendAnswer(view: android.view.View) {
        if (login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            val intent = Intent(this@LogInActivity, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
        else {
            val alert=AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("ОК", null)
                .create()
                .show()
        }
    }
}