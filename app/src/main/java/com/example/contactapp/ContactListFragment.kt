package com.example.contactapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.FragmentContactListBinding

class ContactListFragment : Fragment() {

    private lateinit var binding:FragmentContactListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentContactListBinding.inflate(inflater,container,false)
        val adapter = ContactAdapter(con)
        binding.contactRecycler.layoutManager = LinearLayoutManager(requireActivity())
        binding.contactRecycler.adapter = adapter
        adapter.submitList(scheduleList)
        binding.floatingActionButton.setOnClickListener {
            findNavController()
                .navigate(R.id.action_contactListFragment_to_newContactFragment)
        }
        return binding.root
    }


}