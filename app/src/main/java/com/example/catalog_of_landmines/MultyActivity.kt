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
import com.google.android.material.tabs.TabLayout


class MultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        fun processString(input: String): String {
            // Убираем '[' в начале строки и ']' в конце строки
            var result = input.trimStart('[').trimEnd(']')

            // Заменяем все '\n' на переносы строк
            result = result.replace("\\n", "\n")

            return result
        }

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multy)
        val dbHelper = DatabaseHelper(this)

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

        val s = dbHelper.getColumnData("description", CatalTitle)
        val input = processString(s.toString())
        textV.setText(input)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayoutBase)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
        val pos = tabLayout.selectedTabPosition
        if(pos == 0){
            val s = dbHelper.getColumnData("description", CatalTitle)
            val input = processString(s.toString())
            textV.setText(input)
        }
        else if(pos == 1){
            val s = dbHelper.getColumnData("mechanism", CatalTitle)
            val input = processString(s.toString())
            textV.setText(input)
                }
                else if(pos == 2){
            val s = dbHelper.getColumnData("principle", CatalTitle)
            val input = processString(s.toString())
            textV.setText(input)
                }
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        if(CatalTitle == "ЗМГ"){
            img.setImageResource(R.drawable.zmg)
        }
        if(CatalTitle == "АДМ-8"){
            img.setImageResource(R.drawable._8)
        }
        if(CatalTitle == "БПМ"){
            img.setImageResource(R.drawable.bpm)
        }
        if(CatalTitle == "БЗЗ-2"){
            img.setImageResource(R.drawable.bzz2)
        }
        if(CatalTitle == "ДКРП-4"){
            img.setImageResource(R.drawable.dkrp4)
        }
        if(CatalTitle == "ЗЗ-1"){
            img.setImageResource(R.drawable.zz1)
        }
        if(CatalTitle == "ЗРП-2"){
            img.setImageResource(R.drawable.zrp2)
        }
        if(CatalTitle == "КЗ-2"){
            img.setImageResource(R.drawable.kz2)
        }
        if(CatalTitle == "КЗ-4"){
            img.setImageResource(R.drawable.kz4)
        }
        if(CatalTitle == "КЗ-5"){
            img.setImageResource(R.drawable.kz5)
        }
        if(CatalTitle == "КЗ-6"){
            img.setImageResource(R.drawable.kz6)
        }
        if(CatalTitle == "КЗ-7"){
            img.setImageResource(R.drawable.kz7)
        }
        if(CatalTitle == "КЗК"){
            img.setImageResource(R.drawable.kzk)
        }
        if(CatalTitle == "КЗУ-2"){
            img.setImageResource(R.drawable.kzy2)
        }
        if(CatalTitle == "КЗУ"){
            img.setImageResource(R.drawable.kzy)
        }
        if(CatalTitle == "КПОМ-2"){
            img.setImageResource(R.drawable.kpom2)
        }
        if(CatalTitle == "КПТМ-3"){
            img.setImageResource(R.drawable.kzy)
        }
        if(CatalTitle == "КРМ-П"){
            img.setImageResource(R.drawable.krmp)
        }
        if(CatalTitle == "КСО-1С"){
            img.setImageResource(R.drawable.kso1c)
        }
        if(CatalTitle == "КСФ-1С"){
            img.setImageResource(R.drawable.ksf1c)
        }
        if(CatalTitle == "ЛКЗ-80"){
            img.setImageResource(R.drawable.lk80)
        }
        if(CatalTitle == "МЗД-21"){
            img.setImageResource(R.drawable.mzd21)
        }
        if(CatalTitle == "МЗМ-2"){
            img.setImageResource(R.drawable.mzm_2)
        }
        if(CatalTitle == "МЗМ"){
            img.setImageResource(R.drawable.mzm)
        }
        if(CatalTitle == "МЗС"){
            img.setImageResource(R.drawable.mzs)
        }
        if(CatalTitle == "МЗУ-2"){
            img.setImageResource(R.drawable.mzy2)
        }
        if(CatalTitle == "МЗУ"){
            img.setImageResource(R.drawable.mzy)
        }
        if(CatalTitle == "МИБ"){
            img.setImageResource(R.drawable.mib)
        }
        if(CatalTitle == "МЛ-7"){
            img.setImageResource(R.drawable.ml7)
        }
        if(CatalTitle == "МЛ-8"){
            img.setImageResource(R.drawable.ml8)
        }
        if(CatalTitle == "МОН-50"){
            img.setImageResource(R.drawable.mon50)
        }
        if(CatalTitle == "МОН-90"){
            img.setImageResource(R.drawable.mon90)
        }
        if(CatalTitle == "МОН-100"){
            img.setImageResource(R.drawable.mon100)
        }
        if(CatalTitle == "МОН-200"){
            img.setImageResource(R.drawable.mon200)
        }
        if(CatalTitle == "МПМ-Э"){
            img.setImageResource(R.drawable.mpme)
        }
        if(CatalTitle == "МПМ"){
            img.setImageResource(R.drawable.mpm)
        }
        if(CatalTitle == "МС-3"){
            img.setImageResource(R.drawable.ms3)
        }
        if(CatalTitle == "МС-4"){
            img.setImageResource(R.drawable.ms4)
        }
        if(CatalTitle == "ОЗ-1"){
            img.setImageResource(R.drawable.oz1)
        }
        if(CatalTitle == "ОЗМ-3"){
            img.setImageResource(R.drawable.ozm3)
        }
        if(CatalTitle == "ОЗМ-4"){
            img.setImageResource(R.drawable.ozm4)
        }
        if(CatalTitle == "ОЗМ-72"){
            img.setImageResource(R.drawable.ozm72)
        }
        if(CatalTitle == "ОЗМ-152"){
            img.setImageResource(R.drawable.ozm152)
        }
        if(CatalTitle == "ПДМ-1М"){
            img.setImageResource(R.drawable.pdm1m)
        }
        if(CatalTitle == "ПДМ-2"){
            img.setImageResource(R.drawable.pdm2)
        }
        if(CatalTitle == "ПДМ-3Я"){
            img.setImageResource(R.drawable.pdm3ya)
        }
        if(CatalTitle == "ПМД-6М"){
            img.setImageResource(R.drawable.pmd6m)
        }
        if(CatalTitle == "ПМН-2"){
            img.setImageResource(R.drawable.pmn2)
        }
        if(CatalTitle == "ПМН-3"){
            img.setImageResource(R.drawable.pmn3)
        }
        if(CatalTitle == "ПМН-4"){
            img.setImageResource(R.drawable.pmn4)
        }
        if(CatalTitle == "ПМН"){
            img.setImageResource(R.drawable.pmn)
        }
        if(CatalTitle == "ПМП"){
            img.setImageResource(R.drawable.pmp)
        }
        if(CatalTitle == "ПОБ"){
            img.setImageResource(R.drawable.pob)
        }
        if(CatalTitle == "ПОМ-1С"){
            img.setImageResource(R.drawable.pom1s)
        }
        if(CatalTitle == "ПТКМ-1Р"){
            img.setImageResource(R.drawable.ptkm1r)
        }
        if(CatalTitle == "ПОМ3-2М"){
            img.setImageResource(R.drawable.pom32m)
        }
        if(CatalTitle == "ПСМ"){
            img.setImageResource(R.drawable.psm)
        }
        if(CatalTitle == "ПТМ-3"){
            img.setImageResource(R.drawable.ptm3)
        }
        if(CatalTitle == "ПТМ-4"){
            img.setImageResource(R.drawable.ptm4)
        }
        if(CatalTitle == "ПТМ1-Г"){
            img.setImageResource(R.drawable.ptm1g)
        }
        if(CatalTitle == "ПФМ-1С"){
            img.setImageResource(R.drawable.pfm1c)
        }
        if(CatalTitle == "СЗ-1П"){
            img.setImageResource(R.drawable.sz1p)
        }
        if(CatalTitle == "СЗ-1Э"){
            img.setImageResource(R.drawable.sz1e)
        }
        if(CatalTitle == "СЗ-3А"){
            img.setImageResource(R.drawable.sz3a)
        }
        if(CatalTitle == "СЗ-4П"){
            img.setImageResource(R.drawable.sz4p)
        }
        if(CatalTitle == "СЗ-6М"){
            img.setImageResource(R.drawable.sz6m)
        }
        if(CatalTitle == "СМ"){
            img.setImageResource(R.drawable.sm)
        }
        if(CatalTitle == "СПМ"){
            img.setImageResource(R.drawable.spm)
        }
        if(CatalTitle == "СРМ"){
            img.setImageResource(R.drawable.srm)
        }
        if(CatalTitle == "ТМ-57"){
            img.setImageResource(R.drawable.tm57)
        }
        if(CatalTitle == "ТМ-62Д"){
            img.setImageResource(R.drawable.tm62d)
        }
        if(CatalTitle == "ТМ-62М"){
            img.setImageResource(R.drawable.tm62m)
        }
        if(CatalTitle == "ТМ-62П2"){
            img.setImageResource(R.drawable.tm62p2)
        }
        if(CatalTitle == "ТМ-62П3"){
            img.setImageResource(R.drawable.tm62p3)
        }
        if(CatalTitle == "ТМ-62Т"){
            img.setImageResource(R.drawable.tm62t)
        }
        if(CatalTitle == "ТМ-72"){
            img.setImageResource(R.drawable.tm72)
        }
        if(CatalTitle == "ТМ-73"){
            img.setImageResource(R.drawable.tm73)
        }
        if(CatalTitle == "ТМ-83"){
            img.setImageResource(R.drawable.tm83)
        }
        if(CatalTitle == "ТМ-89"){
            img.setImageResource(R.drawable.tm89)
        }
        if(CatalTitle == "ТМК-2"){
            img.setImageResource(R.drawable.tmk2)
        }
        if(CatalTitle == "УМКЗ"){
            img.setImageResource(R.drawable.ymk3)
        }
        if(CatalTitle == "УПМ"){
            img.setImageResource(R.drawable.ypm)
        }
        if(CatalTitle == "ЯРМ"){
            img.setImageResource(R.drawable.yarm)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}