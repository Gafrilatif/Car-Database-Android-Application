package com.example.crudikan.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.Inet4Address

@Entity
data class User (
    @PrimaryKey(autoGenerate = true) var uid: Int? = null,
    @ColumnInfo(name = "merk_mobil") var fullName: String?,
    @ColumnInfo(name = "type_mobil") var email: String?,
    @ColumnInfo(name = "kubikasi_mesin") var phone: String?,
    @ColumnInfo(name = "bahan_bakar") var address: String?
)