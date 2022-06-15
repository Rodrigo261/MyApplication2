package com.myapplication
import android.content.ContentValues
import android.database.Cursor
import android.provider.BaseColumns

data class Mota(
    var nome : String,
    var preco: String,
    var idMota: Long,
    var id: Long = -1

) {
    fun toContentValues() : ContentValues {
        val valores = ContentValues()

        valores.put(tabelaBDMotas.CAMPO_NOME, nome)
        valores.put(tabelaBDMotas.CAMPO_PRECO, preco)
        valores.put(tabelaBDMotas.CAMPO_Mota_ID, idMota)

        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Mota {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(tabelaBDMotas.CAMPO_Nome)
            val posPRECO = cursor.getColumnIndex(tabelaBDMotas.CAMPO_PRECO)
            val posIdCateg = cursor.getColumnIndex(tabelaBDMotas.CAMPO_Mota_ID)

            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val preco = cursor.getString(posPRECO)
            val idMota = cursor.getLong(posIdCateg)

            return Mota(nome, preco, idMota, id)
        }
    }
}