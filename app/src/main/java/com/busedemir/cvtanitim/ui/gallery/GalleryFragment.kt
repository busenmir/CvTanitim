package com.busedemir.cvtanitim.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.busedemir.cvtanitim.R
import com.busedemir.cvtanitim.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    private lateinit var liste: ArrayList<GalleryModel>
    private lateinit var adapter: GalleryAdapter
    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView: RecyclerView = binding.recyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val eleman1 = GalleryModel(
            1,
            R.drawable.bilge,
            "Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye",
            "https://www.btkakademi.gov.tr/portal/certificate/validate?certificateId=8jmhL8LgN8"
        )
        val eleman2 = GalleryModel(
            2,
            R.drawable.tbd,
            "TBD TÜRKİYE BİLİŞİM DERNEĞİ-PYTHON",
            "https://www.datacamp.com/statement-of-accomplishment/course/95e2233fa607c9d24a1b67bc4364d2bd9ca31ce6?raw=1"
        )
        val eleman3 = GalleryModel(
            3,
            R.drawable.kodluyoruz,
            "Ankara & Sosyal Fayda için Veri Bilimi Programı",
            "https://verified.cv/tr/verify/03606238562754"
        )
        val eleman4 = GalleryModel(
            4,
            R.drawable.allbusiness,
            "Introduction to Machine Learning",
            "https://verified.cv/en/verify/274951719004"
        )
        val eleman5 = GalleryModel(
            5,
            R.drawable.bilge,
            "Versiyon Kontrolleri: Git ve GitHub",
            "https://www.btkakademi.gov.tr/portal/certificate/validate?certificateId=xr4t027pgM"
        )
        val eleman6 = GalleryModel(
            6,
            R.drawable.datacamp,
            "Introduction to Python",
            "hhttps://www.datacamp.com/statement-of-accomplishment/course/95e2233fa607c9d24a1b67bc4364d2bd9ca31ce6?raw=1"
        )
        liste = ArrayList()
        liste.add(eleman1)
        liste.add(eleman2)
        liste.add(eleman3)
        liste.add(eleman4)
        liste.add(eleman5)
        liste.add(eleman6)
        adapter = GalleryAdapter(requireContext(), liste)
        recyclerView.adapter = adapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}