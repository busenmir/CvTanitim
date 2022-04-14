package com.busedemir.cvtanitim.ui.home

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

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val imageView : ImageView = binding.imageView2
        homeViewModel.text.observe(viewLifecycleOwner) {
            imageView.setImageResource(R.drawable.buse)
        }
        val textView: TextView = binding.isim
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text="Buse Demir"
        }
        val dogum: TextView = binding.dogum
        homeViewModel.text.observe(viewLifecycleOwner) {
            dogum.text="23.05.1998 / ANKARA "
        }
        val meslek: TextView = binding.meslek
        homeViewModel.text.observe(viewLifecycleOwner) {
            meslek.text="Kırıkkale Üniversitesi"
        }
        val medeni: TextView = binding.medeni
        homeViewModel.text.observe(viewLifecycleOwner) {
            medeni.text="Bilgisayar Mühendisi"
        }
        val ehliyet: TextView = binding.ehliyet
        homeViewModel.text.observe(viewLifecycleOwner) {
            ehliyet.text="https://medium.com/@buse93dmr"
        }
        val github: TextView = binding.github
        homeViewModel.text.observe(viewLifecycleOwner) {
            github.text="https://github.com/busenmir"
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}