package com.example.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import com.myapplication.TabelaBD


class TabelaBDClientes(db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                " $CAMPO_Nome TEXT NOT NULL, " +
                "$CAMPO_Saldo INTEGER NOT NULL)")
    }

    companion object {
        const val NOME = "clientes"
        const val CAMPO_Nome= "cliente"
        const val CAMPO_Saldo = "saldo"


        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_Nome, CAMPO_Saldo)
    }
}