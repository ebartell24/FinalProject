package com.example.finalproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FinalViewModel : ViewModel(){


    private val _clickedAbout = MutableLiveData(false)
    val clickedAbout: LiveData<Boolean>
        get() = _clickedAbout
}