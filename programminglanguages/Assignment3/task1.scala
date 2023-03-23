//Author: Thomas Curtis
//Description: The program ask a user for a file name and then writes to the file. 

import scala.io.StdIn.readLine
import java.io.File
import java.io.PrintWriter
import scala.io.Source

object task1 { 
	
	def main(args: Array[String]):Unit  = { 

		val file = new PrintWriter(new File("file.txt")) //gets file to write
		var x = 0
		while(x < 3) {
			var line = scala.io.StdIn.readLine() //input from user
			file.write(line + "\n")
			x = (x + 1)
		}
		file.close()
    }
}   

