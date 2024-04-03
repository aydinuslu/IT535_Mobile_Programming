package com.example.calismayapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.calismayapisi.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class DetayFragment : Fragment() {
    // TODO: Rename and change types of parameters
private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)
        val bundle: DetayFragmentArgs by navArgs()
        val gelenMesaj = bundle.mesaj
        binding.textViewDetay.text = gelenMesaj

        val geriTusu = object : OnBackPressedCallback(true) { //true : geri dönüş aktif değil
            override fun handleOnBackPressed() {
                //geri tuşuna basıldığında yapılacak işlemler
                //örneğin geri tuşuna basıldığında bir uyarı vermek istiyorsak
                //Toast.makeText(requireContext(), "Geri tuşuna basıldı", Toast.LENGTH_SHORT).show()
                //şeklinde bir işlem yapabiliriz.
                Snackbar.make(binding.textViewDetay, "Geri dönmek istiyor musun?", Snackbar.LENGTH_SHORT)
                    .setAction("Evet") {
                    isEnabled = false
                    requireActivity().onBackPressedDispatcher.onBackPressed()
                }.show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)

        return binding.root
    }

}