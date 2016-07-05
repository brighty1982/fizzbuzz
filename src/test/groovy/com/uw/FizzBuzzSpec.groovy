package com.uw

import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by uw on 05/07/16.
 */
class FizzBuzzSpec extends Specification {

    @Unroll("Values not divisible by 3 or 5 are not changed where number is #number")
    def "Values not divisible by 3 or 5 are not changed"(){
        given:
        def numberList = (1..100)
        FizzBuzz fizzBuzz = new FizzBuzz()

        when:
        fizzBuzz.evaluate(numberList)

        then:
        sysOut.toString().split('\n')[number -1] == number.toString()

        where:
        number << (1..100).findAll{ !isFizz(it) && !isBuzz(it) }
    }

    @Unroll("fizz is #number")
    def "values divisible by 3 are printed as fizz"(){
        given:
        def numberlist = (1..100)
        FizzBuzz fizzBuzz = new FizzBuzz()

        when:
        fizzBuzz.evaluate(numberlist)

        then:
        sysOut.toString().split('\n')[number -1] == "fizz"

        where:
        number << (1..100).findAll{ isFizz(it) && !isBuzz(it)}
    }

    @Unroll("buzz is  #number")
    def "values divisible by 5 are printed as buzz"(){
        given:
        def numberlist = (1..100)
        FizzBuzz fizzBuzz = new FizzBuzz()

        when:
        fizzBuzz.evaluate(numberlist)

        then:
        sysOut.toString().split('\n')[number -1] == "buzz"

        where:
        number << (1..100).findAll{ isBuzz(it) &&  !isFizz(it) }
    }



    @Unroll("fizzbuzz  #number")
    def "values divisible by 3 and 5 are printed as fizzbuzz"(){
        given:
        def numberlist = (1..100)
        FizzBuzz fizzBuzz = new FizzBuzz()

        when:
        fizzBuzz.evaluate(numberlist)

        then:
        sysOut.toString().split('\n')[number -1] == "fizzbuzz"

        where:
        number << (1..100).findAll{ isBuzz(it) &&  isFizz(it)}
    }


    private boolean isFizz(int it) {
        it % 3 == 0
    }

    private boolean isBuzz(int it) {
        it % 5 == 0
    }

    private final ByteArrayOutputStream sysOut = new ByteArrayOutputStream();
    private final PrintStream originalSysOut = System.out;


    def setup(){
        System.setOut(new PrintStream(sysOut));
    }

    def cleanup(){
        System.setOut(originalSysOut);
    }

}
