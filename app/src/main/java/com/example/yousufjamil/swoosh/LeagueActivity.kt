package com.example.yousufjamil.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        val leagueIntent : Button = findViewById(R.id.leagueNextBtn)
        leagueIntent.setOnClickListener {
            val intent = Intent(this, SkillActivity :: class.java)
            startActivity(intent)
        }
    }
}
