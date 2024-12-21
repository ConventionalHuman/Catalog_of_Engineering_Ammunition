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
            "ЯРМ",
            "ZMG",
            "ADM-8",
            "BPM",
            "BZZ-2",
            "DKRP-4",
            "ZZ-1",
            "ZRP-2",
            "KZ-2",
            "KZ-4",
            "KZ-5",
            "KZ-6",
            "KZ-7",
            "KZK",
            "KZU-2",
            "KZU",
            "KPOM-2",
            "KPTM-3",
            "KRM-P",
            "KSO-1S",
            "KSF-1S",
            "LKZ-80",
            "MZD-21",
            "MZM-2",
            "MZM",
            "MZS",
            "MZU-2",
            "MZU",
            "MIB",
            "ML-7",
            "ML-8",
            "MON-50",
            "MON-90",
            "MON-100",
            "MON-200",
            "MPM-E",
            "MPM",
            "MS-3",
            "MS-4",
            "OZ-1",
            "OZM-3",
            "OZM-4",
            "OZM-72",
            "OZM-152",
            "PDM-1M",
            "PDM-2",
            "PDM-3YA",
            "PMD-6M",
            "PMN-2",
            "PMN-3",
            "PMN-4",
            "PMN",
            "PMP",
            "POB",
            "POM-1S",
            "PTKM-1R",
            "POM3-2M",
            "PSM",
            "PTM-3",
            "PTM-4",
            "PTM1-H",
            "PFM-1S",
            "SZ-1P",
            "SZ-1É",
            "SZ-3a",
            "SZ-4P",
            "SZ-6M",
            "SM",
            "SPM",
            "SRM",
            "TM-57",
            "TM-62D",
            "TM-62M",
            "TM-62P2",
            "TM-62P3",
            "TM-62T",
            "TM-72",
            "TM-73",
            "TM-83",
            "TM-89",
            "TMK-2",
            "UMKZ",
            "UPM",
            "YARM"
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