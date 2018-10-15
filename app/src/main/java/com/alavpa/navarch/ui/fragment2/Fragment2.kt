package com.alavpa.navarch.ui.fragment2

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alavpa.navarch.R
import kotlinx.android.synthetic.main.fragment2.text2


class Fragment2 : Fragment() {

    companion object {
        const val PARAM = "PARAM"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val param = arguments?.getString(PARAM)
        param?.let {
            text2.text = it
        }
    }
}
