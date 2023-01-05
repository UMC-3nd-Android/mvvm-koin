package umc.myapplication.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import umc.myapplication.ui.base.BaseViewModel

class MainViewModel : BaseViewModel() {
    val userInputText: MutableLiveData<String> = MutableLiveData("_")
    val randomNumber: MutableLiveData<String> = MutableLiveData("1")
    val nowViewNumber = 0
}