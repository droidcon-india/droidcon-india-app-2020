package com.touchlab.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.touchlab.sharedcode.createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = createApplicationScreenMessage()
    }
}