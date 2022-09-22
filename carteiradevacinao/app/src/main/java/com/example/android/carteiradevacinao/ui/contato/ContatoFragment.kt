package com.example.android.carteiradevacinao.ui.contato

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.carteiradevacinao.databinding.FragmentContatoBinding

class ContatoFragment : Fragment() {

    private lateinit var binding: FragmentContatoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContatoBinding.inflate(inflater)


        return binding.root
    }
}