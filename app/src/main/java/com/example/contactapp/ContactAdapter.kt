package com.example.contactapp

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ContactRowBinding

class ContactAdapter(val callback:(ContactDB)->Unit)
    : androidx.recyclerview.widget.ListAdapter<ContactDB, ContactAdapter.ContactViewHolder>(
    ContactDiffUtil()){

    class ContactViewHolder(private val binding:ContactRowBinding)
        :RecyclerView.ViewHolder(binding.root){
        fun bind(contact:ContactDB){
            binding.contact = contact
        }
    }

    class ContactDiffUtil:DiffUtil.ItemCallback<ContactDB>(){
        override fun areItemsTheSame(oldItem: ContactDB, newItem: ContactDB): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ContactDB, newItem: ContactDB): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ContactRowBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactDB = getItem(position)
        holder.bind(contactDB)
        holder.itemView.setOnClickListener {
            callback(contactDB)
        }

    }

}