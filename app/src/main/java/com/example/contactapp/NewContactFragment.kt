package com.example.contactapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.contactapp.databinding.FragmentNewContactBinding


class NewContactFragment : Fragment() {

    private lateinit var binding:FragmentNewContactBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewContactBinding.inflate(inflater,container,false)
        binding.saveBtn.setOnClickListener {
            val name = binding.contactName.text.toString()
            val phone = binding.contactPhone.text.toString()
            val email = binding.contactEmail.text.toString()
            val address = binding.contactAddress.text.toString()

            val contact = ContactDB(
                id = id,
                name = name,
                phone = phone,
                email = email,
                address = address,
            )
            scheduleList.add(contact)
            findNavController().navigate(R.id.action_newContactFragment_to_contactListFragment)
        }
        return binding.root
    }

}