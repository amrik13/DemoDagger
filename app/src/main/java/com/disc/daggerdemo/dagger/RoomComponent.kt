package com.disc.daggerdemo.dagger

import com.disc.daggerdemo.MainActivity
import com.disc.daggerdemo.model.Room
import dagger.Component

@Component
interface RoomComponent {

//    fun getRoom() : Room

    fun injectRoom(mainActivity: MainActivity)
}