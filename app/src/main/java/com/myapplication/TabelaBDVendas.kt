package com.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import com.myapplication.TabelaBD


class TabelaBDVendas(db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE ${TabelaBDVendas.NOME} (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                "${TabelaBDVendas.CAMPO_Compra} INTEGER NOT NULL)")
    }



    companion object {
        const val NOME = "vendas"
        const val CAMPO_Compra = "compra da mota"


        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_Compra)
    }
}