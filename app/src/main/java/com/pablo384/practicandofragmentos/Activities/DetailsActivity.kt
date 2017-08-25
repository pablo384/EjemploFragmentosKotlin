package com.pablo384.practicandofragmentos.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pablo384.practicandofragmentos.Fragments.DetailsFragment
import com.pablo384.practicandofragmentos.R

class DetailsActivity : AppCompatActivity() {
    lateinit var text:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        if (intent.extras!=null){
            text = intent.getStringExtra("text")
        }
        val fragmentD: DetailsFragment = supportFragmentManager.findFragmentById(R.id.detailsFragment) as DetailsFragment
        fragmentD.renderText(text)
    }
}
