package com.kyonggi.tbmbclient.presentation.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kyonggi.tbmbclient.R
import com.kyonggi.tbmbclient.data.model.movie.Movie
import com.kyonggi.tbmbclient.databinding.ListItemBinding

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    private val movieList = ArrayList<Movie>()

    fun setList(movies: List<Movie>) {
        movieList.clear()
        movieList.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    inner class MyViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: Movie) {
            with(binding) {
                titleTextView.text = movie.title
                descriptionTextView.text = movie.overview
                val posterURL = "https://image.tmdb.org/t/p/w500" + movie.posterPath

                Glide.with(imageView.context)
                    .load(posterURL)
                    .into(imageView)
            }
        }
    }
}