package com.uigitdev.android.kotlin.kotlinmaterialroundedimage.design

import android.content.res.Resources
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.uigitdev.android.kotlin.kotlinmaterialroundedimage.R

class RoundedImage(val view: View) {
    private lateinit var item_card_parent: CardView
    private lateinit var item_image: ImageView

    init {
        setType()
    }

    private fun setType() {
        item_card_parent = view.findViewById(R.id.item_card_parent)
        item_image = view.findViewById(R.id.item_image)
    }

    private fun dpToPixel(dp: Int): Float {
        return (dp * Resources.getSystem().displayMetrics.density)
    }

    fun setImageURL(imageURL: String?, errorImage: Int) {
        Picasso.get().load(imageURL).fit().centerCrop().into(item_image, object : Callback {
            override fun onSuccess() {}

            override fun onError(e: Exception?) {
                item_image.setBackgroundResource(errorImage)
            }
        })
    }

    fun setRadiusPixel(radius: Int) {
        item_card_parent.radius = dpToPixel(radius)
    }
}