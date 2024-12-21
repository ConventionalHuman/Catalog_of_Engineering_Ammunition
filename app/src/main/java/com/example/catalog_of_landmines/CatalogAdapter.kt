package com.example.catalog_of_landmines

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class CatalogAdapter (private val TitleList: ArrayList<Title>): RecyclerView.Adapter<CatalogAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: Button = itemView.findViewById(R.id.rec_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)

    }
    override fun getItemCount(): Int {
        return TitleList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = TitleList[position]
        holder.title.text = currentItem.title
        holder.title.setOnClickListener{
            val intent = Intent(holder.title.context, MultyActivity::class.java)
            intent.putExtra("title", holder.title.text)
            holder.title.context.startActivity(intent)
        }
    }
}