package com.example.morningtabbedproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.morningtabbedproject.CustomAdapter
import com.example.morningtabbedproject.R
import com.example.morningtabbedproject.ui.main.User

class ChatsFragment : Fragment() {
    var myUsersList: ListView?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        var root = inflater.inflate(R.layout.fragment_chats, container, false)

        myUsersList = root.findViewById(R.id.mUserListView)
        users = ArrayList()
        adapter = context?.let { CustomAdapter(it, users!!) }
//        start creating users
        var user1 = User(R.mipmap.one,"Hezron Ruto","0795124927")
        var user2 = User(R.mipmap.two,"Harun kariuki","0795124927")
        var user3 = User(R.mipmap.three,"Flyvia Chepng'etich","0795124927")
        var user4 = User(R.mipmap.one,"Hezekiah Kabogo","0795124927")
        var user5 = User(R.mipmap.two,"Margaret Chepkwony","0795124927")
        var user6 = User(R.mipmap.three,"Johnstone Chepkwony","0795124927")
        var user7 = User(R.mipmap.two,"Eugene Mwangi","0795124927")
        var user8 = User(R.mipmap.three,"Chege Eugene","0795124927")
        var user9 = User(R.mipmap.two,"King Wanyanyama","0795124927")
        var user10 = User(R.mipmap.one,"Festus Kipngeno","0795124927")
        var user11 = User(R.mipmap.two,"Trazy Cherop","0795124927")
        var user12 = User(R.mipmap.one,"Prudence Chepchumba","0795124927")
//        Add the created users to the array list
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)
        users!!.add(user10)
        users!!.add(user11)
        users!!.add(user12)
//        Assign our custom Adapter to the list view
        myUsersList!!.adapter = adapter!!

        return root
    }


}