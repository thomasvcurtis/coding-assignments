//Author: Thomas Curtis
//Description: The program ask for a file from the user. It checks the contens of 
//	the file for key words and then outputs statements about the file

import scala.io.StdIn.readLine
import java.io.File
import java.io.PrintWriter
import scala.io.Source
import scala.util.matching.Regex

object task2 {

	def main(args: Array[String]):Unit = {
		
		println("Enter file name")
		var file = scala.io.StdIn.readLine() //input from user

		for(line <- Source.fromFile(file).getLines) {   //gets each line from file
			
			val cplus = line.contains("cplus")
			val ruby  = line.contains("ruby")
			val haskell = line.contains("haskell")
			val scala = line.contains("scala")

			if(cplus || ruby) {
				println("This file context is okay")
			} else if (haskell || scala) {
				println("The file is great")	
			} else {
				println("The file is uninteresting")
			}
		}
    }
}
