package com.example.aston_intensiv_4.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.aston_intensiv_4.R
import com.example.aston_intensiv_4.presentation.hw1.AFragment
import com.example.aston_intensiv_4.presentation.hw2.UserListFragment

class StartFragment : Fragment(R.layout.fragment_start) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnHomework1).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, AFragment.newInstance(), AFragment.A_FRAGMENT_TAG)
                .addToBackStack(AFragment.A_FRAGMENT_TAG).setReorderingAllowed(true).commit()
        }

        view.findViewById<Button>(R.id.btnHomework2).setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container, UserListFragment(), UserListFragment.USER_LIST_FRAGMENT_TAG)
                .addToBackStack(UserListFragment.USER_LIST_FRAGMENT_TAG)
                .setReorderingAllowed(true)
                .commit()
        }
    }
}