package com.example.android.popularlibraries

import com.example.android.popularlibraries.model.GithubUser
import com.example.android.popularlibraries.presenter.IScreens
import com.github.terrakok.cicerone.androidx.FragmentScreen

class AndroidScreens : IScreens {
    override fun users() = FragmentScreen { UsersFragment.newInstance() }

    override fun user(user: GithubUser) = FragmentScreen { UserFragment.newInstance(user) }
}