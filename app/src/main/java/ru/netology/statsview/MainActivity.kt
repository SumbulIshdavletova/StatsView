package ru.netology.statsview

import android.animation.LayoutTransition
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.transition.Scene
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.animation.BounceInterpolator
import ru.netology.statsview.ui.StatsView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val root = findViewById<ViewGroup>(R.id.root)
        root.layoutTransition = LayoutTransition().apply {
            setDuration(2_000)
            setInterpolator(LayoutTransition.CHANGE_APPEARING, BounceInterpolator())
        }

        findViewById<View>(R.id.buttonGo).setOnClickListener {
            val view = layoutInflater.inflate(R.layout.stats_view, root, false)
            root.addView(view, 0)
        }

//        view.startAnimation(
//            AnimationUtils.loadAnimation(this, R.anim.animation)
//        )
//        view.postDelayed({
//            view.data = listOf(
//                900F,
//                220F,
//                250F,
//                260F,
//                100F,
//            )
//        }, 3000)

//        val textView = findViewById<TextView>(R.id.label)
//
//        view.startAnimation(
//            AnimationUtils.loadAnimation(this, R.anim.animation).apply {
//                setAnimationListener(object : Animation.AnimationListener {
//                    override fun onAnimationStart(animation: Animation?) {
//                        textView.text = "onAnimationStart"
//                    }
//
//                    override fun onAnimationEnd(animation: Animation?) {
//                        textView.text = "onAnimationEnd"
//                    }
//
//                    override fun onAnimationRepeat(animation: Animation?) {
//                        textView.text = "onAnimationRepeat"
//                    }
//
//                })
//            }
//        )

    }
}