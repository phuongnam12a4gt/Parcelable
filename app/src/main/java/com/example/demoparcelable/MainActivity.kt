package com.example.demoparcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoparcelable.model.Example
import com.example.demoparcelable.model.PhieuChi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mbutton.setOnClickListener {
            var phieuChi: PhieuChi =
                PhieuChi("Truyền Dữ Liệu Dùng Parcelable")
            var bundle: Bundle = Bundle()
            bundle.putParcelable("key1", phieuChi)
            var intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        mbutton1.setOnClickListener {
            var example: Example =Example("Truyen du lieu dung Parcelable su dung anotation Parcelize")
            var bundle: Bundle = Bundle()
            bundle.putParcelable("key1", example)
            var intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}