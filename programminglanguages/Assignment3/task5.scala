//Author: Thomas Curtis
//Description: The program contains a function 'mySplit' that given a string and specific
//	character as parameters it returns a list which substrings of the original string
//	from one instance of the specific character to the next

import scala.util.matching.Regex

object task5 {

		def main(args: Array[String]) = {
	
			def mySplit(string: String,char: String): List[String] = {
		
				val check_for = new Regex(char)
				var counter:Int = 0
				var index = List[Int]()
				var strings_to_return = List[String]()
				var new_string = " "

				string.foreach { c =>              //goes though each char and checks with paramenter
					if (c.toString == char) {
						index = index :+ counter   //adds to 'index' list
					}
					counter = counter + 1
				}

				for( x <- 0 until index.size - 1) {
					new_string = " "

					for(y <- index(x) + 1 until index(x+1)) {
						new_string = new_string :+ string.charAt(y)

					}
					strings_to_return = strings_to_return :+ new_string  //add to 'return_to_string' list
				}

				return(strings_to_return)
			}

			println(mySplit("pq3xyz33abc", "3"))

		}
}