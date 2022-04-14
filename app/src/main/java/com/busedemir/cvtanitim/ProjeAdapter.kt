package com.busedemir.cvtanitim

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ProjeAdapter(private val context: Context, private val liste : List<Model3>) : RecyclerView.Adapter<ProjeAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var cardView: CardView
        var imageView: ImageView
        var textView : TextView
        init {
            cardView = view.findViewById(R.id.cardView)
            imageView = view.findViewById(R.id.image_view)
            textView = view.findViewById(R.id.title_text_view)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjeAdapter.ViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.card_tasarim3,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder:ProjeAdapter.ViewHolder, position: Int) {
        val index = liste[position]
        holder.textView.text = index.ProjeAdı
        holder.imageView.setImageResource(index.resim)
    }

    override fun getItemCount(): Int {
        return liste.size
    }
}