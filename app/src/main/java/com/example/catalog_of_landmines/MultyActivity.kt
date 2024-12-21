package com.example.catalog_of_landmines

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multy)

        val arguments = intent.extras
        val CatalTitle = arguments!!["title"].toString()

        val textV = findViewById<TextView>(R.id.textView4)
        val img = findViewById<ImageView>(R.id.imageView)
        val but3D = findViewById<Button>(R.id.d3_button)
        textV.setMovementMethod(ScrollingMovementMethod())

        but3D.setOnClickListener {
            val intent3D = Intent(this@MultyActivity, Activity3D::class.java);
            intent3D.putExtra("model3d",CatalTitle)
            startActivity(intent3D);
        }

        if(CatalTitle == "ЗМГ" || CatalTitle == "ZMG"){
            textV.setText("Название: ЗМГ\nДиаметр: 61 мм.\nМасса: 810 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.zmg)
        }
        if(CatalTitle == "АДМ-8" || CatalTitle == "ADM-8"){
            textV.setText("Название: АДМ-8\nДиаметр: 220 мм.\nМасса: 24200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable._8)
        }
        if(CatalTitle == "БПМ" || CatalTitle == "BPM"){
            textV.setText("Название: БПМ\nДиаметр: 255 мм.\nМасса: 7000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.bpm)
        }
        if(CatalTitle == "БЗЗ-2" || CatalTitle == "BZZ-2"){
            textV.setText("Название: БЗЗ-2\nДлина: 445 мм.\nМасса: 6200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.bzz2)
        }
        if(CatalTitle == "ДКРП-4" || CatalTitle == "DKRP-4"){
            textV.setText("Название: ДКРП-4\nДлина: 10300 мм.\nМасса: 6200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.dkrp4)
        }
        if(CatalTitle == "ЗЗ-1" || CatalTitle == "ZZ-1"){
            textV.setText("Название: ЗЗ-1\nДлина: 235 мм.\nМасса: 1700 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.zz1)
        }
        if(CatalTitle == "ЗРП-2" || CatalTitle == "ZRP-2"){
            textV.setText("Название: ЗРП-2\nДлина: 60 мм.\nМасса: 34000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.zrp2)
        }
        if(CatalTitle == "КЗ-2" || CatalTitle == "KZ-2"){
            textV.setText("Название: КЗ-2\nДиаметр: 350 мм.\nМасса: 14700 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kz2)
        }
        if(CatalTitle == "КЗ-4" || CatalTitle == "KZ-4"){
            textV.setText("Название: КЗ-4\nДиаметр: 410 мм.\nМасса: 63000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kz4)
        }
        if(CatalTitle == "КЗ-5" || CatalTitle == "KZ-5"){
            textV.setText("Название: КЗ-5\nДиаметр: 215 мм.\nМасса: 12500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kz5)
        }
        if(CatalTitle == "КЗ-6" || CatalTitle == "KZ-6"){
            textV.setText("Название: КЗ-6\nДиаметр: 112 мм.\nМасса: 3000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kz6)
        }
        if(CatalTitle == "КЗ-7" || CatalTitle == "KZ-7"){
            textV.setText("Название: КЗ-7\nДиаметр: 162 мм.\nМасса: 6500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kz7)
        }
        if(CatalTitle == "КЗК" || CatalTitle == "KZK"){
            textV.setText("Название: КЗК\nДлина: 200 мм.\nМасса: 18000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kzk)
        }
        if(CatalTitle == "КЗУ-2" || CatalTitle == "KZU-2"){
            textV.setText("Название: КЗУ-2\nДлина: 150 мм.\nМасса: 900 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kzy2)
        }
        if(CatalTitle == "КЗУ" || CatalTitle == "KZU"){
            textV.setText("Название: КЗУ\nДлина: 500 мм.\nМасса: 18000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kzy)
        }
        if(CatalTitle == "КПОМ-2" || CatalTitle == "KPOM-2"){
            textV.setText("Название: КПОМ-2\nДлина: 480 мм.\nМасса: 9600 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kpom2)
        }
        if(CatalTitle == "КПТМ-3" || CatalTitle == "KPTM-3"){
            textV.setText("Название: КПТМ-3\nДлина: 480 мм.\nМасса: 8500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kzy)
        }
        if(CatalTitle == "КРМ-П" || CatalTitle == "KRM-P"){
            textV.setText("Название: КРМ-П\nДлина: 555 мм.\nМасса: 8600 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.krmp)
        }
        if(CatalTitle == "КСО-1С" || CatalTitle == "KSO-1S"){
            textV.setText("Название: КСО-1С\nДлина: 480 мм.\nМасса: 9200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.kso1c)
        }
        if(CatalTitle == "КСФ-1С" || CatalTitle == "KSF-1S"){
            textV.setText("Название: КСФ-1С\nДлина: 480 мм.\nМасса: 9200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ksf1c)
        }
        if(CatalTitle == "ЛКЗ-80" || CatalTitle == "LKZ-80"){
            textV.setText("Название: ЛКЗ-80\nДиаметр: 192 мм.\nМасса: 7200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.lk80)
        }
        if(CatalTitle == "МЗД-21" || CatalTitle == "MZD-21"){
            textV.setText("Название: МЗД-21\nДлина: 87 мм.\nМасса: 290 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mzd21)
        }
        if(CatalTitle == "МЗМ-2" || CatalTitle == "MZM-2"){
            textV.setText("Название: МЗМ-2\nДиаметр: 205 мм.\nМасса: 17700 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mzm_2)
        }
        if(CatalTitle == "МЗМ" || CatalTitle == "MZM"){
            textV.setText("Название: МЗМ\nДиаметр: 220 мм.\nМасса: 6500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mzm)
        }
        if(CatalTitle == "МЗС" || CatalTitle == "MZS"){
            textV.setText("Название: МЗС\nДиаметр: 227 мм.\nМасса: 7000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mzs)
        }
        if(CatalTitle == "МЗУ-2" || CatalTitle == "MZU-2"){
            textV.setText("Название: МЗУ-2\nДлина: 193 мм.\nМасса: 700 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mzy2)
        }
        if(CatalTitle == "МЗУ" || CatalTitle == "MZU"){
            textV.setText("Название: МЗУ\nДиаметр: 200 мм.\nМасса: 19000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mzy)
        }
        if(CatalTitle == "МИБ" || CatalTitle == "MIB"){
            textV.setText("Название: МИБ\nДиаметр: 61 мм.\nМасса: 830 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mib)
        }
        if(CatalTitle == "МЛ-7" || CatalTitle == "ML-7"){
            textV.setText("Название: МЛ-7\nДлина: 72 мм.\nМасса: 100 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ml7)
        }
        if(CatalTitle == "МЛ-8" || CatalTitle == "ML-8"){
            textV.setText("Название: МЛ-8\nДлина: 114 мм.\nМасса: 370 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ml8)
        }
        if(CatalTitle == "МОН-50" || CatalTitle == "MON-50"){
            textV.setText("Название: МОН-50\nШирина: 226 мм.\nМасса: 2000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mon50)
        }
        if(CatalTitle == "МОН-90" || CatalTitle == "MON-90"){
            textV.setText("Название: МОН-90\nДлина: 345 мм.\nМасса: 12100 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mon90)
        }
        if(CatalTitle == "МОН-100" || CatalTitle == "MON-100"){
            textV.setText("Название: МОН-100\nДиаметр: 236 мм.\nМасса: 5000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mon100)
        }
        if(CatalTitle == "МОН-200" || CatalTitle == "MON-200"){
            textV.setText("Название: МОН-200\nДиаметр: 434 мм.\nМасса: 25000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mon200)
        }
        if(CatalTitle == "МПМ-Э" || CatalTitle == "MPM-E"){
            textV.setText("Название: МПМ-Э\nДлина: 160 мм.\nМасса: 9400 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mpme)
        }
        if(CatalTitle == "МПМ" || CatalTitle == "MPM"){
            textV.setText("Название: МПМ\nДлина: 150 мм.\nМасса: 700 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.mpm)
        }
        if(CatalTitle == "МС-3" || CatalTitle == "MS-3"){
            textV.setText("Название: МС-3\nДиаметр: 110 мм.\nМасса: 660 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ms3)
        }
        if(CatalTitle == "МС-4" || CatalTitle == "MS-4"){
            textV.setText("Название: МС-4\nДлина: 155 мм.\nМасса: 440 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ms4)
        }
        if(CatalTitle == "ОЗ-1" || CatalTitle == "OZ-1"){
            textV.setText("Название: ОЗ-1\nДиаметр: 420 мм.\nМасса: 3500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.oz1)
        }
        if(CatalTitle == "ОЗМ-3" || CatalTitle == "OZM-3"){
            textV.setText("Название: ОЗМ-3\nДиаметр: 76 мм.\nМасса: 3200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ozm3)
        }
        if(CatalTitle == "ОЗМ-4" || CatalTitle == "OZM-4"){
            textV.setText("Название: ОЗМ-4\nДиаметр: 90 мм.\nМасса: 5400 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ozm4)
        }
        if(CatalTitle == "ОЗМ-72" || CatalTitle == "OZM-72"){
            textV.setText("Название: ОЗМ-72\nДиаметр: 108 мм.\nМасса: 5000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ozm72)
        }
        if(CatalTitle == "ОЗМ-152" || CatalTitle == "OZM-152"){
            textV.setText("Название: ОЗМ-152\nДиаметр: 180 мм.\nМасса: 50500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ozm152)
        }
        if(CatalTitle == "ПДМ-1М" || CatalTitle == "PDM-1M"){
            textV.setText("Название: ПДМ-1М\nДиаметр: 800 мм.\nМасса: 60000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pdm1m)
        }
        if(CatalTitle == "ПДМ-2" || CatalTitle == "PDM-2"){
            textV.setText("Название: ПДМ-2\nДиаметр: 270 мм.\nМасса: 100000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pdm2)
        }
        if(CatalTitle == "ПДМ-3Я" || CatalTitle == "PDM-3YA"){
            textV.setText("Название: ПДМ-3Я\nДиаметр: 500 мм.\nМасса: 175000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pdm3ya)
        }
        if(CatalTitle == "ПМД-6М" || CatalTitle == "PMD-6M"){
            textV.setText("Название: ПМД-6М\nДлина: 200 мм.\nМасса: 490 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pmd6m)
        }
        if(CatalTitle == "ПМН-2" || CatalTitle == "PMN-2"){
            textV.setText("Название: ПМН-2\nДлина: 120 мм.\nМасса: 400 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pmn2)
        }
        if(CatalTitle == "ПМН-3" || CatalTitle == "PMN-3"){
            textV.setText("Название: ПМН-3\nДиаметр: 122 мм.\nМасса: 600 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pmn3)
        }
        if(CatalTitle == "ПМН-4" || CatalTitle == "PMN-4"){
            textV.setText("Название: ПМН-4\nДиаметр: 95 мм.\nМасса: 300 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pmn4)
        }
        if(CatalTitle == "ПМН" || CatalTitle == "PMN"){
            textV.setText("Название: ПМН\nДиаметр: 110 мм.\nМасса: 550 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pmn)
        }
        if(CatalTitle == "ПМП" || CatalTitle == "PMP"){
            textV.setText("Название: ПМП\nДиаметр: 36 мм.\nМасса: 145 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pmp)
        }
        if(CatalTitle == "ПОБ" || CatalTitle == "POB"){
            textV.setText("Название: ПМН\nДиаметр: 90 мм.\nМасса: 2300 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pob)
        }
        if(CatalTitle == "ПОМ-1С" || CatalTitle == "POM-1S"){
            textV.setText("Название: ПОМ-1С\nДиаметр: 80 мм.\nМасса: 750 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pom1s)
        }
        if(CatalTitle == "ПТКМ-1Р" || CatalTitle == "PTKM-1R"){
            textV.setText("Название: ПТКМ-1Р\nДиаметр: 220 мм.\n Высота: 510 мм.\nМасса: 20000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ptkm1r)
        }
        if(CatalTitle == "ПОМ3-2М" || CatalTitle == "POM3-2M"){
            textV.setText("Название: ПОМ3-2М\nДиаметр: 60 мм.\nМасса: 1200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pom32m)
        }
        if(CatalTitle == "ПСМ" || CatalTitle == "PSM"){
            textV.setText("Название: ПСМ\nДлина: 2500 мм.\nМасса: 65000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.psm)
        }
        if(CatalTitle == "ПТМ-3" || CatalTitle == "PTM-3"){
            textV.setText("Название: ПТМ-3\nДлина: 330 мм.\nМасса: 4900 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ptm3)
        }
        if(CatalTitle == "ПТМ-4" || CatalTitle == "PTM-4"){
            textV.setText("Название: ПТМ-4\nДлина: 350 мм.\nМасса: 3250 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ptm4)
        }
        if(CatalTitle == "ПТМ1-Г" || CatalTitle == "PTM1-G"){
            textV.setText("Название: ПТМ1-Г\nДлина: 337 мм.\nМасса: 1600 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ptm1g)
        }
        if(CatalTitle == "ПФМ-1С" || CatalTitle == "PFM-1S"){
            textV.setText("Название: ПФМ-1С\nДлина: 119 мм.\nМасса: 80 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.pfm1c)
        }
        if(CatalTitle == "СЗ-1П" || CatalTitle == "SZ-1P"){
            textV.setText("Название: СЗ-1П\nДиаметр: 45 мм.\nМасса: 1500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.sz1p)
        }
        if(CatalTitle == "СЗ-1Э" || CatalTitle == "SZ-1E"){
            textV.setText("Название: СЗ-1Э\nДлина: 2000 мм.\nМасса: 1050 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.sz1e)
        }
        if(CatalTitle == "СЗ-3А" || CatalTitle == "SZ-3A"){
            textV.setText("Название: СЗ-3А\nДлина: 98 мм.\nМасса: 3700 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.sz3a)
        }
        if(CatalTitle == "СЗ-4П" || CatalTitle == "SZ-4P"){
            textV.setText("Название: СЗ-4П\nДиаметр: 45 мм.\nМасса: 4200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.sz4p)
        }
        if(CatalTitle == "СЗ-6М" || CatalTitle == "SZ-6M"){
            textV.setText("Название: СЗ-6М\nДиаметр: 82 мм.\nМасса: 6900 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.sz6m)
        }
        if(CatalTitle == "СМ" || CatalTitle == "SM"){
            textV.setText("Название: СМ\nДиаметр: 25 мм.\nМасса: 400 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.sm)
        }
        if(CatalTitle == "СПМ" || CatalTitle == "SPM"){
            textV.setText("Название: ПОМ3-2М\nДлина: 280 мм.\nМасса: 3000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.spm)
        }
        if(CatalTitle == "СРМ" || CatalTitle == "SRM"){
            textV.setText("Название: СРМ\nДиаметр: 310 мм.\nМасса: 40000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.srm)
        }
        if(CatalTitle == "ТМ-57" || CatalTitle == "TM-57"){
            textV.setText("Название: ТМ-57\nДиаметр: 320 мм.\nМасса: 1200 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm57)
        }
        if(CatalTitle == "ТМ-62Д" || CatalTitle == "TM-62D"){
            textV.setText("Название: ТМ-62Д\nДлина: 340 мм.\nМасса: 11300 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm62d)
        }
        if(CatalTitle == "ТМ-62М" || CatalTitle == "TM-62M"){
            textV.setText("Название: ТМ-62М\nДиаметр: 320 мм.\nМасса: 9500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm62m)
        }
        if(CatalTitle == "ТМ-62П2" || CatalTitle == "TM-62P2"){
            textV.setText("Название: ТМ-62П2\nДиаметр: 320 мм.\nМасса: 9400 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm62p2)
        }
        if(CatalTitle == "ТМ-62П3" || CatalTitle == "TM-62P3"){
            textV.setText("Название: ТМ-62П3\nДиаметр: 320 мм.\nМасса: 8000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm62p3)
        }
        if(CatalTitle == "ТМ-62Т" || CatalTitle == "TM-62T"){
            textV.setText("Название: ТМ-62Т\nДиаметр: 320 мм.\nМасса: 8300 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm62t)
        }
        if(CatalTitle == "ТМ-72" || CatalTitle == "TM-72"){
            textV.setText("Название: ТМ-72\nДиаметр: 250 мм.\nМасса: 6000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm72)
        }
        if(CatalTitle == "ТМ-73" || CatalTitle == "TM-73"){
            textV.setText("Название: ТМ-73\nДиаметр: 280 мм.\nМасса: 8000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm73)
        }
        if(CatalTitle == "ТМ-83" || CatalTitle == "TM-83"){
            textV.setText("Название: ТМ-83\nДиаметр: 250 мм.\nМасса: 20400 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm83)
        }
        if(CatalTitle == "ТМ-89" || CatalTitle == "TM-89"){
            textV.setText("Название: ТМ-89\nДиаметр: 320 мм.\nМасса: 11500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tm89)
        }
        if(CatalTitle == "ТМК-2" || CatalTitle == "TMK-2"){
            textV.setText("Название: ТМК-2\nДиаметр: 307 мм.\nМасса: 12000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.tmk2)
        }
        if(CatalTitle == "УМКЗ" || CatalTitle == "UMKZ"){
            textV.setText("Название: УМКЗ\nДлина: 150 мм.\nМасса: 560 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ymk3)
        }
        if(CatalTitle == "УПМ" || CatalTitle == "UPM"){
            textV.setText("Название: УПМ\nДлина: 530 мм.\nМасса: 14500 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.ypm)
        }
        if(CatalTitle == "ЯРМ" || CatalTitle == "YARM"){
            textV.setText("Название: ЯРМ\nДиаметр: 270 мм.\nМасса: 13000 г.\nСтрана: СССР/РФ")
            img.setImageResource(R.drawable.yarm)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}