package com.anangkur.androidstudioplayground

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

data class Debug(
    val verbose: String,
    val info: String,
    val debug: String,
    val warning: String,
    val error: String,
)

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val debug = Debug(
            "ini log verbose",
            "ini log info",
            "ini log debug",
            "ini log warning",
            "ini log error"
        )

        Log.v("anangkur", debug.verbose)
        Log.i("anangkur", debug.info)
        Log.d("anangkur", debug.debug)
        Log.w("anangkur", debug.warning)
        Log.e("anangkur", debug.error)
    }
}