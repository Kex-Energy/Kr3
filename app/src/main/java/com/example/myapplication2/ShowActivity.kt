package com.example.myapplication2

import CustomerInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class ShowActivity : AppCompatActivity() {
    lateinit var ListBox:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)
        findViewById<Button>(R.id.button4).setOnClickListener(View.OnClickListener { allClick() })
        findViewById<Button>(R.id.button5).setOnClickListener(View.OnClickListener { nameBDayClick() })
        findViewById<Button>(R.id.button6).setOnClickListener(View.OnClickListener { nameWeightClick() })
        ListBox = findViewById(R.id.Listbox)
    }
    fun allClick(){
        var adapter = ArrayAdapter<CustomerInfo>(this,android.R.layout.simple_list_item_1, ListofCustomers1)
        ListBox.adapter = adapter
    }
    fun nameBDayClick(){
        var adapter = ArrayAdapter<CustomerInfo>(this,android.R.layout.simple_list_item_1, ListofCustomers2)
        ListBox.adapter = adapter
    }
    fun nameWeightClick(){
        var adapter = ArrayAdapter<CustomerInfo>(this,android.R.layout.simple_list_item_1, ListofCustomers3)
        ListBox.adapter = adapter
    }
}