package com.yhkim.kt_20191208_me_listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.yhkim.kt_20191208_me_listviewpractice.R
import com.yhkim.kt_20191208_me_listviewpractice.datas.User
import org.w3c.dom.Text

class UserAdapter(context:Context, resId:Int, list: ArrayList<User>) : ArrayAdapter<User>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    /*
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null) {
            tempRow = inf.inflate(R.layout.user_list_item, null)
        }
        val row = tempRow!!

//        상황에 맞는 데이터를 user_list_item에 뿌려주기
    }
    */

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.user_list_item, null)
        }
        val row = tempRow!!

//        상황에 맞는 데이터를 user_list_item에 뿌려주기

//        리스트에서 각 줄에 맞는 근거 데이터 뽑아 오기
//        position 변수가 몇번째 줄을 출력하려 하는지 알려주는 역할.
        val data = mList.get(position)

//        각 줄에서 데이터를 뿌려줄 뷰를 찾아다 연결.

        val userNameTxt = row.findViewById<TextView>(R.id.userNameTxt)
        val userAddressTxt = row.findViewById<TextView>(R.id.userAddressTxt)
        val genderTxt = row.findViewById<TextView>(R.id.userZenderTxt)

        userNameTxt.text = data.name
        userAddressTxt.text = "(${data.address})"

        if(data.isWomen) {
            genderTxt.text = "여성"
        } else {
            genderTxt.text = "남성"
        }


        return row
    }

}