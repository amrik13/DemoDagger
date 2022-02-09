package com.disc.daggerdemo.model

import javax.inject.Inject


class Room @Inject constructor(table: Table, door: Door, television: Television) {

    private var table: Table? = null
    private var door: Door? = null
    private var television:Television? = null
    private var isSpecial : Boolean = false

    init {
        this.table = table
        this.door = door
        this.television = television
    }

    fun getRent(isSpecial: Boolean) : Int {
        this.isSpecial = isSpecial
        return if (isSpecial){
            (door!!.doorPrice + table!!.tablePrice + television!!.tvPrice)
        } else {
            (door!!.doorPrice + table!!.tablePrice)
        }
    }

    fun getItems() : String {
        return if (isSpecial){
            "Furniture + TV"
        } else {
            "Furniture"
        }
    }



}