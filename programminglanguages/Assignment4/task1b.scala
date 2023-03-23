//Author: Thomas Curtis
//Desription: A function foo which takes a list b1 of integers as input. Function foo needs to
//  construct (and return) a list b2 where b2 has the same items as b1, but pair-wise swapped. 

object task1b {

    def main(args: Array[String]):Unit = {

        def foo(list:List[Int]):List[Int] = {

            var listb = List[Int]() //new list 

            for(i <- 0 until list.size by 2) {  //Going throght the list by 2 
                listb = listb :+ list(i + 1) //Gets the second elemetent from a and append it to list b
                listb = listb :+ list(i)
                
            }

            return listb
        }

        print(foo(List(3,4,15,16,17,18)))
    
    }

}