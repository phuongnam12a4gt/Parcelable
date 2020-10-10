package com.example.demoparcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent=intent
        var bundle=intent.extras
        if(bundle!=null)
        {
            var phieuchi: PhieuChi? =bundle.getParcelable("key1")
            if (phieuchi != null) {
                mtextview.setText(phieuchi.mdata)
            }
        }
    }
}