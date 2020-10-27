package com.example.tt

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val b : Button = findViewById(R.id.button)
//        b.setOnClickListener{
//            val t:TextView= findViewById(R.id.textView)
//            t.setTextColor(Color.RED)
//        }

        var hasil = ""
        val text : TextView = findViewById(R.id.Text2)
        val text2 : TextView = findViewById(R.id.Text)
        text.setText(null)
        text2.setText(null)

        val b1 : Button = findViewById(R.id.b1)
        val b2 : Button = findViewById(R.id.b2)
        val b3 : Button = findViewById(R.id.b3)
        val b4 : Button = findViewById(R.id.b4)
        val b5 : Button = findViewById(R.id.b5)
        val b6 : Button = findViewById(R.id.b6)
        val b7 : Button = findViewById(R.id.b7)
        val b8 : Button = findViewById(R.id.b8)
        val b9 : Button = findViewById(R.id.b9)
        val b0 : Button = findViewById(R.id.b0)
        val bp : Button = findViewById(R.id.bp)
        val bm : Button = findViewById(R.id.bm)
        val bk : Button = findViewById(R.id.bk)
        val bb : Button = findViewById(R.id.bb)
        val bs : Button = findViewById(R.id.bs)
        val bd : Button = findViewById(R.id.bd)

        b1.setOnClickListener{
            hasil = hasil + "1"
            text.setText("1")
            text2.setText(hasil)
        }
        b2.setOnClickListener{
            hasil = hasil + "2"
            text.setText("2")
            text2.setText(hasil)
        }
        b3.setOnClickListener{
            hasil = hasil + "3"
            text.setText("3")
            text2.setText(hasil)
        }
        b4.setOnClickListener{
            hasil = hasil + "4"
            text.setText("4")
            text2.setText(hasil)
        }
        b5.setOnClickListener{
            hasil = hasil + "5"
            text.setText("5")
            text2.setText(hasil)
        }
        b6.setOnClickListener{
            hasil = hasil + "6"
            text.setText("6")
            text2.setText(hasil)
        }
        b7.setOnClickListener{
            hasil = hasil + "7"
            text.setText("7")
            text2.setText(hasil)
        }
        b8.setOnClickListener{
            hasil = hasil + "8"
            text.setText("8")
            text2.setText(hasil)
        }
        b9.setOnClickListener{
            hasil = hasil + "9"
            text.setText("9")
            text2.setText(hasil)
        }
        b0.setOnClickListener{
            hasil = hasil + "0"
            text.setText("0")
            text2.setText(hasil)
        }
        bp.setOnClickListener{
            hasil = hasil + " + "
            text.setText("+")
            text2.setText(hasil)
        }
        bm.setOnClickListener{
            hasil = hasil + " - "
            text.setText("-")
            text2.setText(hasil)
        }
        bk.setOnClickListener{
            hasil = hasil + " * "
            text.setText("X")
            text2.setText(hasil)
        }
        bb.setOnClickListener{
            hasil = hasil + " / "
            text.setText("/")
            text2.setText(hasil)
        }
        bs.setOnClickListener{
            val spl = hasil.split(" ")
            val in1 = spl.get(0)
            val in2 = spl.get(2)
            val op = spl.get(1)
            var hasil1 = 0
            if (op == "+"){
                hasil1 = in1.toInt() + in2.toInt()
            }
            else if (op == "-"){
                hasil1 = in1.toInt() - in2.toInt()
            }
            else if (op == "*"){
                hasil1 = in1.toInt() * in2.toInt()
            }
            else if (op == "/") {
                hasil1 = in1.toInt() / in2.toInt()
            }
            text.setText(hasil1.toString())
            text2.setText(hasil)
        }
        bd.setOnClickListener{
            text.setText(null)
            hasil = ""
        }
    }
}