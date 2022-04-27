package com.example.memorygame.ui

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.RelativeLayout
import com.example.memorygame.R
import com.example.memorygame.databinding.FragmentPlayBinding
import com.example.memorygame.manager.game_manager
import com.example.memorygame.models.model
import com.example.memorygame.utils.replaceFragment

class PlayFragment : Fragment() {
    private lateinit var front_anim1 : AnimatorSet
    private lateinit var back_anim1 : AnimatorSet
    private lateinit var front_anim2 : AnimatorSet
    private lateinit var back_anim2 : AnimatorSet
    private lateinit var front_anim3 : AnimatorSet
    private lateinit var back_anim3 : AnimatorSet
    private lateinit var front_anim4 : AnimatorSet
    private lateinit var back_anim4 : AnimatorSet
    private lateinit var front_anim5 : AnimatorSet
    private lateinit var back_anim5 : AnimatorSet
    private lateinit var front_anim6 : AnimatorSet
    private lateinit var back_anim6 : AnimatorSet
    private lateinit var front_anim7 : AnimatorSet
    private lateinit var back_anim7 : AnimatorSet
    private lateinit var front_anim8 : AnimatorSet
    private lateinit var back_anim8 : AnimatorSet
    private lateinit var front_anim9 : AnimatorSet
    private lateinit var back_anim9 : AnimatorSet
    private lateinit var front_anim10 : AnimatorSet
    private lateinit var back_anim10 : AnimatorSet
    private lateinit var front_anim11 : AnimatorSet
    private lateinit var back_anim11 : AnimatorSet
    private lateinit var front_anim12 : AnimatorSet
    private lateinit var back_anim12 : AnimatorSet
    private lateinit var front_anim13 : AnimatorSet
    private lateinit var back_anim13 : AnimatorSet
    private lateinit var front_anim14 : AnimatorSet
    private lateinit var back_anim14 : AnimatorSet
    private lateinit var front_anim15 : AnimatorSet
    private lateinit var back_anim15 : AnimatorSet
    private lateinit var front_anim16 : AnimatorSet
    private lateinit var back_anim16 : AnimatorSet
    var isFront = true
    private val allVariationsViewGroup by lazy {
        ArrayList<ViewGroup>()
    }
    private val imageList by lazy {
        ArrayList<model>()
    }
    lateinit var playManager:game_manager
    lateinit var binding:FragmentPlayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding= FragmentPlayBinding.inflate(layoutInflater)
       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getAllImages()
        playManager = game_manager(imageList)
        loadView()
        loadDatatoView()
        openAllImages()
        /// Buttoni bosilganda shu if ishlatilsa almashadi
//        if (isFront) {
//            front_anim.setTarget(binding.img1)
//            back_anim.setTarget(binding.back1)
//            front_anim.start()
//            back_anim.start()
//            isFront = false
//        } else {
//            front_anim.setTarget(binding.back1)
//            back_anim.setTarget(binding.img1)
//            back_anim.start()
//            front_anim.start()
//            isFront = true
//        }
        binding.back.setOnClickListener {
            requireActivity().replaceFragment(MenuFragment())
        }
    }

    private fun openAllImages() {
        front_anim1= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim1 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet
        front_anim2= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim2 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim3= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim3 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim4= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim4 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim5= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim5 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim6= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim6 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim7= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim7 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim8= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim8 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim9= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim9 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim10= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim10 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim11= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim11 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim12= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim12 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim13= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim13 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim14= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim14 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim15= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim15 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet

        front_anim16= AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.front_animator
        ) as AnimatorSet
        back_anim16 = AnimatorInflater.loadAnimator(
            requireContext(),
            R.animator.back_animator
        ) as AnimatorSet
        //////////////////
        front_anim1.setTarget(binding.img1)
        back_anim1.setTarget(binding.back1)
        front_anim1.start()
        back_anim1.start()
        ////////
        front_anim2.setTarget(binding.img2)
        back_anim2.setTarget(binding.back2)
        front_anim2.start()
        back_anim2.start()
        //////
        front_anim3.setTarget(binding.img3)
        back_anim3.setTarget(binding.back3)
        front_anim3.start()
        back_anim3.start()
        //////
        front_anim4.setTarget(binding.img4)
        back_anim4.setTarget(binding.back4)
        front_anim4.start()
        back_anim4.start()
        //////
        front_anim5.setTarget(binding.img5)
        back_anim5.setTarget(binding.back5)
        front_anim5.start()
        back_anim5.start()
        //////
        front_anim6.setTarget(binding.img6)
        back_anim6.setTarget(binding.back6)
        front_anim6.start()
        back_anim6.start()
        //////
        front_anim7.setTarget(binding.img7)
        back_anim7.setTarget(binding.back7)
        front_anim7.start()
        back_anim7.start()
        //////
        front_anim8.setTarget(binding.img8)
        back_anim8.setTarget(binding.back8)
        front_anim8.start()
        back_anim8.start()
        //////
        front_anim9.setTarget(binding.img9)
        back_anim9.setTarget(binding.back9)
        front_anim9.start()
        back_anim9.start()
        /////
        front_anim10.setTarget(binding.img10)
        back_anim10.setTarget(binding.back10)
        front_anim10.start()
        back_anim10.start()
        /////
        front_anim11.setTarget(binding.img11)
        back_anim11.setTarget(binding.back11)
        front_anim11.start()
        back_anim11.start()
        /////
        front_anim12.setTarget(binding.img12)
        back_anim12.setTarget(binding.back12)
        front_anim12.start()
        back_anim12.start()
        /////
        front_anim13.setTarget(binding.img13)
        back_anim13.setTarget(binding.back13)
        front_anim13.start()
        back_anim13.start()
        ////
        front_anim14.setTarget(binding.img14)
        back_anim14.setTarget(binding.back14)
        front_anim14.start()
        back_anim14.start()
        /////
        front_anim15.setTarget(binding.img15)
        back_anim15.setTarget(binding.back15)
        front_anim15.start()
        back_anim15.start()
        ////
        front_anim16.setTarget(binding.img16)
        back_anim16.setTarget(binding.back16)
        front_anim16.start()
        back_anim16.start()
    }

    private fun loadDatatoView() {
        binding.img1.setImageResource(playManager.getImage1())
        binding.img2.setImageResource(playManager.getImage2())
        binding.img3.setImageResource(playManager.getImage3())
        binding.img4.setImageResource(playManager.getImage4())
        binding.img5.setImageResource(playManager.getImage1())
        binding.img6.setImageResource(playManager.getImage6())
        binding.img7.setImageResource(playManager.getImage5())
        binding.img8.setImageResource(playManager.getImage4())

        binding.img9.setImageResource(playManager.getImage7())
        binding.img10.setImageResource(playManager.getImage8())
        binding.img11.setImageResource(playManager.getImage3())
        binding.img12.setImageResource(playManager.getImage8())
        binding.img13.setImageResource(playManager.getImage5())
        binding.img14.setImageResource(playManager.getImage6())
        binding.img15.setImageResource(playManager.getImage2())
        binding.img16.setImageResource(playManager.getImage7())
    }

    private fun uncheck() {

    }

    private fun loadView() {
        for (i in 0 until binding.fontImageList.childCount){
            if (binding.fontImageList.getChildAt(i) is RelativeLayout){
                allVariationsViewGroup.add(binding.fontImageList.getChildAt(i) as RelativeLayout)
            }
        }
    }

    private fun getAllImages() {
        imageList.add(
            model(
                R.drawable.animals_1,
                R.drawable.animals_2,
                R.drawable.animals_3,
                R.drawable.animals_4,
                R.drawable.animals_5,
                R.drawable.animals_6,
                R.drawable.animals_7,
                R.drawable.animals_8
            )
        )
        imageList.add(
            model(
                R.drawable.animals_9,
                R.drawable.animals_10,
                R.drawable.animals_11,
                R.drawable.animals_12,
                R.drawable.animals_13,
                R.drawable.animals_14,
                R.drawable.animals_15,
                R.drawable.animals_16
            )
        )
        imageList.add(
            model(
                R.drawable.animals_17,
                R.drawable.animals_18,
                R.drawable.animals_19,
                R.drawable.animals_20,
                R.drawable.animals_21,
                R.drawable.animals_22,
                R.drawable.animals_23,
                R.drawable.animals_24
            )
        )
    }
    private fun startTimer() {
        object : CountDownTimer(5000, 2500) {
            override fun onFinish() {
            }
            override fun onTick(millisUntilFinished: Long) {
            }
        }.start()
    }
}