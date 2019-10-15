package br.com.fiap.class34scj.imovie.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import br.com.fiap.class34scj.imovie.R
import br.com.fiap.class34scj.imovie.ui.login.LogInActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    private val WAIT_TIME_SPLASHSCREEN = 5000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        load()
    }
    private fun load() {
        //Load anim
        val anim = AnimationUtils.loadAnimation(this, R.anim.animation_splash)
        anim.reset()
        ivLogo.clearAnimation()
        tvImovie.clearAnimation()
        //Run anim
        ivLogo.startAnimation(anim)
        tvImovie.startAnimation(anim)
        //Call next activity
        Handler().postDelayed({
            //TEST - here put the code to stay connected

            val proximaTela = Intent(this, LogInActivity::class.java)
            startActivity(proximaTela)
            finish()
        }, WAIT_TIME_SPLASHSCREEN)
    }
}