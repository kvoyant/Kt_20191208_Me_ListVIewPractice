package com.yhkim.kt_20191208_me_listviewpractice.datas

import android.util.Log
import java.util.*

class User( inputName:String, inputAddress:String, isWomenOk:Boolean ) {

    var name = inputName
    var address = inputAddress
    var isWomen = isWomenOk

    init {
        Log.d("생성자호출",inputName)//생성자 호출시 부가 동작 실행
    }

    constructor() : this("미정" , "거주지 불명", false)

    constructor(name:String) : this(name, "거주지만 모름", true)
}