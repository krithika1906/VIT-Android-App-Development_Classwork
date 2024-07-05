package com.example.productitvityplanner2024

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Message
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "Activity is created")

    }

    override fun onStart() {
        super.onStart()

        Log.e(TAG, "Activity is starting")
    }
    override fun onPause() {
        super.onPause()

        Log.w(TAG, "Activity is Paused")
    }
    override fun onStop() {
        super.onStop()

        Log.d(TAG, "Activity is stopped")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.v(TAG, "activity has got destroyed")
    }

    //fun clickHandler(view) {
     //   Log.i("MainActivity- clickhandler", "button clicked")
       // var hIntent = Intent(this, HomeActivity::class.java)
       // hIntent.putExtra("mykey", "android vit krithika")
        //startActivity(hIntent)

     //   fun inflateXml() {
       //     var nameEditText = EditText(this)
         //   nameEditText.setHint("enter your name")
           // var pwdEditText = EditText(this)
         //   pwdEditText.setHint("enter your pass")
           // var loginButton = Button(this)
           // loginButton.setText("login")

       // }
  //  }
}