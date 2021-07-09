package com.example.androidday1.Exception

import java.lang.ArithmeticException

class NestedTry {
}
fun main(){
    val numerators = intArrayOf(4,8,16,32,64,128,256,512)
    val denominators = intArrayOf(2,0,4,4,0,8)

    for(i in numerators.indices){
        try{
            println(numerators[i].toString()+"/"+denominators[i]+"is"+numerators[i]/denominators[i])
        }catch (e: ArithmeticException){
            println("Can't divide by Zero!!")
        }
    }
}