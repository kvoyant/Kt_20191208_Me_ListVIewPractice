package com.yhkim.kt_20191208_me_listviewpractice.adapters

import android.content.Context
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

        var tempRow = convertView

        if(tempRow == null) {
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