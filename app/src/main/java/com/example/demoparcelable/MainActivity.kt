package com.example.demoparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mbutton.setOnClickListener {
            var phieuChi: PhieuChi = PhieuChi("Truyền Dữ Liệu Dùng Parcelable")
            var bundle: Bundle = Bundle()
            bundle.putParcelable("key1", phieuChi)
            var intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}