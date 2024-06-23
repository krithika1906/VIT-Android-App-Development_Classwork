package com.example.productitvityplanner2024

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Message
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun myClickHandler(view: View) {
        Log.i("MainActivity","Button Clicked")
        //var dialIntent = Intent(Intent.ACTION_DIAL)
        //var webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.yahoo.com"))
        //startActivity(webIntent)
        //createAlarm("milk",22,30)

        var hIntent = Intent(this,HomeActivity::class.java)
        startActivity(hIntent)


    }
    fun createAlarm(message: String, hour : Int, minutes :Int){
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES,minutes)

        }
        //if(intent.resolveActivity(packageManager)!=null){
            startActivity(intent)
        //}
    }
}