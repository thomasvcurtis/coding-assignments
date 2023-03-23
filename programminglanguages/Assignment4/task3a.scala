//Author: Thomas Curtis
//Description: A program which takes a webpage url from the user and then download webpage. 
//  It gets the count the number of images and scripts 

import scala.io.Source
import scala.util.matching.Regex
import scala.io.StdIn.readLine

object task3a {

    def main(args: Array[String]):Unit = {

        def webpage(page:String) = {

            val web_page = io.Source.fromURL(page)("ISO-8859-1").mkString //Downloads webpage
            
            var img_count = 0
            var scrip_count = 0

            val imgRegex = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r //Gets images
            img_count = imgRegex.findAllIn(web_page).matchData.toList.size         //Gets count of images

            val scripRegex = "(?s)<script.*?</script>".r                           //Get scrips 
            scrip_count = scripRegex.findAllIn(web_page).matchData.toList.size     //Gets count of scripts

            println("The webpage contains " + img_count + " images and " + scrip_count + " scripts") 
        
        }

        val web_page_link = readLine()
        webpage(web_page_link)

    }
}
