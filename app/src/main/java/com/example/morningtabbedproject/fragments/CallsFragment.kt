package com.example.morningtabbedproject.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.morningtabbedproject.R

class CallsFragment : Fragment() {
    var buttonClickme:Button ?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var root = inflater.inflate(R.layout.fragment_calls, container, false)
        buttonClickme = root.findViewById(R.id.mBtnClickMe)
        buttonClickme!!.setOnClickListener {
            Toast.makeText(context,"You Clicked me",Toast.LENGTH_LONG).show()
        }

        return root
    }


}