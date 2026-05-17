package com.awais.assignment2

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnLoginSubmit = findViewById<MaterialButton>(R.id.btnLoginSubmit)

        btnLoginSubmit.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString()

            val emailPattern = Regex("^[a-zA-Z0-9]+@UCP\\.com$", RegexOption.IGNORE_CASE)
            
            if (emailPattern.matches(email) && password == "Awais Ali") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid Credentials. Use [RollNo]@UCP.com and 'Awais Ali'", Toast.LENGTH_LONG).show()
            }
        }
    }
}