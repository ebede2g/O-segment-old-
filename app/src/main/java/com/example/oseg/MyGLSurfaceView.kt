package com.example.oseg

import android.content.Context
import android.opengl.GLSurfaceView
import android.opengl.Matrix
import android.view.MotionEvent
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MyGLSurfaceView(context: Context) : GLSurfaceView(context) {
    private val renderer: MyGLRenderer


    private val TOUCH_SCALE_FACTOR: Float = 0.1f //дотик



    init {

        setEGLContextClientVersion(2)                   // Create an OpenGL ES 2.0 context

        renderer = MyGLRenderer()

        setRenderer(renderer)                           // Set the Renderer for drawing on the GLSurfaceView


        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY                    //рендер лише того, що ми бачимо, дял економії пам'яті
    }












    private var previousX: Float = 0f
    private var previousY: Float = 0f
    override fun onTouchEvent(e: MotionEvent): Boolean {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        val x: Float = e.x
        val y: Float = e.y

        when (e.action) {
            MotionEvent.ACTION_MOVE -> {

                var dx: Float = x - previousX
                var dy: Float = y - previousY

                // reverse direction of rotation above the mid-line
                if (y > height / 2) {
                    dx *= -1
                }

                // reverse direction of rotation to left of the mid-line
                if (x < width / 2) {
                    dy *= -1
                }

                renderer.angle += (dx + dy) * TOUCH_SCALE_FACTOR
                requestRender()
            }
        }

        previousX = x
        previousY = y
        return true
    }
}