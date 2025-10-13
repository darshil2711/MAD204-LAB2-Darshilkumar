📱 MAD204-01 – Lab 2: Login + Greeting App

*************************************************************************************************************************************************************

Student Name: Darshilkumar Karkar 
Student ID: A00203357 
Course: MAD204 – Java Development for Mobile Applications 
Semester: Fall 2025 
Date: 14 October 2025

🧠 Overview

This Android app is a Login + Greeting Application built using Kotlin and Android Studio. It demonstrates the fundamentals of Android development, including:

Layouts (ConstraintLayout, LinearLayout)

Widgets (TextView, EditText, Button, ImageView)

Event handling using setOnClickListener

Passing data between Activities using Intent + Bundle

Applying custom styles and themes

🎯 Learning Objectives

Understand Android project structure and file organization.

Design a functional Login screen and a Greeting screen.

Apply consistent styles using styles.xml.

Handle button clicks and pass user data between activities.

Manage source code with Git commits, branches, and pull requests.

⚙️ App Features

Login Screen (MainActivity)
Displays a logo and "Login" title.

Includes EditText fields for Email and Password.

A Login button with a custom style.

“Forgot password?” text at the bottom.

On click, navigates to the Greeting screen.

Greeting Screen (SecondActivity)
Displays “Welcome, [UserName]!” message.

Shows an additional image/logo.

Includes a Logout button to return to the Login screen.

🏗️ Project Structure Lab2LoginApp/ 
├── app/ 
│ ├── src/ 
│ │ ├── main/ 
│ │ │ ├── AndroidManifest.xml 
│ │ │ ├── java/com/example/lab2loginapp/ 
│ │ │ │ ├── MainActivity.kt 
│ │ │ │ └── SecondActivity.kt 
│ │ │ ├── res/ 
│ │ │ │ ├── layout/ 
│ │ │ │ │ ├── activity_main.xml 
│ │ │ │ │ └── activity_second.xml 
│ │ │ │ ├── drawable/ 
│ │ │ │ │ └── app_logo.png 
│ │ │ │ ├── values/ 
│ │ │ │ │ ├── colors.xml 
│ │ │ │ │ ├── strings.xml 
│ │ │ │ │ └── styles.xml 
│ ├── build.gradle 
│ └── settings.gradle 
├── README.md

💬 Code Summary

MainActivity.kt

Takes user input for Email and Password.

Uses Intent to pass user’s name/email to SecondActivity.

SecondActivity.kt

Retrieves data from Intent and displays it in a greeting message.

Includes a Logout button to return to the login screen.

activity_main.xml

ConstraintLayout with ImageView, EditTexts, Buttons, and TextViews.

activity_second.xml

LinearLayout with greeting message, logo, and Logout button.

styles.xml

Custom button styles for color, text size, and padding.
