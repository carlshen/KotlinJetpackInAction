package com.boycoder.kotlinjetpackinaction.entity;


import java.util.*


data class User(
    var id: String? = null,
    var login: String? = null,
    var avatar_url: String? = null,
    var name: String? = null,
    var company: String? = null,
    var blog: String? = null,
    var lastRefresh: Date? = null)
{
}
