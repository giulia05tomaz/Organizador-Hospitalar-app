package com.example.android.carteiradevacinao.ui.marcarconsulta

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android.carteiradevacinao.databinding.FragmentMarcarConsultaBinding
import com.google.android.material.datepicker.MaterialDatePicker

class MarcarConsultaFragment : Fragment() {

    private lateinit var binding: FragmentMarcarConsultaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMarcarConsultaBinding.inflate(inflater)

        binding.btnSelecionarData.setOnClickListener {
            val datePicker = MaterialDatePicker.Builder.datePicker()
                .setTitleText("Selecione a data")
                .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                .build()

            fragmentManager?.let { datePicker.show(it, MaterialDatePicker::class.java.simpleName) }
        }

        binding.btnMarcarConsulta.setOnClickListener {
            findNavController().navigateUp()
        }

        return binding.root
    }
}