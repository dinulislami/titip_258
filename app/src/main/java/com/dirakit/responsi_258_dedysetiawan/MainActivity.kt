package com.dirakit.responsi_258_dedysetiawan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun login(){
        var email = findViewById(R.id.txt_user) as EditText
        if(isValidCredential(email.text.toString(),txt_pass.text.toString())){
            Snackbar.make(btn_login,"Success Login",Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }else{
            Snackbar.make(btn_login,"Invalid Credential",Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }
    }
    fun isValidCredential(email: String, password:String): Boolean{
        return (email == "deset@gmail.com" && password == "responsi")
    }

}
