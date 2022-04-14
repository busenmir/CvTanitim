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
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import java.net.URL
import java.util.logging.Level.parse
import kotlin.time.Duration.Companion.parse

class GalleryAdapter (private val context: Context, private val liste : List<Model>) : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var cardView: CardView
        var imageView: ImageView
        var textView : TextView
        var button : Button
        init {
            cardView = view.findViewById(R.id.cardView)
            imageView = view.findViewById(R.id.imageView)
            textView = view.findViewById(R.id.resimYaziTextView)
            button = view.findViewById(R.id.button)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryAdapter.ViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.card_tasarim,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: GalleryAdapter.ViewHolder, position: Int) {
        val index = liste[position]
        holder.textView.text = index.resimYazi
        holder.imageView.setImageResource(index.resim)
        holder.button.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse(index.url)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return liste.size
    }
}
