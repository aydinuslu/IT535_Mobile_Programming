package com.example.calismayapisi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.calismayapisi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentAnasayfaBinding
    private var sayac = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        binding.buttonDetay.setOnClickListener {
            //sayac++
            //binding.textViewAnasayfa.text = "Butona $sayac kez tıklandı."
            val gecis = AnasayfaFragmentDirections.detayGecis(mesaj = "Merhaba")
            Navigation.findNavController(it).navigate(R.id.detayGecis)
            // = Navigation.findNavController(binding.buttonDetay).navigate(R.id.detayGecis)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //sayfa açıldığında bir kere çalışır
        Log.e("Yaşam döngüsü", "onCreate çalıştı")
    }

    override fun onPause() {
        super.onPause()
        //sayfa her görünmez olduğunda çalışır
        Log.e("Yaşam döngüsü", "onPause çalıştı")
    }

    override fun onResume() {
        super.onResume()
        //sayfa her görünür olduğunda çalışır
        //sayfaya geri dönüldüğünde çalışır
        Log.e("Yaşam döngüsü", "onResume çalıştı")
    }
}