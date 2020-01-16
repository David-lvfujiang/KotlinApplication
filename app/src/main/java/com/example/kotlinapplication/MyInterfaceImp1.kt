package com.example.kotlinapplication

import com.example.kotlinapplication.MyInterface

/**

@Author: david.lvfujiang
@Date: 2019/11/20
@Describe:
 */
class MyInterfaceImp1 : MyInterface ,MyInterface2{
    override fun doAction() {
        super<MyInterface2>.doAction();
    }

    override var name: String = "MyInterfaceImp1"

    override fun getName() {
        println(name)
    }
}