package com.example.kotlinapplication

/**

@Author: david.lvfujiang
@Date: 2019/11/19
@Describe:
 */
class Message1 (name:String ="张三", age:Int =20) {
    private var name:String="";
    private var age:Int = 0;
    init {
        this.name = name;
        this.age = age;
    }
    constructor(name :String) : this(name,0) {
        this.name = name
    }
    override fun toString(): String {
        return "Message(name='$name', age=$age)"
    }

}