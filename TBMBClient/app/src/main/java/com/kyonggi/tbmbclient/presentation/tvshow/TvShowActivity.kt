package com.kyonggi.tbmbclient.presentation.tvshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kyonggi.tbmbclient.R
import com.kyonggi.tbmbclient.databinding.ActivityTvShowBinding
import com.kyonggi.tbmbclient.presentation.di.Injector
import javax.inject.Inject

class TvShowActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: TvShowViewModelFactory
    private lateinit var binding: ActivityTvShowBinding
    private lateinit var tvShowViewModel: TvShowViewModel
    private lateinit var adapter: TvShowAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_tv_show)
        (application as Injector).createTvShowSubComponent()
            .inject(this)

        tvShowViewModel = ViewModelProvider(this, factory)
            .get(TvShowViewModel::class.java)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.tvRecyclerview.layoutManager = LinearLayoutManager(this)
        adapter = TvShowAdapter()
        binding.tvRecyclerview.adapter = adapter
        displayPopularTvShows()
    }

    private fun displayPopularTvShows() {
        binding.tvProgressBar.visibility = View.VISIBLE
        val responseLiveData = tvShowViewModel.getTvShows()
        responseLiveData.observe(this) {
            if (it != null) {
                adapter.apply {
                    setList(it)
                    notifyDataSetChanged()
                }
                binding.tvProgressBar.visibility = View.GONE
            } else {
                binding.tvProgressBar.visibility = View.GONE
                Toast.makeText(applicationContext, "데이터가 없습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.update, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.action_update -> {
                updateTvShows()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun updateTvShows() {
        binding.tvProgressBar.visibility = View.VISIBLE
        val response = tvShowViewModel.updateTvShows()
        response.observe(this) {
            if (it != null) {
                adapter.apply {
                    setList(it)
                    notifyDataSetChanged()
                }
                binding.tvProgressBar.visibility = View.GONE
            } else {
                    binding.tvProgressBar.visibility = View.GONE
            }
        }
    }
}