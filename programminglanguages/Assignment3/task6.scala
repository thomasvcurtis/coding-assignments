//Author: Thomas Curtis
//Description: The program collects statistics about two given files. The program reports the number of unique words.
//   The fifth-most frequent word in the story and its frequency.  Find the number of unique words over these two stories.
//   Find the number of unique common words over these two stories

import scala.io.Source
import scala.util.matching.Regex
import scala.collection.immutable.ListMap

object task6 {

    def main(args: Array[String]) = {

        val file_name = List("storyA.txt","storyB.txt")
        
        //File A
        var wordsA : Set[String]= Set()          //Raw words from file
        var format_wordsA : Set[String] = Set()  //Format words from file

        var frequencyA : List[String] = List()         //Raw frequency of words from file
        var format_frequencyA : List[String] = List()  //frequency of words from file 
    
        for (line <- Source.fromFile(file_name(0)).getLines) {
            
            line.split(" ").foreach(x => wordsA += x) //Get line from file and writes to words set
            frequencyA = frequencyA ++ line.split(" ") //Get line from file and writes to frequency
        }
        
        wordsA.foreach(x => format_wordsA += x.replaceAll("[\"!$&*()?,.]","").toLowerCase) //Format
        val unique_wordsA = format_wordsA.size                                             //Get number of unique words for file

        frequencyA.foreach(x => format_frequencyA = format_frequencyA :+ x.replaceAll("[\"\'!$&*()?,.]","").toLowerCase) //Format frequnecy list 

        val FFMapA = format_frequencyA.groupBy(identity).mapValues(_.size).toMap //Puts formated words into a map 
        val sorted_MapA = ListMap(FFMapA.toSeq.sortWith(_._2 > _._2):_*) //Sort map in decending order
       
        val map_to_arrayA = sorted_MapA.toArray //Get the fifth element in array
       
        //File B
        //Same code from "File A", only changed variable names
        var wordsB : Set[String]= Set() 
        var format_wordsB : Set[String] = Set()    

        var frequencyB : List[String] = List()
        var format_frequencyB : List[String] = List()
        
        for (line <- Source.fromFile(file_name(1)).getLines) {
            
            line.split(" ").foreach(x => wordsB += x) 
            frequencyB = frequencyB ++ line.split(" ")
        }
        
        wordsB.foreach(x => format_wordsB += x.replaceAll("[\"\'!$&*()?,.]","").toLowerCase)
        val unique_wordsB = format_wordsB.size 

        frequencyB.foreach(x => format_frequencyB = format_frequencyB :+ x.replaceAll("[\"\'!$&*()?,.]","").toLowerCase)

        val FFMapB = format_frequencyB.groupBy(identity).mapValues(_.size).toMap  
        val sorted_MapB = ListMap(FFMapB.toSeq.sortWith(_._2 > _._2):_*)
       
        val map_to_arrayB = sorted_MapB.toArray


        //The number of unique words over these two stories
        val unique_words_both = unique_wordsA + unique_wordsB
        
        // the number of unique common words over these two stories.
        val story_intersect = format_wordsA.intersect(format_wordsB)

       
        //Output results
        println("\n")
        println(file_name(0) + " has " + unique_wordsA + " unique words, fifth-most frequent word is " + map_to_arrayA(4))
        println(file_name(1) + " has " + unique_wordsA + " unique words, fifth-most frequent word is " + map_to_arrayB(4))
        
        println("The number of unique words over both two stories is " + unique_words_both)
        println("the number of unique common words over both two stories is " + story_intersect.size)

    }

}