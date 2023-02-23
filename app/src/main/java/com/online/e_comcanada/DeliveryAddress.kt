package com.online.e_comcanada


import android.R
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DeliveryAddress : AppCompatActivity(), View.OnClickListener{
    lateinit var sameDay: RadioButton
    lateinit var nextDay: RadioButton
    lateinit var pickUp: RadioButton
    lateinit var spinner: Spinner
    lateinit var name: EditText
    lateinit var address: EditText
    lateinit var phone: EditText
    lateinit var confirm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.online.e_comcanada.R.layout.activity_delivery_address)
        sameDay = findViewById(com.online.e_comcanada.R.id.option_SameDay)
        sameDay.setOnClickListener(this)
        nextDay = findViewById(com.online.e_comcanada.R.id.option_NextDay)
        nextDay.setOnClickListener(this)
        pickUp = findViewById(com.online.e_comcanada.R.id.option_pickup)
        pickUp.setOnClickListener(this)
        confirm = findViewById(com.online.e_comcanada.R.id.confimredorder)
        confirm.setOnClickListener(this)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        confirm.setOnClickListener {
            startActivity(Intent(this@DeliveryAddress, PaymentGate::class.java))
        }
    }

    override fun onClick(v: View) {
        val id = v.id
        when (id) {
            com.online.e_comcanada. R.id.option_SameDay -> Toast.makeText(
                applicationContext,
                "Same Day Messenger Service is Selected",
                Toast.LENGTH_SHORT
            ).show()
            com.online.e_comcanada. R.id.option_NextDay -> Toast.makeText(
                applicationContext,
                "Next Day ground Delivery is Selected",
                Toast.LENGTH_SHORT
            ).show()
            com.online.e_comcanada. R.id.option_pickup -> Toast.makeText(
                applicationContext,
                "Pick up is Selected",
                Toast.LENGTH_SHORT
            ).show()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(com.online.e_comcanada.R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == com.online.e_comcanada.R.id.home) {
            val intent = Intent(this@DeliveryAddress, HomePage::class.java)
            startActivity(intent)
            return true
        }
        if (item.itemId == com.online.e_comcanada.R.id.logout) {
            Toast.makeText(this@DeliveryAddress, "Logged out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@DeliveryAddress, Login::class.java))
            return true
        }
        if (item.itemId == com.online.e_comcanada.R.id.Profile) {
            startActivity(Intent(this@DeliveryAddress, UserInfo::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
