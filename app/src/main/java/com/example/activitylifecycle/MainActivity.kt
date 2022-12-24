package com.example.activitylifecycle

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val second = findViewById<Button>(R.id.second)
        second.setOnClickListener {
            val intent = Intent(
                this, SecondActivity::class.java
            )
            startActivity(intent)
        }
        Log.d(TAG, "$TAG:onCreate" )
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$TAG:onStart" )

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$TAG:onResume" )


    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$TAG:onPause" )

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$TAG:onStop" )

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$TAG:onDestroy" )

    }


    }
