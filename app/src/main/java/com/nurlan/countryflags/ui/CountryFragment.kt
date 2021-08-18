package com.nurlan.countryflags.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import com.nurlan.countryflags.R
import com.nurlan.countryflags.databinding.FragmentCountryBinding
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class CountryFragment : Fragment(R.layout.fragment_country) {
    private var _binding: FragmentCountryBinding? = null
    private val binding: FragmentCountryBinding
    get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    private val viewModel: CountryViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//
//        viewModel = injectViewModel(viewModelFactory)

        viewModel.getCountry("all")
        viewModel.countries.observe(viewLifecycleOwner){ countryList ->
            Log.i("Response",countryList.body()?.toList().toString())
        }
    }
}