package com.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import com.example.myapplication.bd
import com.example.myapplication.tabelaCat


class TabelaBDMotas(db: SQLiteDatabase) : bd(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_Nome TEXT NOT NULL, $CAMPO_PRECO TEXT NOT NULL, $CAMPO_Mota_ID INTEGER NOT NULL, FOREIGN KEY (${CAMPO_Mota_ID}_ID) REFERENCES ${tabelaCat.NOME}(${BaseColumns._ID}) ON DELETE RESTRICT)")
    }



    companion object {
        const val NOME = "motas"
        const val CAMPO_Nome= "motas marca"
        const val CAMPO_PRECO = "Preço"
        const val CAMPO_Mota_ID = "categoriaId"

        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_Nome, CAMPO_PRECO, CAMPO_Mota_ID)
    }
}