package com.pablo384.practicandofragmentos.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pablo384.practicandofragmentos.R


/**
 * A simple [Fragment] subclass.
 */
class DataFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_data, container, false)
    }

}// Required empty public constructor
