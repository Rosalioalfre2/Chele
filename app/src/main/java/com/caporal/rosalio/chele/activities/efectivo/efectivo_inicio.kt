package com.caporal.rosalio.chele.activities.efectivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.caporal.rosalio.chele.R
import com.caporal.rosalio.chele.model.efectivo
import kotlinx.android.synthetic.main.efectivo_inicio.*
import java.util.Date

class efectivo_inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.efectivo_inicio)

        var compra = efectivo(Date(2023, 2, 1), "Dos coras de queso", 0.5 )
        var compra2 = efectivo(Date(2023, 1, 2), "Tres coras de queso", 0.75 )

        val listaCompras =  listOf(compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,compra, compra2,)
        val adapter = efectivo_adaptador(this, listaCompras)
        lstEfectivo.adapter = adapter

    }
}