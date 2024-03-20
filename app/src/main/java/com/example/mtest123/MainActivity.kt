package com.example.mtest123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mtest123.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var imagege = 1
    //private var index = 1
   // val images = listOf(
    //    R.drawable.image1,
    //    R.drawable.image2,
    //    R.drawable.image3
   // )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{
             when(imagege) {
                 2 -> Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(binding.imageView)
                 3 -> Picasso.get().load("https://i.imgur.com/y4vcuwo.jpeg").into(binding.imageView)
                 else -> Picasso.get().load("https://i.imgur.com/u9iikMK.jpeg").into(binding.imageView)
             }
                imagege = if(imagege < 3) imagege + 1 else 1
            }
        }
    }

//example
//binding.imageView.setImageDrawable(getDrawable(R.drawable.image2))
//binding.imageView.setImageResource(imagesFromResList[Random().nextInt(imagesFromResList.size)])