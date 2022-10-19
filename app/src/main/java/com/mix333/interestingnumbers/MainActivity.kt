package com.mix333.interestingnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val isGone = MutableStateFlow(false)
        // for fun and for future complex time-consuming starting logic
        installSplashScreen().setKeepOnScreenCondition {
            isGone.value
        }
        lifecycleScope.launch {
            Log.d("m3", "coroutine started")
            delay(5000)
            Log.d("m3", "coroutine before changing isGone")
            isGone.value = true
            Log.d("m3", "isGone changed")
        }
        Log.d("m3", "setContentView activity_main")
        setContentView(R.layout.activity_main)
        Log.d("m3", "started activity main")
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment_container_view) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
