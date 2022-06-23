package com.myapplication
import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Vendas(
    var compra: Float,
    var id: Long = -1

) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()
        valores.put(TabelaBDVendas.CAMPO_Compra,compra)
        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Vendas {
            val posCOMPRA = cursor.getColumnIndex(TabelaBDVendas.CAMPO_Compra)
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val compra = cursor.getFloat(posCOMPRA)
            val id = cursor.getLong(posId)
            return Vendas(compra,id)
        }
    }
}