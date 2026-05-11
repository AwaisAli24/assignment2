package com.awais.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etRegName = findViewById<EditText>(R.id.etRegName)
        val etRegPhone = findViewById<EditText>(R.id.etRegPhone)
        val etRegEmail = findViewById<EditText>(R.id.etRegEmail)
        val etRegPassword = findViewById<EditText>(R.id.etRegPassword)
        val btnRegisterSubmit = findViewById<Button>(R.id.btnRegisterSubmit)

        btnRegisterSubmit.setOnClickListener {
            val name = etRegName.text.toString().trim()
            val phone = etRegPhone.text.toString().trim()
            val email = etRegEmail.text.toString().trim()
            val password = etRegPassword.text.toString()

            if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val emailPattern = Regex("^[a-zA-Z0-9]+@ucp\\.com$")
            if (!emailPattern.matches(email)) {
                Toast.makeText(this, "Email must be [RollNo]@UCP.com", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (!password.contains("Awais")) {
                Toast.makeText(this, "Password must contain 'Awais'", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Save data to variables (simulated by local variables above)
            val registrationDetails = "Name: $name\nPhone: $phone\nEmail: $email\nPassword: $password"
            
            Toast.makeText(this, "Registered Successfully\n$registrationDetails", Toast.LENGTH_LONG).show()
        }
    }
}