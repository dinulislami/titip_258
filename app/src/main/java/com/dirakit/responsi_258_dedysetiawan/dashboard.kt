package com.dirakit.responsi_258_dedysetiawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        var intent = intent
        val name = intent.getStringExtra("Nama")
        val place = intent.getStringExtra("TTL")
        val home = intent.getStringExtra("Alamat")
        val email =intent.getStringExtra("Email")
        val password =intent.getStringExtra("Password")

        val tampil = findViewById<TextView>(R.id.tampil)

        tampil.text= "Nama : "+name+
                "\nTTL : "+place+
                "\nAlamat :"+home+
                "\nEmail :"+email+
                "\nPassword :"+password

    }
}
