package com.example.catalog_of_landmines

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inf)

        val textInf = findViewById<TextView>(R.id.textView3)
        textInf.setText("Добро пожаловать в приложение \"Каталог инженерных боеприпасов\"! Это инструмент для ознакомления с характеристиками и устройством различных боеприпасов, используемых в инженерной сфере. В приложении вы сможете найти информацию о принципах действия боеприпасов, их устройствах и особенностях. \n" +
                "\n" +
                "Основные функции приложения:\n" +
                "- подробные данные о боеприпасах;\n" +
                "- описание устройства и принципа действия;\n" +
                "- 3D модели.\n" +
                "\n" +
                "Приложение предназначено для инженеров, военных специалистов и всех, кто заинтересован в глубоком изучении инженерных боеприпасов.")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}