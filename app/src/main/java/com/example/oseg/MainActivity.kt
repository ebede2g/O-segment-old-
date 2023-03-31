package com.example.oseg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oseg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mega : ActivityMainBinding                         //біндниг


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        mega = ActivityMainBinding.inflate(layoutInflater)          //наповнюю біндинг
        setContentView(mega.root)
        


    }


}