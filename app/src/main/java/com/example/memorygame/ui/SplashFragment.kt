package com.example.memorygame.ui

import android.animation.Animator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.memorygame.databinding.FragmentSplashBinding
import com.example.memorygame.utils.replaceFragment

class SplashFragment : Fragment() {
    lateinit var binding:FragmentSplashBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentSplashBinding.inflate(layoutInflater)
        binding.img.alpha=0.0f
        binding.img.animate()
            .alpha(1.0f)
            .setDuration(3000)
            .setListener(object :Animator.AnimatorListener{
                override fun onAnimationStart(p0: Animator?) {

                }

                override fun onAnimationEnd(p0: Animator?) {
                    requireActivity().replaceFragment(MenuFragment())
                }

                override fun onAnimationCancel(p0: Animator?) {

                }

                override fun onAnimationRepeat(p0: Animator?) {

                }

            })
        return binding.root

    }

}