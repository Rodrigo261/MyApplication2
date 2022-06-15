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

        valores.put(tabelaBDMota.CAMPO_NOME, nome)
        valores.put(tabelaBDMota.CAMPO_PRECO, preco)
        valores.put(tabelaBDMota.CAMPO_CATEGORIA_ID, idMota)

        return valores
    }

    companion object {
        fun fromCursor(cursor: Cursor): Mota {
            val posId = cursor.getColumnIndex(BaseColumns._ID)
            val posNome = cursor.getColumnIndex(tabelaBDMota.CAMPO_Nome)
            val posPRECO = cursor.getColumnIndex(tabelaBDMota.CAMPO_PRECO)
            val posIdCateg = cursor.getColumnIndex(tabelaBDMota.CAMPO_CATEGORIA_ID)

            val id = cursor.getLong(posId)
            val nome = cursor.getString(posNome)
            val preco = cursor.getString(posPRECO)
            val idCategoria = cursor.getLong(posIdCateg)

            return Mota(nome, preco, idCategoria, id)
        }
    }
}