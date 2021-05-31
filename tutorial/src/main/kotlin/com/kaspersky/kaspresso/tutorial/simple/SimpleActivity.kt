package com.kaspersky.kaspresso.tutorial.simple

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.kaspersky.kaspresso.tutorial.R
import kotlinx.android.synthetic.main.activity_simple.*

class SimpleActivity : AppCompatActivity() {

    companion object {
        private const val TIMEOUT: Long = 2000
    }

    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
    }

    override fun onResume() {
        super.onResume()
        button_1.setOnClickListener {
            button_2.visibility = View.VISIBLE
        }
        button_2.setOnClickListener {
            // special sleep to emulate ui block operation to check attempt method correctness
            handler.postDelayed({ edit.visibility = View.VISIBLE }, TIMEOUT)
        }
    }
}
