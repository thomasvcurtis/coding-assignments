//Author: Thomas Curtis
//Description: A function that takes two lists of integers and returns a list of tuples

import scala.io.Source

object task7 {

    def main(args: Array[String]):Unit = {

        def foo(ListA:List[Int], ListB:List[Int]):List[(Int,Int)] = {

            var tuple :List[(Int,Int)] = List()
            var countA = 0
            var countB = 0
            var lowest_value = 0

            for(i <- ListA){
                countA += 1 //Get size of ListA
            }
            
            for(i <- ListB){
                countB += 1 //Get size of ListB
            }

            if (countA > countB) {
                lowest_value = countB
            } else {
                lowest_value = countA
            }
            
            for(i <- 0 until lowest_value){
               tuple = tuple ++ List((ListA(i),ListB(i))) 
             }
        
            return tuple
        }

    val ListA = List(1,2)
    val ListB = List(21,22,23)
    println(foo(ListA,ListB))

    }

}