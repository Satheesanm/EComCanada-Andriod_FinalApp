package com.online.e_comcanada

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class Video : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        val intent = intent
        val extras = intent.extras
        val itemName = intent.getStringExtra("name")
        val videoView = findViewById<View>(R.id.video) as VideoView
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //Set MediaController  to enable play, pause, forward, etc options.
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)
        when (itemName) {
            SharedPref.mSamsungName -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.samsung))
            }
            SharedPref.mSamsungs21Name -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.samsung21))
            }
            SharedPref.mSamsungs22Name -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.samsung22))
            }
            SharedPref.mphone14 -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.iphone14))
            }
            SharedPref.mphone13 -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.iphone13))
            }
            SharedPref.mphone12 -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.iphone12))
            }
            SharedPref.mGooglePixel7 -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.pixel7))
            }
            SharedPref.mGooglePixel6 -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.pixel6))
            }
            SharedPref.mGooglePixel5 -> {
                videoView.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + R.raw.pixel5))
            }
            else -> {
                // handle the case when itemName doesn't match any of the expected values
            }
        }

        videoView.requestFocus()
        videoView.start()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.home) {
            val intent = Intent(this@Video, HomePage::class.java)
            startActivity(intent)
            return true
        }
        if (item.itemId == R.id.logout) {
            Toast.makeText(this@Video, "Logged out!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@Video, Login::class.java))
            return true
        }
        if (item.itemId == R.id.Profile) {
            startActivity(Intent(this@Video, UserInfo::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}