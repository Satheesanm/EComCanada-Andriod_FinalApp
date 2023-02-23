package com.online.e_comcanada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

lateinit var cartName: TextView
lateinit var cartPrice: TextView

class MyCart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart)

//
//        val sharedPref = getSharedPreferences("myPrefe", MODE_PRIVATE)
//        val s23name = sharedPref.getString("s23name", null).toString()
//        val s23price = sharedPref.getString("s23price", null).toString()
//        val s23description = sharedPref.getString("s23description", null).toString()

        cartName=findViewById(R.id.cartName)
        cartName.setText(R.string.s23name)
        cartPrice=findViewById(R.id.cartPrice)
        cartPrice.setText(R.string.s23price)
    }
}