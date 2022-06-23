package com.myapplication
import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Mota(
    var nome : String,
    var preco: Float,
    var cc: Int,
    var id: Long = -1

) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(TabelaBDMotas.CAMPO_Nome, nome)
        valores.put(TabelaBDMotas.CAMPO_PRECO, preco)
        valores.put(TabelaBDMotas.CAMPO_CC,cc)

        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Mota {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(TabelaBDMotas.CAMPO_Nome)
            val posPRECO = cursor.getColumnIndex(TabelaBDMotas.CAMPO_PRECO)
            val posCC = cursor.getColumnIndex(TabelaBDMotas.CAMPO_CC)
            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val preco = cursor.getFloat(posPRECO)
            val cc = cursor.getInt(posCC)
            return Mota(nome, preco,cc, id)
        }
    }
}