package com.mix333.interestingnumbers.ui
import androidx.lifecycle.MutableLiveData

class MainViewModel {
    var number : Int? = null
    var description = MutableLiveData<String>("")
    init{
        description.value = ""
    }
}