//Author: Thomas Curtis
//Description: The program outputs "The cube root of x is y" 10 times 
//	with numbers ranging from 15 to 24

object Task3 {
	def main(args: Array[String]) = {
		var x = 15.0
		var y = 0.0
	
		while(x <= 25) {
			y = scala.math.cbrt(x) //math function
			println(s"The cube root of ${x} is ${y}")
			x = (x+1)
		}
	}
}
		