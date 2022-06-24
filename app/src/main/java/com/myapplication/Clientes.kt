package com.myapplication

import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Clientes(
    var nomeCliente : String,
    var saldo: Double,
    var id: Long = -1

) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaBDClientes.CAMPO_NOME, nomeCliente)
        valores.put(TabelaBDClientes.CAMPO_SALDO, saldo)



        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Clientes {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaBDClientes.CAMPO_NOME)
            val posSaldo = cursor.getColumnIndex(TabelaBDClientes.CAMPO_SALDO)

            val id = cursor.getLong(posId)
            val nomeCliente = cursor.getString(posNome)
            val saldo = cursor.getDouble(posSaldo)

            return Clientes(nomeCliente,saldo,id)
        }
    }
}