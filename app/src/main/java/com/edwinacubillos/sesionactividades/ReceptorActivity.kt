package com.edwinacubillos.sesionactividades

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class ReceptorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receptor)

        var datosRecibidos = intent.extras
        if (datosRecibidos != null) {
            var nombre = datosRecibidos?.getString("nombre")
            Log.d("nombre", nombre)
            Log.d("nota", datosRecibidos?.getInt("calificacion").toString())
        }

    }

    override fun onBackPressed() {
        setResult(Activity.RESULT_CANCELED)
        finish()
        super.onBackPressed()
    }

    fun responder(view: View) {
        var correo = "edwinacubillos@gmail.com"
        var password = "123456"

        var intent = Intent()
        intent.putExtra("correo",correo)
        intent.putExtra("password", password)
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
