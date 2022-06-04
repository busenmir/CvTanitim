package com.busedemir.cvtanitim.ui.projeler

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.busedemir.cvtanitim.*
import com.busedemir.cvtanitim.databinding.FragmentProjeBinding

class ProjeFragment : Fragment() {
    private lateinit var liste: ArrayList<ProjeModel>
    private lateinit var adapter: ProjeAdapter
    private lateinit var gridLayoutManager: GridLayoutManager
    private var _binding: FragmentProjeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProjeBinding.inflate(inflater, container, false)
        val root = binding.root
        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        gridLayoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = gridLayoutManager
        val eleman1 = ProjeModel(
            1,
            "Sosyal Fayda İçin\n" + "Veri Bilimi",
            R.drawable.mobil,
            "https://cads.tedu.edu.tr/projeler-hareketlilik-ve-mobilite/"
        )
        val eleman2 = ProjeModel(
            2,
            "SüperKahramanlar",
            R.drawable.siper,
            "https://github.com/busenmir/SuperKahramanKitabi.git"
        )
        val eleman3 = ProjeModel(
            3,
            "Veteriner \n Uygulaması",
            R.drawable.vet1,
            "https://github.com/busenmir/VeterinerUygulamasi"
        )
        val eleman4 = ProjeModel(
            4,
            "Yemek Tarifleri",
            R.drawable.yemektarifi,
            "https://github.com/busenmir/YemekTarifleri"
        )
        val eleman5 =
            ProjeModel(5, "Zar Atmaca", R.drawable.zar, "https://github.com/busenmir/ZarAtma")
        val eleman6 = ProjeModel(
            6,
            "Sayi Tahmin Oyunu ",
            R.drawable.sayi,
            "https://github.com/busenmir/SayiTahminEt"
        )
        val eleman7 = ProjeModel(
            7,
            "Daha Fazlası İçin \n Beklemede Kalın ! ",
            R.drawable.github,
            "https://github.com/busenmir?tab=repositories"
        )
        liste = ArrayList()
        liste.add(eleman1)
        liste.add(eleman2)
        liste.add(eleman3)
        liste.add(eleman4)
        liste.add(eleman5)
        liste.add(eleman6)
        liste.add(eleman7)
        adapter = ProjeAdapter(requireContext(), liste)
        recyclerView.adapter = adapter
        return root
    }
}