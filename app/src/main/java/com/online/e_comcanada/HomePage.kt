package com.online.e_comcanada

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity(){

    lateinit var title: TextView


    lateinit var displayImage: ImageView
    lateinit var itemname: TextView
    lateinit var itemDescription: TextView
    lateinit var itemPrice: TextView
    lateinit var addToCard: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


    }
    fun SamsungGalaxy23(view: View?) {
        setContentView(R.layout.activity_address)
        displayImage = findViewById(R.id.displayimage)
        displayImage.setImageResource(R.drawable.galaxys23)
        itemname = findViewById(R.id.itemname)
        itemname.setText(R.string.s23name)
        itemDescription = findViewById(R.id.description_part)
        itemDescription.setText(R.string.s23description)
        itemPrice = findViewById(R.id.item_detail_price)
        itemPrice.setText(R.string.s23price)
        addToCard = findViewById(R.id.btnaddtoCard)


        addToCard.setOnClickListener {
            startActivity(Intent(this@HomePage, MyCart::class.java))
        }
    }

    fun SamsungGalaxy22(view: View?) {
        setContentView(R.layout.activity_prooduct_details)
//         title = findViewById(R.id.homeTitle2)
//        title.setText("Galaxy22")
    }
   }

