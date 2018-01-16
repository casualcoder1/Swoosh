package com.michaelchow.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    // First function that is called when the activity is created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            // Intent is an object that lets you interact with other applications as well as your own.
            val leagueIntent = Intent(this, LeagueActivity::class.java) // This is an explicit intent.
            startActivity(leagueIntent)
        }
    }
}
