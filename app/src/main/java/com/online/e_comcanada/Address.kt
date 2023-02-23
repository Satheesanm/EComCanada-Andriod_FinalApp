package com.online.e_comcanada

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


//lateinit var addToCard: TextView
class Address : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
      supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.home) {
            val intent = Intent(this@Address, HomePage::class.java)
            startActivity(intent)
            return true
        }
        if (item.itemId == R.id.logout) {
            Toast.makeText(this@Address, "Logged out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@Address, Login::class.java))
            return true
        }
        if (item.itemId == R.id.Profile) {
            startActivity(Intent(this@Address, UserInfo::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }



}