package com.yhkim.kt_20191208_me_listviewpractice.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.yhkim.kt_20191208_me_listviewpractice.R
import com.yhkim.kt_20191208_me_listviewpractice.datas.User
import java.util.ArrayList

class StudentAdapter(context: Context, resource: Int, list: ArrayList<User>) :
    ArrayAdapter<User>(context, resource, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        Log.d("getView 실행", "${position} 번 줄 그리기")

        var tempRow = convertView

        if(tempRow == null) {

            Log.d("새로 뷰 그리기", "inflate 실행됨")
            //일단 보이는 화면에서만 로그찍힘, 드래그해서 추가로 데이터 볼경우 로그 안찍힘
            //ListView 이론 - 재사용성 : 한화면에 너무 많은 수의 View들을 생성하면 핸드폰 메모리 용량 초과(trello 확인)
            //저글링 방식으로 생각하면 됨

            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!//절대 null 이 아님

        var data = mList.get(position)

//        화면에 뿌려질 데이터 바인딩 ---------------------------
        val stNameTxt = row.findViewById<TextView>(R.id.stNameTxt)
        stNameTxt.text = data.name
        val stAddrTxt = row.findViewById<TextView>(R.id.stAddrTxt)
        stAddrTxt.text = data.address

        return row
    }

}