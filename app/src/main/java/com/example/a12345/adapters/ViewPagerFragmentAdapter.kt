package com.example.a12345.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.a12345.fragments.MeoreFragmenti
import com.example.a12345.fragments.MesameFragmenti
import com.example.a12345.fragments.PirveliFragmenti

class ViewPagerFragmentAdapter(activity:AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return PirveliFragmenti()
        }else if(position == 1){
            return MeoreFragmenti()
        }else if(position == 2){
            return MesameFragmenti()
        }else{
            return Fragment()
        }
    }

}