package com.example.android.carteiradevacinao.ui.login.comocadastrar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.carteiradevacinao.databinding.FragmentComoCadastrarBinding

class ComoCadastrarFragment : Fragment() {

    private lateinit var binding: FragmentComoCadastrarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentComoCadastrarBinding.inflate(inflater)

        binding.btnVoltar.setOnClickListener {
            findNavController().navigateUp()
        }

        return binding.root
    }
}