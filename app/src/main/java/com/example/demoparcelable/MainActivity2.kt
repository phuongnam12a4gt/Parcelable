package com.example.demoparcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoparcelable.model.Example
import com.example.demoparcelable.model.PhieuChi
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var intent=intent
        var bundle=intent.extras
        if(bundle!=null)
        {
            if(bundle.getParcelable<Example>("key1") is Example)
            {
                var kq:Example?=bundle.getParcelable<Example>("key1")
                if (kq != null) {
                    mtextview.setText(kq.name)
                }
            }
            if(bundle.getParcelable<PhieuChi>("key1") is PhieuChi)
            {
                var kq:PhieuChi?=bundle.getParcelable<PhieuChi>("key1")
                if (kq != null) {
                    mtextview.setText(kq.mdata)
                }
            }
        }
    }
}