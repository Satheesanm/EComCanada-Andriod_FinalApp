package com.online.e_comcanada

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class AddToCard {
    @SuppressLint("SuspiciousIndentation")
    fun setAddToCartClickListener(addToCartView: View) {
        addToCartView.setOnClickListener {
            val intent = Intent(addToCartView.context, MyCart::class.java)
                   addToCartView.context.startActivity(intent)
        }
    }
}

class CartUtils {

    fun setAddToCartClickListener(addToCartView: View,name: String, price: String) {
  //  fun cart(context: Context, name: String, price: String) {
        val intent = Intent(addToCartView.context, MyCart::class.java)
        val extras = Bundle()
        extras.putString("name", name)
        extras.putString("price", price)
        intent.putExtras(extras)
        addToCartView. context.startActivity(intent)
    }
}


class putExtra {
    fun setAddToCartClickListener(addToCartView: View) {
        val intent = Intent( addToCartView. context, MyCart::class.java     ) // Replace "context" with a valid context object

        intent.putExtra("name", R.id.item_detail_price)


        addToCartView. context.startActivity(intent)
        }
    }




class Buy {
    fun setBuyClickListener(buy: View) {
        buy.setOnClickListener {
            val intent = Intent(buy.context, DeliveryAddress::class.java)
            buy.context.startActivity(intent)
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



