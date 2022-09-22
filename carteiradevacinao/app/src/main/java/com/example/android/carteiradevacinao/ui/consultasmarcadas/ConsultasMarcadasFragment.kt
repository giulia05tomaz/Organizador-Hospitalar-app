package com.example.android.carteiradevacinao.ui.consultasmarcadas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.carteiradevacinao.databinding.FragmentConsultasMarcadasBinding
import com.example.android.carteiradevacinao.databinding.FragmentMarcarConsultaBinding

class ConsultasMarcadasFragment : Fragment() {

    private lateinit var binding: FragmentConsultasMarcadasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConsultasMarcadasBinding.inflate(inflater)

        return binding.root
    }
}