package com.uw

/**
 * Created by uw on 05/07/16.
 */
class FizzBuzz {

    def evaluate(def integers) {
        integers.forEach {
            switch (it) {
                case { it % 3 == 0 && it % 5 == 0 }:
                    println "fizzbuzz"
                    break
                case { it % 3 == 0 }:
                    println "fizz"
                    break
                case { it % 5 == 0 }:
                    println "buzz"
                    break
                default:
                    println it.toString()
                    break
            }

//            if(it % 3 == 0 && it % 5 == 0){
//                println "fizzbuzz"
//            } else if(it % 3 == 0 ){
//                println "fizz"
//            } else if(it % 5 == 0 ){
//                println "buzz"
//            } else {
//                println it.toString()
//            }
        }
    }

}
