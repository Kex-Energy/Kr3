package com.example.myapplication2

import CustomerInfo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

var ListofCustomers1 = ArrayList<CustomerInfo>()
var ListofCustomers2 = ArrayList<CustomerInfo>()
var ListofCustomers3 = ArrayList<CustomerInfo>()

class MainActivity : AppCompatActivity() {

    lateinit var textbox1:EditText
    lateinit var textbox2:EditText
    lateinit var textbox3:EditText
    lateinit var textbox4:EditText
    lateinit var textbox5:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textbox1 = findViewById<EditText>(R.id.editTextText)
        textbox2 = findViewById<EditText>(R.id.editTextText2)
        textbox3 = findViewById<EditText>(R.id.editTextNumberDecimal)
        textbox4 = findViewById<EditText>(R.id.editTextNumberDecimal2)
        textbox5 = findViewById<EditText>(R.id.editTextDate)
        findViewById<Button>(R.id.button).setOnClickListener(View.OnClickListener { Click1() })
        findViewById<Button>(R.id.button2).setOnClickListener(View.OnClickListener { Click2() })
    }
    fun Click1(){
        var elem = CustomerInfo(textbox1.text.toString(),textbox2.text.toString(),textbox3.text.toString(),textbox4.text.toString(),textbox5.text.toString())
        ListofCustomers1.add(elem)
        var elem1 = CustomerInfo(textbox1.text.toString(),textbox2.text.toString(),"","",textbox5.text.toString())
        ListofCustomers2.add(elem1)
        var elem2 = CustomerInfo(textbox1.text.toString(),textbox2.text.toString(),"",textbox4.text.toString(),"")
        ListofCustomers3.add(elem2)
    }
    fun Click2(){
        val intent = Intent(this, ShowActivity::class.java)
        startActivity(intent)
    }
}