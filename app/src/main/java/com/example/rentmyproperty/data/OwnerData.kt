package com.example.rentmyproperty.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class OwnerData(
@PrimaryKey val id: Long,
            val name: String,
            val email: String,
            val telephone: Int,
            val bankaccount: Long
)
@Entity
data class HousingData(
@PrimaryKey val id: Long,
            val name: String,
            val description: String,
            val longitude: Long,
            val latitude: Long,
            val price: Number,
)


