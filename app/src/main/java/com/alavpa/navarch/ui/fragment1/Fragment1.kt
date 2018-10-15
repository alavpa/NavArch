package com.alavpa.navarch.ui.fragment1

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo.IME_ACTION_GO
import androidx.navigation.fragment.findNavController
import com.alavpa.navarch.R
import com.alavpa.navarch.ui.fragment2.Fragment2
import kotlinx.android.synthetic.main.fragment1.text1

class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        text1.setOnEditorActionListener { _, actionId, _ ->

            val isDone = actionId == IME_ACTION_GO
            if (isDone) {
                findNavController().navigate(R.id.goToFragmentGlobal2, Bundle().apply {
                    this.putString(Fragment2.PARAM, text1.text.toString())
                })
            }
            return@setOnEditorActionListener isDone
        }
    }
}
