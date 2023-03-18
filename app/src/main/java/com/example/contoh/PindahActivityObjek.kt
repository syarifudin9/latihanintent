package com.example.contoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PindahActivityObjek : AppCompatActivity() {
    private lateinit var tvPenerimaObjk : TextView

    companion object {
        const val EXTRA_CARS = "extra_cars"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pindah_objek)

        tvPenerimaObjk = findViewById(R.id.tvObjek)

        val mobil: Cars = intent.getParcelableExtra<Cars>(EXTRA_CARS) as Cars
        val text = "MERK: ${mobil.merk.toString()} \n " +
                   "TAHUN: ${mobil.tahun.toString()} \n " +
                   "PLAT: ${mobil.plat.toString()}"

        tvPenerimaObjk.text = text
    }

}