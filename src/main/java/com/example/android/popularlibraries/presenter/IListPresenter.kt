package com.example.android.popularlibraries.presenter

import com.example.android.popularlibraries.view.IItemView
import com.example.android.popularlibraries.view.UserItemView

interface IListPresenter<V : IItemView> {
    var itemClickListener: ((V) -> Unit)?
    fun bindView(view: V)
    fun getCount(): Int
}

interface IUserListPresenter : IListPresenter<UserItemView>