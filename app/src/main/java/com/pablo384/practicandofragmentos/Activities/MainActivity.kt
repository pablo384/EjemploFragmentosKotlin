package com.pablo384.practicandofragmentos.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.pablo384.practicandofragmentos.Fragments.DataFragment
import com.pablo384.practicandofragmentos.Fragments.DetailsFragment
import com.pablo384.practicandofragmentos.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity(), DataFragment.DataListener {
    private var ismultiPanel=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMultiPanel()
    }
    override fun sendData(text: String) {
        //llamar al metodo renderizarTexto del DetailsFragment
        //pasandole el texto que recibimos por parametro en este mismo metodo
        if (ismultiPanel){
        val fragmentD:DetailsFragment = supportFragmentManager.findFragmentById(R.id.detailsFragment) as DetailsFragment
        fragmentD.renderText(text)
        }else{
            startActivity(Intent(this, DetailsActivity::class.java)
                    .putExtra("text",text))
        }

    }
    fun setMultiPanel(){
        ismultiPanel= (supportFragmentManager.findFragmentById(R.id.detailsFragment) != null)
    }
}
