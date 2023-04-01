package com.example.oseg

import android.content.Context
import android.opengl.GLSurfaceView

class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {
    private val renderer: MyGLRenderer
    init {

        setEGLContextClientVersion(2)                   // Create an OpenGL ES 2.0 context

        renderer = MyGLRenderer()

        setRenderer(renderer)                           // Set the Renderer for drawing on the GLSurfaceView


        //renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY                    //рендер лише того, що ми бачимо, дял економії пам'яті
    }


}