package com.yhkim.kt_20191208_me_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.yhkim.kt_20191208_me_listviewpractice.adapters.StudentAdapter
import com.yhkim.kt_20191208_me_listviewpractice.adapters.UserAdapter
import com.yhkim.kt_20191208_me_listviewpractice.datas.User
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //테스트용 주석

    val studentList = ArrayList<User>()
    var userAdapter:UserAdapter? = null

    val secondStudentList = ArrayList<User>()
    var studentAdapter:StudentAdapter? = null


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

//        학생목록 추가
        addStudents()

        userAdapter = UserAdapter(this, R.layout.user_list_item, studentList)
        userListView.adapter = userAdapter

        addSecondStudent()

        studentAdapter = StudentAdapter(this, R.layout.student_list_item, secondStudentList)
        secondListView.adapter = studentAdapter


    }

    fun addStudents() {
        studentList.add(User("계석준","서울시 도봉구", false))
        studentList.add(User("김미현","경기도 군포시", true))
        studentList.add(User("김영호","서울시 은평구", false))
        studentList.add(User("노혜진","서울시 강동구", true))
        studentList.add(User("류찬울","서울시 어딘가", false))
        studentList.add(User("양성심","서울시 관악구", true))
        studentList.add(User("이규현","서울시 도봉구", false))
        studentList.add(User("이수정","서울시 고양구", true))
        studentList.add(User("차순혁","서울시 구로구", false))
        studentList.add(User("황연아","경기도 성남시", true))
        studentList.add(User("조경진","서울시 은평구", false))
    }

    fun addSecondStudent() {

        //array 변경 : alt + drag = studentList => secondStudentList

        secondStudentList.add(User("조경진","서울시 은평구", false))
        secondStudentList.add(User("차순혁","서울시 구로구", false))
        secondStudentList.add(User("황연아","경기도 성남시", true))
        secondStudentList.add(User("계석준","서울시 도봉구", false))
        secondStudentList.add(User("김미현","경기도 군포시", true))
        secondStudentList.add(User("김영호","서울시 은평구", false))
        secondStudentList.add(User("노혜진","서울시 강동구", true))
        secondStudentList.add(User("류찬울","서울시 어딘가", false))
        secondStudentList.add(User("양성심","서울시 관악구", true))
        secondStudentList.add(User("이규현","서울시 도봉구", false))
        secondStudentList.add(User("이수정","서울시 고양구", true))
        secondStudentList.add(User("아이유","서울시 강동구", true))
        secondStudentList.add(User("아이린","서울시 어딘가", false))
        secondStudentList.add(User("박보검","서울시 관악구", true))
        secondStudentList.add(User("윤석열","서울시 도봉구", false))
        secondStudentList.add(User("문재인","서울시 고양구", true))
    }

}
