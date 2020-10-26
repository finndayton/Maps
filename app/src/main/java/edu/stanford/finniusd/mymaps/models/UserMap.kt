package edu.stanford.finniusd.mymaps.models

import java.io.Serializable

//map the user has created

data class UserMap(val title: String, val places: List<Place>) : Serializable