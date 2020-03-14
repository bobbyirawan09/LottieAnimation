package com.example.lottiedemo

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.model.KeyPath
import com.airbnb.lottie.value.LottieValueCallback
import kotlinx.android.synthetic.main.activity_keypath.*

class KeypathActivity : AppCompatActivity() {

    val tag = "KEYPATH"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keypath)

        progress_bar_1.playAnimation()

        button_change_big_circle.setOnClickListener {
            progress_bar_1.resolveKeyPath(KeyPath("**")).forEach {
                Log.d(tag, it.toString())
            }

            progress_bar_1.addValueCallback(
                KeyPath("**", "Vector", "Fill 1"),
                LottieProperty.STROKE_COLOR,
                { Color.BLUE }
            )

            progress_bar_1.addValueCallback(
                KeyPath("**", "Vector", "Fill 1"),
                LottieProperty.STROKE_WIDTH, LottieValueCallback()
            )

        }

        button_change_little_circle.setOnClickListener {

        }
    }
}
