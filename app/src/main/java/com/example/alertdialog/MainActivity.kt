package com.example.alertdialog

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this@MainActivity,"Test Toast message",Toast.LENGTH_SHORT).show()

    }



    fun buton(view : View){
        val alert = AlertDialog.Builder(this@MainActivity)

        alert.setTitle("Title Test")
        alert.setMessage("Message Test")

        alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity,"Yes clicked",Toast.LENGTH_SHORT).show()
            }

        })

        alert.setNegativeButton("No"){ p0,p1 ->
        System.out.println(p0.toString());
            System.out.println(p1.toString());
        }

        alert.show()


    }
}