package com.example.contoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahActivityData : AppCompatActivity() {
    companion object { const val EXTRA_TEXT = "extra_text"}

    private lateinit var tvPenerima : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_data)

        tvPenerima = findViewById(R.id.tvPindahData)

        val tvDiterima = intent.getStringExtra(EXTRA_TEXT)
        val text = "apa aja boleh:$tvDiterima"
        tvPenerima.text = text
    }
}