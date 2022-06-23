package com.example.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class tabelaCat(db: SQLiteDatabase) : bd(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $nome (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_NOME TEXT NOT NULL)")
    }

    companion object {
        const val NOME = "tipo"
        const val CAMPO_NOME = "tipo marcas"
    }
}