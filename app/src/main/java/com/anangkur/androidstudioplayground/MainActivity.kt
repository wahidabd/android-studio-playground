package com.anangkur.androidstudioplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

data class Debug(
    val verbose: String,
    val info: String,
    val debug: String,
    val warning: String,
    val error: String,
)

class MainActivity : AppCompatActivity() {

    private var buttonLogin: AppCompatButton? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val debug = Debug(
            "ini log verbose",
            "ini log info",
            "ini log debug",
            "ini log warning",
            "ini log error",
        )

        Log.v("anangkur", debug.verbose)
        Log.i("anangkur", debug.info)
        Log.d("anangkur", debug.debug)
        Log.w("anangkur", debug.warning)
        Log.e("anangkur", debug.error)

        buttonLogin = findViewById(R.id.button_login)
        buttonLogin?.setOnClickListener {
            Toast.makeText(this, "under maintenance!", Toast.LENGTH_SHORT).show()
        }
    }
}