package com.example.onlinepay.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.onlinepay.R
import com.example.onlinepay.fragments.ICICIAadharPayFragment
import com.example.onlinepay.fragments.ICICIAmountWithdrawFragment
import com.example.onlinepay.fragments.ICICIBalanceEnquiryFragment
import com.example.onlinepay.fragments.ICICIMiniStatementFragment

class ICICIViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 4;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return ICICIAmountWithdrawFragment()
            }
            1 -> {
                return ICICIBalanceEnquiryFragment()
            }
            2 -> {
                return ICICIAadharPayFragment()
            }
            3 -> {
                return ICICIMiniStatementFragment()
            }
            else -> {
                return ICICIAmountWithdrawFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Amount Withdraw"
            }
            1 -> {
                return "Balance Enquiry"
            }
            2 -> {
                return "Aadhar Pay"
            }
            3 -> {
                return "Mini Statement"
            }
        }
        return super.getPageTitle(position)
    }

}