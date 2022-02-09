package com.disc.daggerdemo.model

import javax.inject.Inject

class Table {

    var tablePrice: Int = 0

    @Inject
    constructor() {
        this.tablePrice = 2000 //tablePrice
    }

}