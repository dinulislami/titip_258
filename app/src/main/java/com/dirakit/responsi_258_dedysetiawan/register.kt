package com.dirakit.responsi_258_dedysetiawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama =  findViewById<EditText>(R.id.txt_nama)
        val ttl =  findViewById<EditText>(R.id.txt_ttl)
        val alamat =  findViewById<EditText>(R.id.txt_alamat)
        val email = findViewById<EditText>(R.id.txt_email)
        val pass = findViewById<EditText>(R.id.txt_password)
        val button = findViewById<Button>(R.id.btn_proccess)

        btn_proccess.setOnClickListener{
            val name = txt_nama.text.toString()
            val place = txt_ttl.text.toString()
            val home = txt_home.text.toString()
            val email = txt_email.text.toString()
            val password = txt_password.text.toString()

            val intent = Intent (this@MainActivity, dashboard::class.java)
            intent.putExtra("name", name)
            intent.putExtra("place", place)
            intent.putExtra("home", home)
            intent.putExtra("email",email)
            intent.putExtra("password",password)
            startActivity(intent)
        }
    }
}

