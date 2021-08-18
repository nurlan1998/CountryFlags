package com.nurlan.countryflags.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nurlan.countryflags.data.models.Country
import com.nurlan.countryflags.data.models.CountryItem
import com.nurlan.countryflags.data.remote.RemoteRepositoryImpl
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class CountryViewModel @Inject constructor(
    private val remoteRepository: RemoteRepositoryImpl): ViewModel() {

    val countries: MutableLiveData<Response<Country>> = MutableLiveData()

    fun getCountry(name: String){
        viewModelScope.launch {
            val countryList = remoteRepository.getCountry(name)
            countries.value = countryList
        }
    }

}