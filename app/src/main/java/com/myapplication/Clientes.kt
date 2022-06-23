package com.myapplication

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns
import com.example.myapplication.TabelaBDClientes

data class Clientes(
    var nomeCliente : String,
    var saldo: Double,
    var id: Long = -1

) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaBDClientes.CAMPO_Nome, nomeCliente)
        valores.put(TabelaBDClientes.CAMPO_Saldo, saldo)



        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Clientes {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaBDClientes.CAMPO_Nome)
            val posSaldo = cursor.getColumnIndex(TabelaBDClientes.CAMPO_Saldo)

            val id = cursor.getLong(posId)
            val nomeCliente = cursor.getString(posNome)
            val saldo = cursor.getDouble(posSaldo)

            return Clientes(nomeCliente,saldo,id)
        }
    }
}