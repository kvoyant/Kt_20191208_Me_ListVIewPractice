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

        Log.d("사용자 이름","${tempUser2.name}")

//        람다형식 간소화 (예)
//        okBtn.setOnCLickListner {} //중괄호만 쓰면 람다 형식( 후행 클로저 )
//        okBtn.setOnClicKListner(object : HostCallbacks() {
//        })

        Log.d("사용자 주소","${tempUser.address}")
        var tempUser3 = User()
        Log.d("사용자 주소","${tempUser3.address}")

        val tempUser4 = User("아이유")
        Log.d("사용자 주소",tempUser4.address)//거주지만 모름

    }
}
