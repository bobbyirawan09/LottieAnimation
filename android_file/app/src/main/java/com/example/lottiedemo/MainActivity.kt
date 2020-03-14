package com.example.lottiedemo

import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieDrawable
import com.airbnb.lottie.LottieDrawable.INFINITE
import com.airbnb.lottie.LottieDrawable.RESTART
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Animator.AnimatorListener {

    var lottieDrawable = LottieDrawable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_stop.setOnClickListener {
            progress_bar_1.pauseAnimation()
        }

        button_play.setOnClickListener {
            progress_bar_1.playAnimation()
        }

        button_repeat_count_zero.setOnClickListener {
            progress_bar_1.repeatCount = 0
        }

        button_pause.setOnClickListener {
            progress_bar_1.resumeAnimation()
        }

        button_loop.setOnClickListener {
            progress_bar_1.repeatCount = INFINITE
            progress_bar_1.repeatMode = RESTART
        }

        button_scale_down.setOnClickListener {
            progress_bar_1.scale = 0.5f
        }

        button_scale_up.setOnClickListener {
            progress_bar_1.scale = 2f
        }

        button_scale_normal.setOnClickListener {
            progress_bar_1.scale = 1f
        }

        progress_bar_1.addAnimatorUpdateListener {
            val progress = (it.animatedValue as Float * 100).toInt()
            text_view_frame.text =
                "Progress : " + progress
        }

        progress_bar_1.addAnimatorListener(this)
    }

    override fun onAnimationRepeat(animation: Animator?) {
        //Do nothing
    }

    override fun onAnimationEnd(animation: Animator?) {
        //Do nothing
    }

    override fun onAnimationCancel(animation: Animator?) {
        //Do nothing
    }

    override fun onAnimationStart(animation: Animator?) {
        //Do nothing
    }
}
