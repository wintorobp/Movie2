package com.example.movie2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.rv_movie

class MainActivity : AppCompatActivity() {
    private var dataList = ArrayList<FilmModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        dataList.add(
            FilmModel(
                "1",
                " Ad Astra (2019) ",
                "Seorang astronot melakukan perjalanan ke tepi luar tata surya untuk menemukan ayahnya dan mengungkap misteri yang mengancam kelangsungan hidup planet kita. Dia mengungkap rahasia yang menantang sifat keberadaan manusia dan tempat kita di kosmos.",
                "action",
                R.drawable.ic_ad_astra,
                0,
                0.0F
            )
        )
        rv_movie.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        dataList.add(
            FilmModel(
                "1",
                "Sonic",
                "Seorang astronot melakukan perjalanan ke tepi luar tata surya untuk menemukan ayahnya dan mengungkap misteri yang mengancam kelangsungan hidup planet kita. Dia mengungkap rahasia yang menantang sifat keberadaan manusia dan tempat kita di kosmos.",
                "action",
                R.drawable.ic_poster_sonic,
                0,
                0.0F
            )
        )
        rv_movie.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        dataList.add(
            FilmModel(
                "1",
                " Ad Astra (2019) ",
                "Seorang astronot melakukan perjalanan ke tepi luar tata surya untuk menemukan ayahnya dan mengungkap misteri yang mengancam kelangsungan hidup planet kita. Dia mengungkap rahasia yang menantang sifat keberadaan manusia dan tempat kita di kosmos.",
                "action",
                R.drawable.ic_avengers,
                0,
                0.0F
            )
        )
        rv_movie.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        dataList.add(
            FilmModel(
                "1",
                " Ad Astra (2019) ",
                "Seorang astronot melakukan perjalanan ke tepi luar tata surya untuk menemukan ayahnya dan mengungkap misteri yang mengancam kelangsungan hidup planet kita. Dia mengungkap rahasia yang menantang sifat keberadaan manusia dan tempat kita di kosmos.",
                "action",
                R.drawable.ic_poster_a_rainy_day_in_new_york,
                0,
                0.0F
            )
        )
        rv_movie.adapter = MovieAdapter(dataList){
            val intent = Intent(this, DetailActivity2::class.java)
                .putExtra("data", it)
            startActivity(intent)
        }


    }
}