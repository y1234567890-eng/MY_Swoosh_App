package com.example.yousufjamil.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val leagueIntent : Button = findViewById(R.id.getStartedbtn)
        leagueIntent.setOnClickListener {
            val intent = Intent(this, LeagueActivity :: class.java)
            startActivity(intent)
        }
    }
}
