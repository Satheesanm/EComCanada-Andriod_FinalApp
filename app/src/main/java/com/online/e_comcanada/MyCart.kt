package com.online.e_comcanada

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat

lateinit var cartName: TextView
lateinit var cartPrice: TextView
lateinit var cartTax: TextView
lateinit var cartImage: ImageView
lateinit var checkout: Button
lateinit var quantityOfItems: TextView

 var quantity = 0
lateinit var nameOfItem: String
lateinit var quantityOfItem: String
lateinit var totalPrice: String

class MyCart : AppCompatActivity(), View.OnClickListener {
    private val displayImage: ImageView by lazy { findViewById(R.id.displayimage) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart)
        val intent = intent
        val extras = intent.extras
        val itemName = intent.getStringExtra("name")
        val itemprice = intent.getStringExtra("price")
      supportActionBar?.setDisplayHomeAsUpEnabled(true)
       cartName=findViewById(R.id.cartName)
       cartName.setText(itemName)
       cartPrice=findViewById(R.id.cartPrice)
       cartPrice.setText(itemprice)

        if(itemName==SharedPref.mSamsungName){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.galaxys23)
        }
        if(itemName==SharedPref.mSamsungs22Name){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.galaxys22)
        }
        if(itemName==SharedPref.mSamsungs21Name){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.galaxys21)
        }
        if(itemName==SharedPref.mphone14){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.i14)
        }
        if(itemName==SharedPref.mphone13){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.i13)
        }
        if(itemName==SharedPref.mphone12){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.i12)
        }
        if(itemName==SharedPref.mGooglePixel7){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.pixel7)
        }
        if(itemName==SharedPref.mGooglePixel6){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.pixel6)
        }
        if(itemName==SharedPref.mGooglePixel6){
            cartImage=findViewById(R.id.cartImage)
            cartImage.setImageResource(R.drawable.pixel5)
        }
        checkout=findViewById(R.id.addToCart_BottomSheet)
        checkout.setOnClickListener(this)
        quantityOfItems=findViewById(R.id.addToCart_BottomSheet)
        quantityOfItem = quantityOfItems.text.toString()
    }



    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.addToCart_BottomSheet) {
            val intent = Intent(this@MyCart, DeliveryAddress::class.java)
            startActivity(intent)
        }
    }

    fun increment(view: View?) {
        quantity = quantity + 1
        display(quantity)
        displayPrice(quantity * (1699.90)+1699.90*0.13)
        displayPricewoTaxt(1699.90)
        displayTax(0.13)
    }


    fun decrement(view: View?) {
        quantity = quantity - 1
        display(quantity)
        displayPrice(quantity * (1699.90)+1699.90*0.13)
        displayPricewoTaxt(1699.90)
        displayTax(0.13)
    }

    private fun displayPrice(number: Double) {
        val priceTextView = findViewById<View>(R.id.tatalvalue) as TextView
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number)
    }

    private fun displayPricewoTaxt(number: Double) {
        val priceTextView = findViewById<View>(R.id.pricevalue) as TextView
        priceTextView.text = NumberFormat.getCurrencyInstance().format(number)
    }

    private fun displayTax(number: Double) {
        val priceTextView = findViewById<View>(R.id.taxvalue) as TextView
        priceTextView.text = NumberFormat.getPercentInstance().format(number)
    }
    private fun display(numbers: Int) {
        val quantityTextView = findViewById<View>(R.id.text_view) as TextView
        quantityTextView.text = "" + numbers
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.home) {
            val intent = Intent(this@MyCart, HomePage::class.java)
            startActivity(intent)
            return true
        }
        if (item.itemId == R.id.logout) {
            Toast.makeText(this@MyCart, "Logged out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MyCart, Login::class.java))
            return true
        }
        if (item.itemId == R.id.Profile) {
            startActivity(Intent(this@MyCart, UserInfo::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}