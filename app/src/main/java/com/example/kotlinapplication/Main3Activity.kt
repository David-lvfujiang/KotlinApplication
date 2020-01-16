package com.example.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var array1 = arrayOf("1", "2", 3, 4)//不指定数组元素类型
        array1.plus(5)
        var array2 = arrayOf<Int>(1, 2, 3)//利用泛型指定数组元素为Int
        var array3 = arrayOf<String>("1", "2")//利用泛型指定数组元素为String
        var array4 = intArrayOf(1, 2, 3)
        val arr = Array(4, {1;2;3;4})
        for (i in array1 ){
            println(i)
        }

        var list1 = listOf<String>("1", "2", "3")//不可变的List，并指定泛型为String
        var list2 = listOf(1, 2, "3")//不可变的List
        var list3 = arrayListOf(1, 2, "3")//可变的List
        var list4 = arrayListOf<String>("1", "2", "3")//可变的List，元素类型为String
        var list5 = mutableListOf<String>("1", "2")//可变的List，元素类型为String
        var list6 = ArrayList<Int>()//java创建List的方式
        list6.add(1)
        list6.add(2)

        var map1 = mapOf<String, String>("姓名" to "张三")
        var map2 = hashMapOf<String, String>("姓名" to "张三")
        var map3 = HashMap<String,String>()
        map3.put("姓名","张三")
        var map4 = mutableMapOf<String,String>(("姓名" to "张三"))

        var set1 = setOf<Int>(1,2,2)//不可变的集合

        var set2 = hashSetOf<Int>(1,2,3)//可变的set集合
        var set3 = HashSet<Int>()
       var set4 = mutableSetOf<Int>(1,2,2)//可变的set集合

    }


}
