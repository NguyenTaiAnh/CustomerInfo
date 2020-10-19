package com.nhunit.ntanh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btn_send.setOnClickListener {
//            var intent = Intent(this,DetailInfo::class.java)
//            this.startActivity(intent)
//        }
        btn_send.setOnClickListener() {
            var intent = Intent(this,DetailInfo::class.java)
            intent.putExtra("cmnd",textCMND.text.toString())
            intent.putExtra("name",textName.text.toString())
            var btn_rdo = ""
            if(rdo_bc.checkedRadioButtonId == rdo_tc.id){
                btn_rdo = rdo_tc.text.toString()
            }
            else if (rdo_bc.checkedRadioButtonId == rdo_cd.id){
                btn_rdo = rdo_cd.text.toString()
            }
            else if (rdo_bc.checkedRadioButtonId == rdo_dh.id){
                btn_rdo = rdo_dh.text.toString()
            }
            intent.putExtra("bangcap",btn_rdo.toString())
            var btn_cbx = ""
            if (cbx_db.isChecked==true){
                btn_cbx += cbx_db.text.toString()
            }
            if(cbx_ds.isChecked==true){
                btn_cbx +=cbx_hcode.text.toString()
            }
            if(cbx_hcode.isChecked ==true){
                btn_cbx += cbx_ds.text.toString()
            }

            intent.putExtra("sothich",btn_cbx.toString())
            intent.putExtra("add",edit_add.text.toString())
            startActivity(intent)

        }

    }


}