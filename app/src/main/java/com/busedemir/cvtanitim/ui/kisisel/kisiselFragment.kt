package com.busedemir.cvtanitim.ui.kisisel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.busedemir.cvtanitim.databinding.FragmentKisiselBinding

class kisiselFragment : Fragment() {
    private lateinit var liste : ArrayList<KisiselModel>
    private lateinit var adapter : KisiselAdapter
    private var _binding: FragmentKisiselBinding? = null
    private val binding get() = _binding!!
    private  lateinit var gridLayoutManager : GridLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKisiselBinding.inflate(inflater, container, false)
        val root = binding.root
        val recyclerView : RecyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        gridLayoutManager= GridLayoutManager(requireContext(),2, GridLayoutManager.VERTICAL,false)
        recyclerView.layoutManager=gridLayoutManager
        val eleman1 = KisiselModel(1,"Nerede Yaşıyor?","Ankara")
        val eleman2 = KisiselModel(2,"En Değerlisi?","Ailesi")
        val eleman3 = KisiselModel(3,"En Sevdiği\n Renk","Beyaz-Mor")
        val eleman4 = KisiselModel(4,"Hangi Takımı\n Tutuyor?","Fenerbahçe")
        val eleman5 = KisiselModel(5,"Nereli? ","Kırşehir")
        val eleman6 = KisiselModel(6,"En Sevdiği\n Yemek?","Kebap-Patates")
        val eleman7 = KisiselModel(7,"Hayali Ne?","Kendisiyle yaşamak")
        val eleman8 = KisiselModel(8,"Ne Yapmak\n İstiyor?","Yüksek Lisans\n Androidi yutmak")
        val eleman9 = KisiselModel(9,"En Sevilen\n Huyu?","Sıcakkanlı\n Konuşkan")
        val eleman10 = KisiselModel(10,"En Kötü\n Huyu?","Sabırsız,Tatlı Sinirli\n :)")
        val eleman11 = KisiselModel(11,"Ne için \n Uğraşıyor?","Öğrenmeye,Gelişmeye\n Üretmeye")
        val eleman12 = KisiselModel(12,"En iyi yaptığı \n Yemek?","Hepsi :)")
        val eleman13 = KisiselModel(13,"Erkek Arkadaşı?","Galata Kulesi")
        val eleman14 = KisiselModel(14,"En Sevdiği\n İçecek","Kahve Delisi")
        liste= ArrayList<KisiselModel>()
        liste.add(eleman1)
        liste.add(eleman2)
        liste.add(eleman3)
        liste.add(eleman4)
        liste.add(eleman5)
        liste.add(eleman6)
        liste.add(eleman7)
        liste.add(eleman8)
        liste.add(eleman9)
        liste.add(eleman10)
        liste.add(eleman11)
        liste.add(eleman12)
        liste.add(eleman13)
        liste.add(eleman14)
        adapter= KisiselAdapter(requireContext(),liste)
        recyclerView.adapter=adapter
        return root
    }
}