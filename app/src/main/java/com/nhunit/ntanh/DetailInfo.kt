package com.nhunit.ntanh

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailInfo: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var textName: String? = intent.getStringExtra("name")
        Show_textName.text =textName.toString()
        var textCMND: String? = intent.getStringExtra("cmnd")
        Show_textCMND.text =textCMND.toString()
        var textBC: String? = intent.getStringExtra("bangcap")
        Show_rdo_bc.text = textBC.toString()
        var textST: String? = intent.getStringExtra("sothich")
        Show_rdo_sothich.text = textST.toString()
        var textADD: String? =intent.getStringExtra("add")
        Show_edit_text.text =textADD.toString()
    }
}