package ru.netology.statsview

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.*
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.netology.statsview.ui.StatsView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<StatsView>(R.id.statsView)
        view.postDelayed({
            view.data = listOf(
                0.25F,
                0.25F,
                0.25F,
                0.25F,
            )
        }, 3000)

        val textView = findViewById<TextView>(R.id.label)

        view.startAnimation(
            AnimationUtils.loadAnimation(this, R.anim.animation).apply {
                setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(animation: Animation?) {
                        textView.text = "onAnimationStart"
                    }

                    override fun onAnimationEnd(animation: Animation?) {
                        textView.text = "onAnimationEnd"
                    }

                    override fun onAnimationRepeat(animation: Animation?) {
                        textView.text = "onAnimationRepeat"
                    }

                })
            }
        )

//        view.animate()
//            .rotation(360F)
//            .setStartDelay(2700)
//            .setDuration(1500)
//            .setInterpolator(LinearInterpolator())
//            .start()
//
//        ObjectAnimator.ofFloat(view, View.ROTATION, 0F, 360F).apply {
//            startDelay = 2700
//            duration = 1700
//            interpolator = LinearInterpolator()
//        }.start()

    }
}
