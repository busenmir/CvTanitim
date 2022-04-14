package com.busedemir.cvtanitim

import android.content.Context
import android.text.method.ScrollingMovementMethod
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class SlidesAdapter(private val context :Context , private val list :List<Model2>) : RecyclerView.Adapter<SlidesAdapter.VHolder>() {
    inner class VHolder(view: View): RecyclerView.ViewHolder(view){
        var cardView : CardView
        var imageView : ImageView
        var textView : TextView
        var button :Button
        var textView2 : TextView
        var textView3: TextView
        init {
            cardView = view.findViewById(R.id.cardView)
            imageView = view.findViewById(R.id.imageView3)
            textView = view.findViewById(R.id.textView4)
            button = view.findViewById(R.id.button1)
            textView2 = view.findViewById(R.id.textView5)
            textView3 = view.findViewById(R.id.textView6)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.card_tasarim2,parent,false)
        return VHolder(item)
    }

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        val index = list[position]
        holder.imageView.setImageResource(index.resim)
        holder.textView.text=index.yazi
        holder.textView2.text=index.baslik
        holder.textView3.text=index.tekno
        holder.button.setOnClickListener {
            if (holder.textView.visibility==View.INVISIBLE){
                TransitionManager.beginDelayedTransition(holder.cardView,AutoTransition())
                holder.textView.visibility=View.VISIBLE
                holder.button.text="daha az"
            }else {
                TransitionManager.beginDelayedTransition(holder.cardView,AutoTransition())
                holder.textView.visibility=View.INVISIBLE
                holder.button.text="daha için"
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}