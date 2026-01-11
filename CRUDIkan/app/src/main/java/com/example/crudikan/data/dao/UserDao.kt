package com.example.crudikan.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.crudikan.data.entity.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user ORDER BY merk_mobil ASC")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE merk_mobil LIKE '%' || :search || '%'")
    fun searchByName(search: String): List<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * FROM user WHERE uid = :uid")
    fun get(uid : Int) : User

    @Update
    fun update(user :User)
}