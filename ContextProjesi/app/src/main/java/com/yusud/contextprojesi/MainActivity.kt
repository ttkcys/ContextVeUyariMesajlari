package com.yusud.contextprojesi

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast, Alert Messages
        //applicationContext --> app context
        //this, this@MainActivity --> aktivitenin contexti

        Toast.makeText(this,"Hoşgeldin!",Toast.LENGTH_LONG).show()
    }

    fun mesajGoster(view : View){
        val uyariMesaji = AlertDialog.Builder(this@MainActivity)
        uyariMesaji.setTitle("ŞİFRE HATASI")
        uyariMesaji.setMessage("Şifreyi girmediniz. Baştan denemek ister misiniz?")

        //Lambda Gösterimi
        uyariMesaji.setPositiveButton("Evet", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Baştan Dene",Toast.LENGTH_LONG).show()
        })
        uyariMesaji.setNegativeButton("Hayır") {dialogInterface, i ->
            Toast.makeText(this,"Deneyemiceksin",Toast.LENGTH_LONG).show()
        }

        uyariMesaji.show()
    }
}