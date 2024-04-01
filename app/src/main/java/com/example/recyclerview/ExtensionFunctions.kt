package com.example.recyclerview

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.setImageFromUrl(url: String){
    Picasso.get().load(url).into(this)
}