package com.busedemir.cvtanitim.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.busedemir.cvtanitim.*
import com.busedemir.cvtanitim.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    private lateinit var list: ArrayList<SlidesModel>
    private lateinit var adapter: SlidesAdapter

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView: RecyclerView = binding.RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val eleman1 = SlidesModel(
            1,
            R.drawable.enerjisa,
            "2017-2018 bahar dönemi zorunlu staj -Başkent Elektrik Dağıtım A.Ş. Enerjisa Bilgi teknolojileri\n" +
                    "direktörlüğünde yapmış bulunmakdayım. Staj dönemimde sql,mysql,java ile ilgili projelerim ve\n" +
                    "öğrenimlerim gerçekleşti.active directory grup policy sccm citrix kullanıcı sistemi sap abap ile öğrenimlerim ve kullanımlarım gerçekleşti.",
            "ENERJİSA - STAJYER",
            "Kullanılan Teknolojiler : SAP \n" + "ABAP ACTIVE DIRECTORY"
        )
        val eleman2 = SlidesModel(
            2,
            R.drawable.enerji,
            "2018-2019 bahar dönemi zorunlu staj-Başkent Elektrik Dağıtım A.Ş Enerjisa perankende Bilgi\n teknolojileri direktörlüğü proje yönetim sürecinde stajımı gerçekleştim. Staj süresi boyunca büyük bir kısımda\n" +
                    "SAP ile uğraşırken raporlama olarak ABAP yazılımında bulundum. Eba sistemlerinde c# ile deneyim kazandım.Linux sistemleri üzerinde çalışmalarımı sürdürdüm.",
            "ENERJİSA - STAJYER",
            "Kullanılan Teknolojiler : JAVA \n" + "ABAP LINUX"
        )
        val eleman3 = SlidesModel(
            3,
            R.drawable.bayrak,
            "Kendi bünyelerinde geliştirdikleri projede yazılım ekibi takım çalışmasında görev aldım.Bootstrap,wordpress,css,html üzerinde çalışmalar yaptım. Bunun yanı sıra bir takım çalışmasında görevlendirmede ve takım olarak ilerleme iş dağılımı planlama kısımlarında tecrübe kazandım.\n" +
                    "Proje yönetimi,logo muhasebe uygulaması, saha montaj denetim fırsatlarımıda gerçekleştirdim. Ayrıca sahaya tedarik edilecek ürünlerin satın alması,pazarlaması bunların yanı sıra şirketler ile yapılan sözleşme\n" +
                    "takipleri,sözleşme raporları,proje takibi,proje süreç analizi",
            "Bayraktar Solar Enerji - Junior Engineer",
            "Kullanılan Teknolojiler:" + "Wordpress, \nLogo,Html,Css,BootStrap"
        )
        val eleman4 = SlidesModel(
            4,
            R.drawable.code,
            "2 bin başvuru içerisinden seçilen 30 kişilik bir grup ile Ted üniversitedi Uygulamalı veri bilimi merkezi öğretim üyeleri beraberinde Python programlama dili ile veri bilimini her dal içerisinde inceleyerek\n" +
                    "günlük hayat projelerimizi sunmak ve de sosyal fayda için veri bilimde yapılabilecekler hakkında projeler\n" +
                    "üretmek.",
            "Kodluyoruz Akademi VeriBilimi",
            "Kullanılan Teknolojiler : Python \n Jupyter, Veri Analizi"
        )
        val eleman5 = SlidesModel(
            5,
            R.drawable.makell,
            "ERP programı kullanarak proje süreçlerinin raporlanması,takip analizi,müşteri analizi,proje\n" +
                    "süreçlerinin onaylanması,Projede kullanılan ürünlerin(KBRN filtrasyon sistemleri,Isıtma Kontrol Birimleri,Yardımcı Güç Üniteleri,Savunma sanayide kullanılan filtreleme cihazları) kullanılması,katile\n süreçlerinin takibi,malzeme kalite raporlarının onaylanması. Arma Wide Projesi , Tulpar Aracı , Ural Aracı projelerinde satış ve pazarlama mühendisi olarak aktif çalışmak.",
            "Makel Teknoloji - Satış Analizcisi",
            "Kullanılan Teknoljiler:ERP\n,SAP,SQL"
        )
        val eleman6 = SlidesModel(
            6,
            R.drawable.akbank,
            "Upschool ve Akbank işbirliği ile Android Bootcamp Öğrencisi olarak yer almaktayım. Seçilen öğrenciler ile 3 aylık yoğunlaştırılmış Android eğitimidir.",
            "UpSchool-Akbank Android Developer",
            "Kullanılan Teknolojiler: Android \n Kotlin ,Java"
        )
        list = ArrayList()
        list.add(eleman1)
        list.add(eleman2)
        list.add(eleman3)
        list.add(eleman4)
        list.add(eleman5)
        list.add(eleman6)
        adapter = SlidesAdapter(requireContext(), list)
        recyclerView.adapter = adapter
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}