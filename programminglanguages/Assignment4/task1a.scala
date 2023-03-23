//Author: Thomas Curtis
//Descriptions: A function foo which takes a list b of strings as input. For each string s in b,
//  foo uses the higher-order function map to compute the number of unique characters present in string s.
//  Finally, foo returns a new list containing these numbers. 

object task1a {

    def main(args: Array[String]):Unit = {

        def foo(list:List[String]):List[Int] = {

            val count = list.map(x => x.distinct.size)
            return count

        }

        val list = List("pfcaabcdb", "cbcdde")

        println(foo(list))
    }
}