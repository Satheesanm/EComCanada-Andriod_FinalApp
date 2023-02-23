package com.online.e_comcanada

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SimilarProducts : AppCompatActivity(){

    private val displayImage: ImageView by lazy { findViewById(R.id.displayimage) }
    private val itemname: TextView by lazy { findViewById(R.id.itemname) }

    private val samsung23: ImageView by lazy { findViewById(R.id.imgs23) }
    private val samsung22: ImageView by lazy { findViewById(R.id.imgs22) }
    private val samsung21: ImageView by lazy { findViewById(R.id.imgs21) }
    private val phone14: ImageView by lazy { findViewById(R.id.imgIphone14) }
    private val phone13: ImageView by lazy { findViewById(R.id.imgiphone13) }
    private val phone12: ImageView by lazy { findViewById(R.id.imgIphone12) }
    private val pixel7: ImageView by lazy { findViewById(R.id.imgpixel7) }
    private val pixel6: ImageView by lazy { findViewById(R.id.imgpixel6) }
    private val pixel5: ImageView by lazy { findViewById(R.id.imgpixel5) }


    val Share = Share()
    val AddToCard = AddToCard()
    val Similar = Similar()
    val Buy = Buy()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_similar_saumsung_products)
      supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    @SuppressLint("MissingInflatedId")
    fun SimilarSamsungGalaxy23(view: View?) {


        samsung23.setOnClickListener {
            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mSamsungName,SharedPref.mSamsungName)))
            extras.putString("price", (SharedPref.read(SharedPref.mSamsungPrice,SharedPref.mSamsungPrice)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }

    @SuppressLint("MissingInflatedId")
    fun SimilarSamsungGalaxy22(view: View?) {


        samsung22.setOnClickListener {
            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mSamsungs22Name,SharedPref.mSamsungs22Name)))
            extras.putString("price", (SharedPref.read(SharedPref.mSamsungs22Price,SharedPref.mSamsungs22Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }

    @SuppressLint("MissingInflatedId")
    fun SimilarSamsungGalaxy21(view: View?) {


        samsung21.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mSamsungs21Name,SharedPref.mSamsungs21Name)))
            extras.putString("price", (SharedPref.read(SharedPref.mSamsungs21Price,SharedPref.mSamsungs21Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }


    @SuppressLint("MissingInflatedId")
    fun SimilarIphoney14(view: View?) {


        phone14.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mphone14,SharedPref.mphone14)))
            extras.putString("price", (SharedPref.read(SharedPref.mIphone14Price,SharedPref.mIphone14Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }
    @SuppressLint("MissingInflatedId")
    fun SimilarIphoney13(view: View?) {


        phone13.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mphone13,SharedPref.mphone13)))
            extras.putString("price", (SharedPref.read(SharedPref.mIphone13Price,SharedPref.mIphone13Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }
    @SuppressLint("MissingInflatedId")
    fun SimilarIphoney12(view: View?) {


        phone12.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mphone12,SharedPref.mphone12)))
            extras.putString("price", (SharedPref.read(SharedPref.mIphone12Price,SharedPref.mIphone12Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }


    @SuppressLint("MissingInflatedId")
    fun SimilarPixel7(view: View?) {


        pixel7.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mGooglePixel7,SharedPref.mGooglePixel7)))
            extras.putString("price", (SharedPref.read(SharedPref.mGooglePixel7Price,SharedPref.mGooglePixel7Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }
    @SuppressLint("MissingInflatedId")
    fun SimilarPixel6(view: View?) {


        pixel6.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mGooglePixel6,SharedPref.mGooglePixel6)))
            extras.putString("price", (SharedPref.read(SharedPref.mGooglePixel6Price,SharedPref.mGooglePixel6Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }
    @SuppressLint("MissingInflatedId")
    fun SimilarPixel5(view: View?) {


        pixel5.setOnClickListener {
            //startActivity(Intent(this@SimilarProducts, MyCart::class.java))

            SharedPref.init(getApplicationContext());
            setContentView(R.layout.activity_similar_saumsung_products)
            val intent = Intent(this@SimilarProducts, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name",(SharedPref.read(SharedPref.mGooglePixel5,SharedPref.mGooglePixel5)))
            extras.putString("price", (SharedPref.read(SharedPref.mGooglePixel5Price,SharedPref.mGooglePixel5Price)))
            intent.putExtras(extras)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.home) {
            val intent = Intent(this@SimilarProducts, HomePage::class.java)
            startActivity(intent)
            return true
        }
        if (item.itemId == R.id.logout) {
            Toast.makeText(this@SimilarProducts, "Logged out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@SimilarProducts, Login::class.java))
            return true
        }
        if (item.itemId == R.id.Profile) {
            startActivity(Intent(this@SimilarProducts, UserInfo::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}

