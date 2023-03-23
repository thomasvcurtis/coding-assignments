//Author: Thomas Curtis
//Description: The program has a funtion 'sumOfPower' that calculates the sum 
//	without using the exponent operator

object task4 {

	def main(args: Array[String]) = {

		def sumOfPower = {

			var sum:Long = 0
			var total_sum:Long = 0

			for(x <- 1 until 11) {
				sum = 1
				for(y <- 0 until x) {
					sum = (sum * x)
				}
				total_sum = (total_sum + sum)
			}
			println(s"Total sum is ${total_sum}")
		}	
		sumOfPower
    }
}