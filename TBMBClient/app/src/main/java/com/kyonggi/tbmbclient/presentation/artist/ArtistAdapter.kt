package com.kyonggi.tbmbclient.presentation.artist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kyonggi.tbmbclient.R
import com.kyonggi.tbmbclient.data.model.artist.Artist
import com.kyonggi.tbmbclient.databinding.ListItemBinding

class ArtistAdapter: RecyclerView.Adapter<ArtistAdapter.MyViewHolder>(){

    private val artistList = ArrayList<Artist>()

    fun setList(artists: List<Artist>) {
        artistList.clear()
        artistList.addAll(artists)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(artistList[position])
    }

    override fun getItemCount(): Int {
        return artistList.size
    }

    inner class MyViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(artist: Artist) {
            with(binding) {
                titleTextView.text = artist.name
                descriptionTextView.text = artist.popularity.toString()
                val posterURL = "https://image.tmdb.org/t/p/w500" + artist.profilePath

                Glide.with(imageView.context)
                    .load(posterURL)
                    .into(imageView)
            }
        }
    }
}