package com.example.movie2

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail2.tv_desc
import kotlinx.android.synthetic.main.activity_detail2.tv_genre
import kotlinx.android.synthetic.main.activity_detail2.tv_title2
import kotlinx.android.synthetic.main.activity_detail2.videoView

class DetailActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val data = intent.getParcelableExtra<FilmModel>("data")

        tv_title2.text = data.judul
        tv_genre.text = data.genre
        tv_desc.text = data.desc

        //coba
        // komen kedua
        // ketiga

        videoView.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+data.trailer))
        videoView.start()

    }
}