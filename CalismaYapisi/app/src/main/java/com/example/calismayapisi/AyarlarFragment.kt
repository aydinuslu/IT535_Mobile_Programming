package com.example.calismayapisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.calismayapisi.databinding.FragmentAyarlarBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AyarlarFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AyarlarFragment : Fragment() {

    private lateinit var binding: FragmentAyarlarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAyarlarBinding.inflate(inflater, container, false)
        binding.buttonAlert.setOnClickListener{
            MaterialAlertDialogBuilder(requireContext())
                .setTitle("Başlık")
                .setMessage("İçerik")
                .setPositiveButton("Tamam") { s,d ->
                    Toast.makeText(requireContext(), "Tamam seçildi", Toast.LENGTH_SHORT).show()
                    // Respond to positive button press
                }
                .setNegativeButton("İptal") { s,d ->
                    // Respond to negative button press
                    Snackbar.make(binding.buttonAlert, "İptal seçildi", Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }

        return binding.root
    }

}