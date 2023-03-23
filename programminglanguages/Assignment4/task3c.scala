//Author: Thomas Curtis
//Description: A extention of task3b, a program that counts how many webpages have more than 50 characters


import scala.io.Source
import scala.util.matching.Regex
import scala.io.StdIn.readLine

object taskba {

    def main(args: Array[String]):Unit = {

       
        def webpage(url:String):Int = {

            val link = io.Source.fromURL(url)("ISO-8859-1").mkString    
            val urlRegex = "(?s)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r        

            val url_list = urlRegex.findAllIn(link).matchData.toList.map(_.group(1))

            var page_count = 0

            url_list.foreach { url => 

                val page = Source.fromURL(url)("ISO-8859-1").mkString
                if(page.length > 50) {
                    page_count = page_count + 1
                }
                
            }

            return page_count

        }

        val web_page_link = readLine()
        println("There are" + webpage(web_page_link) + " websites with 50 or more characters")
        
    }
}