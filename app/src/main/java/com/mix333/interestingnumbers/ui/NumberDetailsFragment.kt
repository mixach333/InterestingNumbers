package com.mix333.interestingnumbers.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mix333.interestingnumbers.databinding.FragmentNumberDetailsBinding

class NumberDetailsFragment :
    BaseFragment<FragmentNumberDetailsBinding>(FragmentNumberDetailsBinding::inflate) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding.root
    }

}