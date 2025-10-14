/**
 * Course: MAD204 - Java Development for Mobile Applications
 * Lab: 02 - Login and Greeting App
 * Author: Darshilkumar Karkar
 * Date: October 14, 2025
 * Description: This activity greets the user and provides a logout button to return to MainActivity.
 */

package com.example.mad204_lab2_darshilkumar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("USERNAME") ?: "User"
        val welcomeText = findViewById<TextView>(R.id.tvWelcome)
        welcomeText.text = "Welcome, $name!"

        val logoutButton = findViewById<Button>(R.id.btnLogout)
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}