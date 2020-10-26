package edu.stanford.finniusd.mymaps.models

import java.io.Serializable

//one location on the map

data class Place(val title: String, val description: String, val latitude: Double, val longitude: Double) : Serializable