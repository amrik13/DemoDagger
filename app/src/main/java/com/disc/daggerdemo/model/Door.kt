package com.disc.daggerdemo.model

import javax.inject.Inject

class Door {

    var doorPrice: Int = 0

    @Inject
    constructor() {
        this.doorPrice = 5000 //doorPrice
    }

}