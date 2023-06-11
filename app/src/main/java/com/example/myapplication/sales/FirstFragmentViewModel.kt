package com.example.myapplication.sales

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class FirstFragmentViewModel(application: Application) :
    AndroidViewModel(application) {
    private var categoriesRepository: FirstFragmentRepository? = null
    fun FirstFragmentViewModelInit(context: Context?) {
        categoriesRepository = FirstFragmentRepository(context!!)
    }

    val allContactList: MutableLiveData<ContactModel?>
        get() = categoriesRepository?.allCategories!!
}