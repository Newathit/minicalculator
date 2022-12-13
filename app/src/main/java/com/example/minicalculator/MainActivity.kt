package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Context
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener {
            sym.setText("+")
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if(n1 == "" || n2 == ""){
                toast{
                    "Please Input Num1 and Num2!!!"
                }
                sym.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var re = n1.toDouble() + n2.toDouble()
                result.setText(re.toString())
            }
        }

        minus.setOnClickListener {
            sym.setText("-")
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if(n1 == "" || n2 == ""){
                toast{
                    "Please Input Num1 and Num2!!!"
                }
                sym.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var re = n1.toDouble() - n2.toDouble()
                result.setText(re.toString())
            }
        }

        multiply.setOnClickListener {
            sym.setText("*")
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if(n1 == "" || n2 == ""){
                toast{
                    "Please Input Num1 and Num2!!!"
                }
                sym.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var re = n1.toDouble() * n2.toDouble()
                result.setText(re.toString())
            }
        }

        divider.setOnClickListener {
            sym.setText("/")
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if(n1 == "" || n2 == ""){
                toast{
                    "Please Input Num1 and Num2!!!"
                }
                sym.text = ""
                num1.setText("")
                num2.setText("")
            }
            else if(n2 == "0"){
                toast {
                    "Do Not Num2 is Zero or Null!!!"
                }
                sym.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var re = n1.toDouble() / n2.toDouble()
                result.setText(re.toString())
            }
        }

        modulo.setOnClickListener {
            sym.setText("%")
            var n1 = num1.text.toString()
            var n2 = num2.text.toString()
            if(n1 == "" || n2 == ""){
                toast{
                    "Please Input Num1 and Num2!!!"
                }
                sym.text = ""
                num1.setText("")
                num2.setText("")
            }
            else {
                var re = n1.toDouble() % n2.toDouble()
                result.setText(re.toString())
            }
        }

        clear.setOnClickListener {
            num1.setText("")
            num2.setText("")
            result.setText("")
            sym.setText("")
        }
    }
}
inline fun Context.toast(message:()->String) {
    Toast.makeText(this, message(), Toast.LENGTH_LONG).show()
}