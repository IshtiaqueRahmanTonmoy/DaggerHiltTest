package com.example.myapplication.apiutils

import com.example.myapplication.sales.ContactModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @get:GET("allusers_contact.php")
    val getContact: Call<ContactModel?>?
}