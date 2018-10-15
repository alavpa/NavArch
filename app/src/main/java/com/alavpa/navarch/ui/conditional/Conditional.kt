package com.alavpa.navarch.ui.conditional

import android.os.Bundle
import android.support.v4.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.alavpa.navarch.R

class Conditional : Fragment() {

    companion object {
        const val CODE_FRAGMENT_1 = 1
        const val CODE_FRAGMENT_2 = 2
    }

    private val navigationMap = hashMapOf(
        CODE_FRAGMENT_1 to R.id.goToFragmentGlobal1,
        CODE_FRAGMENT_2 to R.id.goToFragmentGlobal2
    )

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        val destination = navigationMap[CODE_FRAGMENT_1] ?: R.id.goToFragmentGlobal3
        findNavController().navigate(
            destination,
            null,
            NavOptions.Builder().setPopUpTo(R.id.conditional,true).build()
        )
    }
}
