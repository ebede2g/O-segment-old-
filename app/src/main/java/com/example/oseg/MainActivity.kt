package com.example.oseg

import android.opengl.GLSurfaceView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.oseg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mega : ActivityMainBinding                         //біндниг
    private lateinit var gLView: GLSurfaceView                      //OpenGL


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        //mega = ActivityMainBinding.inflate(layoutInflater)          //наповнюю біндинг
        //setContentView(mega.root)

        gLView = MyGLSurfaceView(this)
        setContentView(gLView)




    }


}