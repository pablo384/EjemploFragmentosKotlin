package com.pablo384.practicandofragmentos.Fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pablo384.practicandofragmentos.R
import kotlinx.android.synthetic.main.fragment_data.*
import kotlinx.android.synthetic.main.fragment_data.view.*


/**
 * A simple [Fragment] subclass.
 */
class DataFragment : Fragment() {
    private lateinit var callback: DataListener
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            callback = context as DataListener

        }catch (e:Exception){
            e.printStackTrace()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view=inflater!!.inflate(R.layout.fragment_data, container, false)
        view.buttonSend.setOnClickListener { senText(view.editTextData.text.toString()) }


        // Inflate the layout for this fragment
        return view
    }

    private fun senText(text:String) {
        callback.sendData(text)

    }

    interface DataListener{
        fun sendData(text:String)
    }

}// Required empty public constructor
