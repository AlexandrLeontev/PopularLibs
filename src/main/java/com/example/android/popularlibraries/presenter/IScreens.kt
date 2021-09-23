package com.example.android.popularlibraries.presenter

import com.example.android.popularlibraries.model.GithubUser
import com.github.terrakok.cicerone.Screen

interface IScreens {
    fun users(): Screen
    fun user(user: GithubUser): Screen
}