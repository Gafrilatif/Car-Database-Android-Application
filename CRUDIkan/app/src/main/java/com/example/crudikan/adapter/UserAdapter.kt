package com.example.crudikan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crudikan.data.entity.User
import com.example.crudikan.R

class UserAdapter (var list: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private lateinit var dialog: Dialog

    fun setDialog(dialog: Dialog) {
        this.dialog = dialog
    }

    interface Dialog {
        fun onClick(position: Int)
    }

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var fullName: TextView
        var email: TextView
        var phone: TextView
        var address: TextView

        init {
            fullName = view.findViewById(R.id.merk_mobil)
            email = view.findViewById(R.id.type_mobil)
            phone = view.findViewById(R.id.kubikasi_mesin)
            address = view.findViewById(R.id.bahan_bakar)
            view.setOnClickListener{
                dialog.onClick(layoutPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullName.text = list[position].fullName
        holder.email.text = list[position].email
        holder.phone.text = list[position].phone
        holder.address.text = list[position].address
    }
}