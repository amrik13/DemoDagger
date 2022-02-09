package com.disc.daggerdemo.model

import javax.inject.Inject

class Television {

    var tvPrice: Int = 0

    @Inject
    constructor() {
        this.tvPrice = 15000 //tvPrice
    }
}