package com.example.catalog_of_landmines

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var items: ArrayList<Title>

    lateinit var models: Array<String>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec)
        models = arrayOf(
            "МОН-50",
            "МОН-90",
            "ТМ-57",
            "ТМ-62Д",
            "ТМ-62М",
            "ТМ-62П2",
            "ТМ-62П3",
            "ТМ-62Т",
            "ТМ-72",
            "ПТКМ-1Р",
            "ОЗ-1",
            "ОЗМ-72",
            "ПФМ-1С",
            "ПМН",
            "ПМН-2",
            "ПОМ3-2М",
            "ТМ-89",
            "ЗРП-2",
            "БПМ",
            "ЗМГ",
            "АДМ-8",
            "БЗЗ-2",
            "ДКРП-4",
            "ЗЗ-1",
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
            "МОН-100",
            "МОН-200",
            "МПМ-Э",
            "МПМ",
            "МС-3",
            "МС-4",
            "ОЗМ-3",
            "ОЗМ-4",
            "ОЗМ-152",
            "ПДМ-1М",
            "ПДМ-2",
            "ПДМ-3Я",
            "ПМД-6М",
            "ПМН-3",
            "ПМН-4",
            "ПМП",
            "ПОБ",
            "ПОМ-1С",
            "ПСМ",
            "ПТМ-3",
            "ПТМ-4",
            "ПТМ1-Г",
            "СЗ-1П",
            "СЗ-1Э",
            "СЗ-3а",
            "СЗ-4П",
            "СЗ-6М",
            "СМ",
            "СПМ",
            "СРМ",
            "ТМ-73",
            "ТМ-83",
            "ТМК-2",
            "УМКЗ",
            "УПМ",
            "ЯРМ",
        )
        recyclerView = findViewById(R.id.rv_items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        items = arrayListOf<Title>()
        loadData()
    }
    private fun loadData() {
        for (i in models.indices) {
            val tl = Title( models[i])
            items.add(tl)
        }

        recyclerView.adapter = CatalogAdapter(items)
    }

}