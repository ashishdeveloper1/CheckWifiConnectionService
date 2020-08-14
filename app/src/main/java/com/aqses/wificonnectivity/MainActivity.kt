package com.aqses.wificonnectivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val netwrokConnection = NetworkConnection(applicationContext)
        netwrokConnection.observe(this, Observer { isConnected ->

            if(isConnected){
                layout_disconnected.visibility= View.GONE
                layout_connected.visibility = View.VISIBLE
            }
            else{
                layout_disconnected.visibility= View.VISIBLE
                layout_connected.visibility = View.GONE
            }

        })

    }
}