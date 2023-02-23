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

class HomePage : AppCompatActivity(){

    lateinit var title: TextView


    private val displayImage: ImageView by lazy { findViewById(R.id.displayimage) }
    private val itemname: TextView by lazy { findViewById(R.id.itemname) }
    private val itemDescription: TextView by lazy { findViewById(R.id.description_part) }
    private val itemPrice: TextView by lazy { findViewById(R.id.item_detail_price) }
    private val addToCard: TextView by lazy { findViewById(R.id.btnaddtoCard) }
    private val buy: TextView by lazy { findViewById(R.id.text_action_bottom2) }
    private val shareBtn: TextView by lazy { findViewById(R.id.btnShare) }
    private val similarBtn: TextView by lazy { findViewById(R.id.btnSimilar) }
    private val favBtn: ImageView by lazy { findViewById(R.id.fav) }
    private val rating: TextView by lazy { findViewById(R.id.text_ratings) }
    private val review: TextView by lazy { findViewById(R.id.text_ratings_reviews) }
    private val play: ImageView by lazy { findViewById(R.id.play) }
    val Share = Share()
    val AddToCard = AddToCard()
    val Similar = Similar()
    val Buy = Buy()
    val video = Video()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
      supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    @SuppressLint("MissingInflatedId")
    fun SamsungGalaxy23(view: View?) {
        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
            displayImage.setImageResource(R.drawable.galaxys23)
        rating.setText(SharedPref.read(SharedPref.mSamsungrating,SharedPref.mSamsungrating))
        review.setText(SharedPref.read(SharedPref.mSamsungreview,SharedPref.mSamsungreview))
            itemname.setText(SharedPref.read(SharedPref.mSamsungName,SharedPref.mSamsungName))
            itemDescription.setText(SharedPref.read(SharedPref.mSamsungDescription, SharedPref.mSamsungDescription))
            itemPrice.setText(SharedPref.read(SharedPref.mSamsungPrice, SharedPref.mSamsungPrice))
            Share.setShareButtonClickListener(shareBtn, SharedPref.mSamsungName+SharedPref.mSamsungDescription)
            Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }


        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
            play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)


    }

    @SuppressLint("MissingInflatedId")
    fun SamsungGalaxy22(view: View?) {
        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
        displayImage.setImageResource(R.drawable.galaxys22)
        rating.setText(SharedPref.read(SharedPref.mSamsung22rating,SharedPref.mSamsung22rating))
        review.setText(SharedPref.read(SharedPref.mSamsung22review,SharedPref.mSamsung22review))
        itemname.setText(SharedPref.read(SharedPref.mSamsungs22Name,SharedPref.mSamsungs22Name))
        itemDescription.setText(SharedPref.read(SharedPref.mSamsungs22Description, SharedPref.mSamsungs22Description))
        itemPrice.setText(SharedPref.read(SharedPref.mSamsungs22Price, SharedPref.mSamsungs22Price))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mSamsungs22Name+ SharedPref.mSamsungs22Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }


    @SuppressLint("MissingInflatedId")
    fun SamsungGalaxy21(view: View?) {
        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
        displayImage.setImageResource(R.drawable.galaxys21)
        itemname.setText(SharedPref.read(SharedPref.mSamsungs21Name,SharedPref.mSamsungs21Name))
        rating.setText(SharedPref.read(SharedPref.mSamsung21rating,SharedPref.mSamsung21rating))
        review.setText(SharedPref.read(SharedPref.mSamsung21review,SharedPref.mSamsung21review))
        itemDescription.setText(SharedPref.read(SharedPref.mSamsungs21Description, SharedPref.mSamsungs21Description))
        itemPrice.setText(SharedPref.read(SharedPref.mSamsungs21Price, SharedPref.mSamsungs21Price))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mSamsungs21Name + SharedPref.mSamsungs21Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }


    @SuppressLint("MissingInflatedId")
    fun Phone14(view: View?) {
        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
        displayImage.setImageResource(R.drawable.i14)
        rating.setText(SharedPref.read(SharedPref.mphone14rating,SharedPref.mphone14rating))
        review.setText(SharedPref.read(SharedPref.mphone14review,SharedPref.mphone14review))
        itemname.setText(SharedPref.read(SharedPref.mphone14,SharedPref.mphone14))
        itemDescription.setText(SharedPref.read(SharedPref.mIphone14Description, SharedPref.mIphone14Description))
        itemPrice.setText(SharedPref.read(SharedPref.mIphone14Price, SharedPref.mIphone14Price        ))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mphone14 + SharedPref.mIphone14Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }

    @SuppressLint("MissingInflatedId")
    fun Phone13(view: View?) {
        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
        displayImage.setImageResource(R.drawable.i13)
        rating.setText(SharedPref.read(SharedPref.mphone13rating,SharedPref.mphone13rating))
        review.setText(SharedPref.read(SharedPref.mphone13review,SharedPref.mphone13review))
        itemname.setText(SharedPref.read(SharedPref.mphone13,SharedPref.mphone13))
        itemDescription.setText(SharedPref.read(SharedPref.mIphone13Description, SharedPref.mIphone13Description))
        itemPrice.setText(SharedPref.read(SharedPref.mIphone13Price, SharedPref.mIphone13Price
        ))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mphone13 + SharedPref.mIphone13Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }


    @SuppressLint("MissingInflatedId")
    fun Phone12(view: View?) {

        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
        displayImage.setImageResource(R.drawable.i13)
        itemname.setText(SharedPref.read(SharedPref.mphone12,SharedPref.mphone12))
        rating.setText(SharedPref.read(SharedPref.mphone12rating,SharedPref.mphone12rating))
        review.setText(SharedPref.read(SharedPref.mphone12review,SharedPref.mphone12review))
        itemDescription.setText(SharedPref.read(SharedPref.mIphone12Description, SharedPref.mIphone12Description))
        itemPrice.setText(SharedPref.read(SharedPref.mIphone12Price, SharedPref.mIphone12Price        ))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mphone12 + SharedPref.mIphone12Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }


    @SuppressLint("MissingInflatedId")
    fun Pixel7(view: View?) {

        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)
        displayImage.setImageResource(R.drawable.pixel7)
        itemname.setText(SharedPref.read(SharedPref.mGooglePixel7,SharedPref.mGooglePixel7))
        rating.setText(SharedPref.read(SharedPref.mGooglePixel7rating,SharedPref.mGooglePixel7rating))
        review.setText(SharedPref.read(SharedPref.mGooglePixel7review,SharedPref.mGooglePixel7review))
        itemDescription.setText(SharedPref.read(SharedPref.mGooglePixel7Description, SharedPref.mGooglePixel7Description))
        itemPrice.setText(SharedPref.read(SharedPref.mGooglePixel7Price, SharedPref.mGooglePixel7Price        ))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mGooglePixel7 + SharedPref.mGooglePixel7Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }

    @SuppressLint("MissingInflatedId")
    fun Pixel6(view: View?) {

        SharedPref.init(getApplicationContext());
        setContentView(R.layout.activity_address)

        displayImage.setImageResource(R.drawable.pixel6)
        itemname.setText(SharedPref.read(SharedPref.mGooglePixel6,SharedPref.mGooglePixel6))
        rating.setText(SharedPref.read(SharedPref.mGooglePixel6rating,SharedPref.mGooglePixel6rating))
        review.setText(SharedPref.read(SharedPref.mGooglePixel6review,SharedPref.mGooglePixel6review))
        itemDescription.setText(SharedPref.read(SharedPref.mGooglePixel6Description, SharedPref.mGooglePixel6Description))
        itemPrice.setText(SharedPref.read(SharedPref.mGooglePixel6Price, SharedPref.mGooglePixel6Price        ))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mGooglePixel6 + SharedPref.mGooglePixel6Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
      
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }


    @SuppressLint("MissingInflatedId")
    fun Pixel5(view: View?) {

        displayImage.setImageResource(R.drawable.pixel5)
        itemname.setText(SharedPref.read(SharedPref.mGooglePixel5,SharedPref.mGooglePixel5))
        itemDescription.setText(SharedPref.read(SharedPref.mGooglePixel5Description, SharedPref.mGooglePixel5Description))
        itemPrice.setText(SharedPref.read(SharedPref.mGooglePixel5Price, SharedPref.mGooglePixel5Price
        ))
        Share.setShareButtonClickListener(shareBtn, SharedPref.mGooglePixel5 + SharedPref.mGooglePixel5Description)
        Similar.setSimilarButtonClickListener(similarBtn)
        val imageResources = listOf(
            R.drawable.ic_baseline_favorite_24,
            R.drawable.ic_favorite_border_black_18dp
        )
        var currentIndex = 0

        favBtn.setOnClickListener {
            // Set the image resource to the current index in the list
            favBtn.setImageResource(imageResources[currentIndex])
            // Increment the index and wrap around if necessary
            currentIndex = (currentIndex + 1) % imageResources.size
        }
        addToCard.setOnClickListener {
            //startActivity(Intent(this@HomePage, MyCart::class.java))
            val intent = Intent(this@HomePage, MyCart::class.java)
            val extras = Bundle()
            extras.putString("name", itemname.text.toString())
            extras.putString("price", itemPrice.text.toString())
            intent.putExtras(extras)
            startActivity(intent)

        }
       play.setOnClickListener {
            val intent = Intent(this@HomePage, video::class.java)
                val extras = Bundle()
                extras.putString("name", itemname.text.toString())
                intent.putExtras(extras)
            startActivity(intent)

        }
        Buy.setBuyClickListener(buy)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.home) {
            val intent = Intent(this@HomePage, HomePage::class.java)
            startActivity(intent)
            return true
        }
        if (item.itemId == R.id.logout) {
            Toast.makeText(this@HomePage, "Logged out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@HomePage, Login::class.java))
            return true
        }
        if (item.itemId == R.id.Profile) {
            startActivity(Intent(this@HomePage, UserInfo::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }

   }

