package com.example.paintviewlearn

import android.graphics.BitmapFactory
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        paint.isGestureEnable = true // bat cu chi zoom, keo
        paint.isPaintEnable = false // bat cho phep ve
        paint.setBitmap(BitmapFactory.decodeResource(resources,R.mipmap.ic_launcher_foreground))
        paint.setColor(Color.RED) // set mau cay but
        paint.setStrokeWidth(20) // set do rong cua but
        //paint.setBgColor(Color.MAGENTA)
        paint.addText("Khang",100f,100f)
        paint.setTextSize(10)
        paint.setTextColor(Color.RED)

        button.setOnClickListener {
            paint.undo()
        }

        button2.setOnClickListener {
            paint.clear()
        }

        val bitmap = paint.getBitmap(true)
        val imageView = ImageView(this)
        imageView.setImageBitmap(bitmap)


    }
}
