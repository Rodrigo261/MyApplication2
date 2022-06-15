package com.myapplication

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaBDMota(db: SQLiteDatabase) : TabelaBD(db, NOME) {
    override fun cria() {
        db.execSQL("CREATE TABLE $NOME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $CAMPO_Nome TEXT NOT NULL, $CAMPO_PRECO TEXT NOT NULL, $CAMPO_CATEGORIA_ID INTEGER NOT NULL, FOREIGN KEY ($CAMPO_CATEGORIA_ID) REFERENCES ${TabelaBDCategorias.NOME}(${BaseColumns._ID}) ON DELETE RESTRICT)")
    }

    companion object {
        const val NOME = "motas"
        const val CAMPO_Nome= "motas marca"
        const val CAMPO_PRECO = "Preço"
        const val CAMPO_CATEGORIA_ID = "categoriaId"

        val TODAS_COLUNAS = arrayOf(BaseColumns._ID, CAMPO_Nome, CAMPO_PRECO, CAMPO_CATEGORIA_ID)
    }
}