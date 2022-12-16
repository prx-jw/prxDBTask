package com.example.prxdbtask

import androidx.room.Insert
import androidx.room.Query

@androidx.room.Dao
interface Dao {
    @Query("SELECT * FROM Post")
    fun getPosts(): List<Post>
    @Insert
    fun insertPost(post: Post)
}