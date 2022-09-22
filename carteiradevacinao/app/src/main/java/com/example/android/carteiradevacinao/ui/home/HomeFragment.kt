package com.example.android.carteiradevacinao.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.carteiradevacinao.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)

        binding.btnVacinas.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToVacinasDisponiveisFragment())
        }

        return binding.root
    }
}