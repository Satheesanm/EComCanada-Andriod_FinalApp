package com.online.e_comcanada

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat

class AddToCard {
    fun setAddToCartClickListener(addToCartView: View) {
        addToCartView.setOnClickListener {
            val intent = Intent(addToCartView.context, MyCart::class.java)
            addToCartView.context.startActivity(intent)
        }
    }
}

class Share {
    fun setShareButtonClickListener(shareBtn: View, itemDescription: String) {
        shareBtn.setOnClickListener {
            val shareIntent = Intent()
            shareIntent.action = Intent.ACTION_SEND
            shareIntent.putExtra(Intent.EXTRA_TEXT, itemDescription)
            shareIntent.type = "text/plain"
            shareBtn.context.startActivity(Intent.createChooser(shareIntent, "Share with"))
        }
    }
}


class Similar {
    fun setSimilarButtonClickListener(similarBtn: View) {
        similarBtn.setOnClickListener {
            val intent = Intent(similarBtn.context, SimilarProducts::class.java)
            similarBtn.context.startActivity(intent)
        }
    }
}

