package com.example.catalog_of_landmines

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.io.File
import java.io.FileOutputStream

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "landmine.db" // Имя базы данных
        const val DATABASE_VERSION = 1         // Версия базы данных
        const val TABLE_NAME = "landmine"      // Название таблицы
        const val DATABASE_ASSETS_PATH = "database/$DATABASE_NAME" // Путь к файлу в assets
    }

    private val databasePath: String = context.getDatabasePath(DATABASE_NAME).path

    init {
        // Копируем базу данных из каталога assets при первом запуске
        if (!checkDatabaseExists()) {
            copyDatabaseFromAssets(context)
        }
    }

    // Проверяем, существует ли база данных
    private fun checkDatabaseExists(): Boolean {
        return File(databasePath).exists()
    }

    // Копируем базу данных из каталога assets в системный каталог
    private fun copyDatabaseFromAssets(context: Context) {
        try {
            val inputStream = context.assets.open(DATABASE_ASSETS_PATH)
            val outputFile = File(databasePath)
            outputFile.parentFile?.mkdirs()
            val outputStream = FileOutputStream(outputFile)

            inputStream.use { input ->
                outputStream.use { output ->
                    input.copyTo(output)
                }
            }
        } catch (e: Exception) {
            throw RuntimeException("Ошибка копирования базы данных из assets: ${e.message}", e)
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
        // Не используется, так как база данных заполняется заранее
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        // Реализуйте логику обновления, если потребуется
    }

    // Метод для получения данных из определённой колонки
    fun getColumnData(columnName: String, model: String): List<String> {
        val db = readableDatabase
        val query = "SELECT $columnName FROM $TABLE_NAME WHERE model = ?"
        val cursor: Cursor = db.rawQuery(query, arrayOf(model))

        val result = mutableListOf<String>()
        if (cursor.moveToFirst()) {
            do {
                result.add(cursor.getString(cursor.getColumnIndexOrThrow(columnName)))
            } while (cursor.moveToNext())
        }
        cursor.close()
        return result
    }
}
