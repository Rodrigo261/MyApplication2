package com.example.myapplication

import android.content.ContentValues
import android.provider.BaseColumns

 data class categoria (var nome: String, var id: Long = -1){

        fun toContentValues() : ContentValues {
            val valores = ContentValues()
            valores.put(tabelaCategoria.CAMPO_NOME, nome)

            return valores
        }


}