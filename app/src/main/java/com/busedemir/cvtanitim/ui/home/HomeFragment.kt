package com.busedemir.cvtanitim.ui.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.busedemir.cvtanitim.R
import com.busedemir.cvtanitim.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        binding.apply {
            imageView2.setImageResource(R.drawable.buse)
            isim.text="Buse Demir"
            dogum.text="23.05.1998 / ANKARA "
            meslek.text="Kırıkkale Üniversitesi"
            medeni.text="Bilgisayar Mühendisi"
            ehliyet.text="https://medium.com/@buse93dmr"
            github.text="https://github.com/busenmir"
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}