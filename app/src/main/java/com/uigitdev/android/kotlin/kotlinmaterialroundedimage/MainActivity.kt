package com.uigitdev.android.kotlin.kotlinmaterialroundedimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uigitdev.android.kotlin.kotlinmaterialroundedimage.design.RoundedImage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRoundedImage()
    }

    private fun setRoundedImage(){
        val roundedImage = RoundedImage(findViewById(R.id.item_rounded_image))

        roundedImage.setRadiusPixel(20)
        roundedImage.setImageURL(
            "https://uigitdev.com/wp-content/uploads/2020/07/uigitdev_new_logo.png",
            R.mipmap.ic_launcher_round)
    }
}