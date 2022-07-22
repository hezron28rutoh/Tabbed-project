package com.example.morningtabbedproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.morningtabbedproject.fragments.ChatsFragment
import com.example.morningtabbedproject.ui.main.User

class CustomAdapter(var context: Context?, var data:ArrayList<User>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtName:TextView
        var mTxtNumber:TextView
        var mPersonPic:ImageView
        init {
            this.mTxtName = row?.findViewById(R.id.mTvName) as TextView
            this.mTxtNumber = row?.findViewById(R.id.mTvContact) as TextView
            this.mPersonPic = row?.findViewById(R.id.mImagedp) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.chatsfragmentlayout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:User = getItem(position) as User
        viewHolder.mTxtName.text = item.name
        viewHolder.mTxtNumber.text = item.phone
        viewHolder.mPersonPic.setImageResource(item.image)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}