package com.example.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinapplication.module.Message

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//     var i: MyInterfaceImp1 = MyInterfaceImp1()
//        i.getName()
//        i.doAction()
//        var  user:User =User("张三",20)
//        println(user.toString())
//        var fn = { name:String, age:String -> println("姓名：$name,年龄：$age")
//        }
//        fn("李四","20")
//
//        name("张三","30", fn)
//        var message1: Message<String> = Message<String>("200")
////        var message2: Message<Int> = Message<Int>(2000)
////        when (message1.messgeType) {
////            is String -> println("String类型")
////        }
        var list = arrayListOf(1,2,"3")
        for ( i in list){
            println(i)
        }

    }

    fun name(name: String, age: String, fn: (String, String) -> Unit) {
        fn(name, age)

    }

}
