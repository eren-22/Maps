package com.erenoz.maps.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class Place (

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "latitude")
    var latitude: Double,

    @ColumnInfo(name = "longitude")
    var longitude: Double

    ) : Serializable {

    // constructor içinde oluşturmuyoruz çünkü id'yi bizden istemesine gerek yok.
    @PrimaryKey (autoGenerate = true)
    val id = 0
}