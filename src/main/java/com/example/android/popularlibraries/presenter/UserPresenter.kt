package com.example.android.popularlibraries.presenter

import com.example.android.popularlibraries.model.GithubUser
import com.example.android.popularlibraries.view.UserView
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class UserPresenter(private val router: Router, private val user: GithubUser) :
    MvpPresenter<UserView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setLogin(user.login)
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }
}