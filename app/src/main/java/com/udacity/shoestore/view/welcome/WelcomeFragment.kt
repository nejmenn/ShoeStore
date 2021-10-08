package com.udacity.shoestore.view.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val details = getString(R.string.details_string_fragment_welcome, WelcomeFragmentArgs.fromBundle(arguments!!).email)

        val binding : FragmentWelcomeBinding =  DataBindingUtil.inflate(
            inflater, R.layout.fragment_welcome, container, false)

        binding.detailsTextviewFragmentWelcome.text = details

        binding.nextButton.setOnClickListener {
            onNext()
        }
        return binding.root
    }
    private fun onNext() {
        findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionsFragment())
    }

}