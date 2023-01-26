package com.caporal.rosalio.chele

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.caporal.rosalio.chele.activities.efectivo.efectivo_inicio

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEfectivo : Button = findViewById(R.id.btnEfectivo)

        btnEfectivo.setOnClickListener{
            startActivity(Intent(this, efectivo_inicio::class.java))
        }
    }
}