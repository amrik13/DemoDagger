package com.disc.daggerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.disc.daggerdemo.dagger.DaggerRoomComponent
import com.disc.daggerdemo.dagger.RoomComponent
import com.disc.daggerdemo.model.Door
import com.disc.daggerdemo.model.Room
import com.disc.daggerdemo.model.Table
import com.disc.daggerdemo.model.Television
import dagger.internal.DaggerCollections
import dagger.internal.DaggerGenerated
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var rentText: TextView
    private lateinit var roomItem: TextView
    private lateinit var roomComponent: RoomComponent

    @Inject
    lateinit var room: Room

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rentText = findViewById(R.id.rent_text)
        roomItem = findViewById(R.id.room_item)

        roomComponent = DaggerRoomComponent.create()
        roomComponent.injectRoom(this)
    }

    fun onButtonClicked(view: android.view.View) {
//        val room = roomComponent.getRoom()
        when(view.id){
            R.id.normal -> {
                rentText.text = room?.getRent(false)?.toString()
            }
            R.id.special -> {
                rentText.text = room?.getRent(true)?.toString()
            }
        }
        roomItem.text = room?.getItems()
    }
}