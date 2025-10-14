/**
 * Course: MAD204 - Java Development for Mobile Applications
 * Lab: 02 - Login and Greeting App
 * Author: Darshilkumar Karkar
 * Student ID: A00203357
 * Date: October 14, 2025
 * Description: This activity displays a login screen and sends the user's name to SecondActivity.
 */

package com.example.mad204_lab2_darshilkumar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailInput = findViewById<EditText>(R.id.etEmail)
        val passwordInput = findViewById<EditText>(R.id.etPassword)
        val loginButton = findViewById<Button>(R.id.btnLogin)

        loginButton.setOnClickListener {
            val name = emailInput.text.toString().trim()
            if (name.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USERNAME", name)
                startActivity(intent)
            } else {
                emailInput.error = "Please enter your name"
            }
        }
    }
}