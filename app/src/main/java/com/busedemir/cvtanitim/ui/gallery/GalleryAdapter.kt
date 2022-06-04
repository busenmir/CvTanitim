package com.busedemir.cvtanitim.ui.gallery

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
import com.busedemir.cvtanitim.R

class GalleryAdapter(private val context: Context, private val liste: List<GalleryModel>) :
    RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var cardView: CardView
        var imageView: ImageView
        var textView: TextView
        var button: Button

        init {
            cardView = view.findViewById(R.id.cardView)
            imageView = view.findViewById(R.id.imageView)
            textView = view.findViewById(R.id.resimYaziTextView)
            button = view.findViewById(R.id.button)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.card_sertifika, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = liste[position]
        holder.textView.text = index.resimYazi
        holder.imageView.setImageResource(index.resim)
        holder.button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(index.url)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return liste.size
    }
}
