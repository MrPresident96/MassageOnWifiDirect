package uz.imes.massageonwifidirect

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import uz.imes.massageonwifidirect.ui.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
