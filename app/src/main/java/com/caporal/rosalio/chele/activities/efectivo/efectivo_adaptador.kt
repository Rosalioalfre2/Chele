package com.caporal.rosalio.chele.activities.efectivo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.caporal.rosalio.chele.R
import com.caporal.rosalio.chele.model.efectivo
import kotlinx.android.synthetic.main.item_compra.view.*

class efectivo_adaptador(private val mContext: Context, private val listaEfectivo : List<efectivo>) : ArrayAdapter<efectivo>(mContext, 0, listaEfectivo) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val capa = LayoutInflater.from(mContext).inflate(R.layout.item_compra, parent, false)
        val compra = listaEfectivo[position]

        capa.txtFecha.text = compra.fecha.toString()
        capa.txtDescripcion.text = compra.descripcion
        capa.txtPrecio.text = compra.precio.toString()


        return capa
    }
}