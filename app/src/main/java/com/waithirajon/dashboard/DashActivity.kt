package com.waithirajon.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waithirajon.dashboard.databinding.ActivityDashBinding

class DashActivity : AppCompatActivity() {
    var binding:ActivityDashBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding!!.root)
        supportActionBar!!.hide()
    }
}