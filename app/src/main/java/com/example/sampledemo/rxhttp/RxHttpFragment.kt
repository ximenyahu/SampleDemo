package com.example.sampledemo.rxhttp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sampledemo.R
import com.example.sampledemo.databinding.FragmentRxhttpBinding

class RxHttpFragment : Fragment(R.layout.fragment_rxhttp) {
    lateinit var binding: FragmentRxhttpBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRxhttpBinding.bind(view)
    }
}