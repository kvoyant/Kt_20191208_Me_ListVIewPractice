package com.yhkim.kt_20191208_me_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yhkim.kt_20191208_me_listviewpractice.datas.User
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tempUser =  User(inputName: "김영호", inputAddress:"서울시 은평구", isWomenOk:true)
//        tempUser.name = "yhkim"

        val tempUser2 =  User("김영호","서울시 은평구",true)

        val tempUser = User(inputName = "김영호", inputAddress = "서울시 은평구", isWomenOk = true)

        Log.d("tempUser","${tempUser.name}")
        Log.d("사용자 이름","${tempUser2.name}")

//        람다형식 간소화 (예)
//        okBtn.setOnCLickListner{}
//        okBtn.setOnClicKListner(object : HostCallbacks() {
//        })
    }
}
