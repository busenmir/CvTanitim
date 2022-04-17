package com.busedemir.cvtanitim

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
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
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
class KisiselAdapter(private val context: Context, private val liste : List<Model4>) : RecyclerView.Adapter<KisiselAdapter.ViewHolder>() {
    lateinit var front_anim:AnimatorSet
    lateinit var back_anim: AnimatorSet
    var isFront =true
    val front_animation = AnimatorInflater.loadAnimator(context, R.animator.front_animator) as AnimatorSet
    val back_animation = AnimatorInflater.loadAnimator(context, R.animator.back_animator) as AnimatorSet
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var textView:TextView
        var textView1 : TextView
        var button:Button
        init {
            val scale :Float = context.resources.displayMetrics.density
            textView=view.findViewById(R.id.card_font)
            textView1=view.findViewById(R.id.card_back)
            button=view.findViewById(R.id.flip_btn)

            textView.cameraDistance = 4000 * scale
            textView1.cameraDistance = 4000 * scale
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KisiselAdapter.ViewHolder {
        val item = LayoutInflater.from(context).inflate(R.layout.card_tasarim4,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder:KisiselAdapter.ViewHolder, position: Int) {
        val index = liste[position]
        holder.textView.text = index.soru
        holder.textView1.text = index.cevap
        holder.button.setOnClickListener{if(isFront)
        {
            holder.textView1.visibility=View.VISIBLE
            front_animation.setTarget(holder.textView);
            back_animation.setTarget(holder.textView1);
            front_animation.start()
            back_animation.start()
            isFront = false


        }
        else
        {
            holder.textView1.visibility=View.VISIBLE
            front_animation.setTarget(holder.textView1)
            back_animation.setTarget(holder.textView)
            back_animation.start()
            front_animation.start()
            isFront =true
        }
        }
    }

    override fun getItemCount(): Int {
        return liste.size
    }
}