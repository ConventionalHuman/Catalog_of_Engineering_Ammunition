package com.example.catalog_of_landmines

import android.os.Bundle
import android.view.SurfaceView
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Activity3D : AppCompatActivity() {

    var surfaceView: SurfaceView? = null
    var customViewer: CustomViewer = CustomViewer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity3_d)
        surfaceView = findViewById<View>(R.id.surfaceView) as SurfaceView
        customViewer.run {
            loadEntity()
            setSurfaceView(requireNotNull(surfaceView))

            val arguments = intent.extras
            val Title3D = arguments!!["model3d"].toString()
            //directory and model each as param

            if(Title3D == "МОН-50" || Title3D == "MON-50"){
                loadGlb(this@Activity3D, "landmine", "mon50")
            }
            else if(Title3D == "МОН-90" || Title3D == "MON-90"){
                loadGlb(this@Activity3D, "landmine", "mon90")
            }
            else if(Title3D == "ТМ-57" || Title3D == "TM-57"){
                loadGlb(this@Activity3D, "landmine", "tm57")
            }
            else if(Title3D == "ТМ-62Д" || Title3D == "TM-62D"){
                loadGlb(this@Activity3D, "landmine", "tm62d")
            }
            else if(Title3D == "ТМ-62М" || Title3D == "TM-62M"){
                loadGlb(this@Activity3D, "landmine", "tm-62-m")
            }
            else if(Title3D == "ТМ-72" || Title3D == "TM-72"){
                loadGlb(this@Activity3D, "landmine", "tm-72")
            }
            else if(Title3D == "ТМ-62П2" || Title3D == "TM-62P2"){
                loadGlb(this@Activity3D, "landmine", "tm-62-p2")
            }
            else if(Title3D == "ТМ-62П3" || Title3D == "TM-62P3"){
                loadGlb(this@Activity3D, "landmine", "tm-62p3")
            }
            else if(Title3D == "ТМ-62Т" || Title3D == "TM-62T"){
                loadGlb(this@Activity3D, "landmine", "tm-62t")
            }
            else if(Title3D == "ОЗМ-72" || Title3D == "OZM-72"){
                loadGlb(this@Activity3D, "landmine", "ozm72")
            }
            else if(Title3D == "ПТКМ-1Р" || Title3D == "PTKM-1R"){
                loadGlb(this@Activity3D, "landmine", "ptkm-1r")
            }
            else if(Title3D == "ОЗ-1" || Title3D == "OZ-1"){
                loadGlb(this@Activity3D, "landmine", "oz1")
            }
            else if(Title3D == "ПФМ-1С" || Title3D == "PFM-1S"){
                loadGlb(this@Activity3D, "landmine", "pfm1s")
            }
            else if(Title3D == "ПМН-2" || Title3D == "PMN-2"){
                loadGlb(this@Activity3D, "landmine", "pmn2")
            }
            else if(Title3D == "ПМН" || Title3D == "PMN"){
                loadGlb(this@Activity3D, "landmine", "pmn")
            }
            else if(Title3D == "ПОМ3-2М" || Title3D == "POM3-2M"){
                loadGlb(this@Activity3D, "landmine", "pom3-2m")
            }
            else if(Title3D == "ТМ-89" || Title3D == "TM-89"){
                loadGlb(this@Activity3D, "landmine", "tm89")
            }
            else if(Title3D == "ЗРП-2" || Title3D == "ZRP-2"){
                loadGlb(this@Activity3D, "landmine", "zrp2")
            }
            else if(Title3D == "БПМ" || Title3D == "BPM"){
                loadGlb(this@Activity3D, "landmine", "bpm")
            }
            else{
                loadGlb(this@Activity3D, "landmine", "box")
            }

            //Enviroments and Lightning (OPTIONAL)
            loadIndirectLight(this@Activity3D, "venetian_crossroads_2k")
            loadEnviroment(this@Activity3D, "venetian_crossroads_2k");
        }
    }

    override fun onResume() {
        super.onResume()
        customViewer.onResume()
    }

    override fun onPause() {
        super.onPause()
        customViewer.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        customViewer.onDestroy()
    }
}