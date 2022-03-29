package com.kyonggi.tbmbclient.presentation.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kyonggi.tbmbclient.R
import com.kyonggi.tbmbclient.data.model.tvshow.TvShow
import com.kyonggi.tbmbclient.databinding.ListItemBinding

class TvShowAdapter: RecyclerView.Adapter<TvShowAdapter.MyViewHolder>(){

    private val tvShowList = ArrayList<TvShow>()

    fun setList(tvShows: List<TvShow>) {
        tvShowList.clear()
        tvShowList.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(tvShowList[position])
    }

    override fun getItemCount(): Int {
        return tvShowList.size
    }

    inner class MyViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(tvShow: TvShow) {
            with(binding) {
                titleTextView.text = tvShow.name
                descriptionTextView.text = tvShow.overview
                val posterURL = "https://image.tmdb.org/t/p/w500" + tvShow.posterPath

                Glide.with(imageView.context)
                    .load(posterURL)
                    .into(imageView)
            }
        }
    }
}