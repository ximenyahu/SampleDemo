package com.example.sampledemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sampledemo.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    lateinit var binding: FragmentMainBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.btGlide.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToGlideFragment())
        }
        binding.btRetrofit.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToRetrofitFragment())
        }
        binding.btRxHttp.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToRxHttpFragment())
        }
    }
}