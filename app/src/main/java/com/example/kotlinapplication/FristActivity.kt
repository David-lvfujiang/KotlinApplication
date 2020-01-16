package com.example.kotlinapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinapplication.module.Message

class FristActivity : AppCompatActivity() {
    var name: String? = "异常"
    lateinit var message: Message<Any?>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frist)
        // name = message.name
        //  Log.e("TAG", "$name")
        //test("张三", 23)
//        var list: ArrayList<String> = ArrayList()
//        list.add("哈哈哈")
//        list.add("呵呵呵")
//        var str : String? = null
//        Log.e("TAG", str?.toString()!!)       // whenName()
//        Log.e("TAG", str?.toString()?:"空值")       // whenName()
        var name:String = "哈哈哈"
        Log.e("TAG", (name as? Int).toString())
        // forName()
    }

    fun whenName() :String? {
        when (2) {
            1 -> Log.e("TAG", "1")
            2 -> Log.e("TAG", "2")
            else -> Log.e("TAG", "2")
        }
        when (1 < 2) {
            true -> Log.e("TAG", "true")
            false -> Log.e("TAG", "false")
        }
        var list: ArrayList<String> = ArrayList()
        list.add("哈哈哈")
        list.add("呵呵呵")
        when ("哈哈哈") {
            in list -> Log.e("TAG", "存在")
            else -> Log.e("TAG", "不存在")
        }

        when (name) {
            is String -> Log.e("TAG", "字符串")
            else ->Log.e("TAG", "其他")
        }
        return  null;
    }


    fun test(name: String, age: Int): String {
        Log.e("TAG", "$name")
        Log.e("TAG", "$age")
        return ""
    }

    fun forName() {
        for (i in 0 until 10 step 2) {
            Log.e("TAG", "$i")
            // println(i)
//        }
//        var list:ArrayList<String>  = ArrayList()
//        list.add("哈哈哈")
//        list.add("呵呵呵")
//        for (i in list)
//        {
//            Log.e("TAG",i.toString())
//
        }
    }
}
