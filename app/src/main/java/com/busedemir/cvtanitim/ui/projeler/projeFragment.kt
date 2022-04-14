package com.busedemir.cvtanitim.ui.projeler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.busedemir.cvtanitim.*
import com.busedemir.cvtanitim.databinding.FragmentGalleryBinding
import com.busedemir.cvtanitim.databinding.FragmentHomeBinding
import com.busedemir.cvtanitim.databinding.FragmentKisiselBinding
import com.busedemir.cvtanitim.databinding.FragmentProjeBinding
import com.busedemir.cvtanitim.ui.gallery.GalleryViewModel
import com.busedemir.cvtanitim.ui.home.HomeViewModel

class projeFragment : Fragment() {
    private lateinit var liste : ArrayList<Model3>
    private lateinit var adapter : ProjeAdapter
    private  lateinit var gridLayoutManager : GridLayoutManager
    private var _binding: FragmentProjeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProjeBinding.inflate(inflater, container, false)
        val root = inflater.inflate(R.layout.fragment_proje,container,false)
        val recyclerView : RecyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        gridLayoutManager= GridLayoutManager(requireContext(),3,GridLayoutManager.VERTICAL,false)
        recyclerView.layoutManager=gridLayoutManager
        val eleman1 = Model3(1,"buse",R.drawable.akbank)
        val eleman2 = Model3(2,"buse",R.drawable.akbank)
        liste = ArrayList<Model3>()
        liste.add(eleman1)
        liste.add(eleman2)
        adapter = ProjeAdapter(requireContext(),liste)
        recyclerView.adapter=adapter
        return root
    }
}