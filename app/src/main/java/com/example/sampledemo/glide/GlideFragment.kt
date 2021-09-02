package com.example.sampledemo.glide

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.sampledemo.R
import com.example.sampledemo.databinding.FragmentGlideBinding

class GlideFragment : Fragment(R.layout.fragment_glide) {

    lateinit var binding: FragmentGlideBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGlideBinding.bind(view)
        binding.btRequest.setOnClickListener {
            //使用Glide GeneratedAPI

        }
    }
}