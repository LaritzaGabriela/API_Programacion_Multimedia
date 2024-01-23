package com.example.myapplication5

import android.media.Image
import android.widget.ImageView
import com.squareup.picasso.Picasso


fun ImageView.fromUrl(url:String){
    Picasso.get().load(url).into(this)
}