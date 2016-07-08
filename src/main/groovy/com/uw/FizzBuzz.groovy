package com.uw

/**
 * Created by uw on 05/07/16.
 */
class FizzBuzz {

    def evaluate(def integers) {
        integers.forEach {
            switch (it) {
                case { isFizz(it) && isBuzz(it) }:
                    println "fizzbuzz"
                    break
                case { isFizz(it) }:
                    println "fizz"
                    break
                case { isBuzz(it) }:
                    println "buzz"
                    break
                default:
                    println it.toString()
                    break
            }
        }
    }

    boolean isFizz(def value){
        value % 3 == 0
    }

    boolean isBuzz(def value){
        value % 5 == 0
    }

}
