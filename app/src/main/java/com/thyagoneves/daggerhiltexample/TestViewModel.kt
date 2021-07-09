package com.thyagoneves.daggerhiltexample

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(
    @Named("String2") testStrings2: String
) : ViewModel() {

    init {
        Log.d("ViewModel", "Test String from ViewModel: $testStrings2")
    }
}