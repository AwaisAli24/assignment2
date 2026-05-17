package com.awais.assignment2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.card.MaterialCardView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cardLogin = findViewById<MaterialCardView>(R.id.cardLogin)
        val cardRegister = findViewById<MaterialCardView>(R.id.cardRegister)
        val cardAbout = findViewById<MaterialCardView>(R.id.cardAbout)
        val cardContact = findViewById<MaterialCardView>(R.id.cardContact)

        cardLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        cardRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        cardAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        cardContact.setOnClickListener {
            startActivity(Intent(this, ContactActivity::class.java))
        }
    }
}