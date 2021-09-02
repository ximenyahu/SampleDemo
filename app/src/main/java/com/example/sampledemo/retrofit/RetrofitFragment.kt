package com.example.sampledemo.retrofit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sampledemo.R
import com.example.sampledemo.databinding.FragmentRetrofitBinding

class RetrofitFragment : Fragment(R.layout.fragment_retrofit) {
    lateinit var binding: FragmentRetrofitBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRetrofitBinding.bind(view)
    }
}