package com.guruthedev.androidproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.guruthedev.androidproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.sendButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = getString(R.string.plain_text_message)
            intent.putExtra(Intent.EXTRA_EMAIL,getString(R.string.send_email))
            intent.putExtra(Intent.EXTRA_SUBJECT,getString(R.string.subject_message))
            intent.putExtra(Intent.EXTRA_TEXT,getString(R.string.text_message))
            startActivity(intent)
        }
        binding.ViewButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            startActivity(intent)
        }
    }
}