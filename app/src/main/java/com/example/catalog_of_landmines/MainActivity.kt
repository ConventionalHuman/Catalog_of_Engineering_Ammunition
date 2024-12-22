package com.example.catalog_of_landmines

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var models: Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        models = arrayOf(
            "ЗМГ",
            "АДМ-8",
            "БПМ",
            "БЗЗ-2",
            "ДКРП-4",
            "ЗЗ-1",
            "ЗРП-2",
            "КЗ-2",
            "КЗ-4",
            "КЗ-5",
            "КЗ-6",
            "КЗ-7",
            "КЗК",
            "КЗУ-2",
            "КЗУ",
            "КПОМ-2",
            "КПТМ-3",
            "КРМ-П",
            "КСО-1С",
            "КСФ-1С",
            "ЛКЗ-80",
            "МЗД-21",
            "МЗМ-2",
            "МЗМ",
            "МЗС",
            "МЗУ-2",
            "МЗУ",
            "МИБ",
            "МЛ-7",
            "МЛ-8",
            "МОН-50",
            "МОН-90",
            "МОН-100",
            "МОН-200",
            "МПМ-Э",
            "МПМ",
            "МС-3",
            "МС-4",
            "ОЗ-1",
            "ОЗМ-3",
            "ОЗМ-4",
            "ОЗМ-72",
            "ОЗМ-152",
            "ПДМ-1М",
            "ПДМ-2",
            "ПДМ-3Я",
            "ПМД-6М",
            "ПМН-2",
            "ПМН-3",
            "ПМН-4",
            "ПМН",
            "ПМП",
            "ПОБ",
            "ПОМ-1С",
            "ПТКМ-1Р",
            "ПОМ3-2М",
            "ПСМ",
            "ПТМ-3",
            "ПТМ-4",
            "ПТМ1-Г",
            "ПФМ-1С",
            "СЗ-1П",
            "СЗ-1Э",
            "СЗ-3а",
            "СЗ-4П",
            "СЗ-6М",
            "СМ",
            "СПМ",
            "СРМ",
            "ТМ-57",
            "ТМ-62Д",
            "ТМ-62М",
            "ТМ-62П2",
            "ТМ-62П3",
            "ТМ-62Т",
            "ТМ-72",
            "ТМ-73",
            "ТМ-83",
            "ТМ-89",
            "ТМК-2",
            "УМКЗ",
            "УПМ",
            "ЯРМ"
        )

        val button_cl = findViewById<Button>(R.id.cl_button)
        val button_inf = findViewById<Button>(R.id.inf_button)
        val button_search = findViewById<Button>(R.id.search_button)

        button_cl.setOnClickListener {
            val intent_cl = Intent(this@MainActivity, RecActivity::class.java);
            startActivity(intent_cl);
        }
        button_inf.setOnClickListener {
            val intent_inf = Intent(this@MainActivity, InfActivity::class.java);
            startActivity(intent_inf);
        }
        button_search.setOnClickListener {
            val edit = findViewById<EditText>(R.id.editTextText)
            var textSearch = edit.text.toString()
            textSearch = textSearch.replace("\\s".toRegex(), "")
            for (i in models.indices) {
                if(textSearch.uppercase() ==  models[i]){
                    val intentCatalog = Intent(this@MainActivity, MultyActivity::class.java)
                    intentCatalog.putExtra("title", models[i])
                    startActivity(intentCatalog)
                }
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}