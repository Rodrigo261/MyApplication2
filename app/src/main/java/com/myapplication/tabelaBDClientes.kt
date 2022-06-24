package com.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns


class TabelaBDClientes(db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                " $CAMPO_NOME TEXT NOT NULL, " +
                "$CAMPO_SALDO INTEGER NOT NULL)")
    }

    companion object {
        const val NOME = "clientes"
        const val CAMPO_NOME= "cliente"
        const val CAMPO_SALDO = "saldo"


        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_NOME, CAMPO_SALDO)
    }
}