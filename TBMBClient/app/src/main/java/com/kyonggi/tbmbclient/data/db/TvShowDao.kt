package com.kyonggi.tbmbclient.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kyonggi.tbmbclient.data.model.tvshow.TvShow

@Dao
interface TvShowDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveTvShows(movies: List<TvShow>)

    @Query("DELETE FROM popular_movies")
    suspend fun deleteAllTvShows()

    @Query("SELECT * FROM popular_movies")
    suspend fun getTvShows()
}