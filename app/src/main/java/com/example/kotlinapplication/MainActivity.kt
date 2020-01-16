package com.example.kotlinapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import javax.xml.xpath.XPathConstants.STRING

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView: TextView = findViewById<TextView>(R.id.text)
        textView.setOnClickListener {
            println("hello")
        }

        val a = 12
        val b = 13
        val max: Int
        try {
            val obj: String? = null
            var i: Int = obj?.length ?: 0
            println(i)


        } catch (e: Exception) {
            e.printStackTrace()
        }

    }//原文出自【易百教程】，商业转载请联系作者获得授权，非商业请保留原文链接：https://www.yiibai.com/kotlin/statement-expression.html


//        var sName = """name\nA"""
//        println(sName)
//        for (i in 1 .. 10 step 2) {
//            println(i)
//        }
//        var name: String = "你的故事"
//        var str: String=""
//        getName(1)
//        println(str?.toString())
    // getName(name)
//        var arr1 = arrayOf(1, 2, 3, 4, 5)
//        var arr2 = arrayOfNulls<Int>(3)
//        var str: String = "abcd"
//        for (i in str) {
//            println(i)
//        }
    //     println(getName(name))
}

fun getName(name: Any = "你的城市") {
    when (name) {
        "你的城市" -> println("你的城市")
        "你的故事" -> println("你的故事")
        1 -> println("1")
        else -> println("空")
    }

}

