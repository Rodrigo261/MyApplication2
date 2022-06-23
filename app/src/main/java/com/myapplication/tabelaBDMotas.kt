package com.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns


class TabelaBDMotas(db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                " $CAMPO_Nome TEXT NOT NULL, " +
                "$CAMPO_PRECO INTEGER NOT NULL, " +
                "$CAMPO_CC INTERGER NOT NULL)")
    }



    companion object {
        const val NOME = "mota"
        const val CAMPO_Nome= "motas"
        const val CAMPO_PRECO = "Preço"

        const val CAMPO_CC = "CC"
        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_Nome, CAMPO_PRECO,
            CAMPO_CC)
    }
}