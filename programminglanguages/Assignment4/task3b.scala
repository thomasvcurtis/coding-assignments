//Author: Thomas
//Description: A program that downloads all webpages that are from a given and give the count of the images that are on
//  the webpage 

import scala.io.Source
import scala.util.matching.Regex
import scala.io.StdIn.readLine

object taskba {

    def main(args: Array[String]):Unit = {

        def imageCount(page:String):Int = {

            val web_page = io.Source.fromURL(page)("ISO-8859-1").mkString           //Downloads webpage
            val imgRegex = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r  //Gets images
            val img_count = imgRegex.findAllIn(web_page).matchData.toList.size      //Gets count of images
            return img_count     
        }

        def webpage(url:String):Int = {

            val download = io.Source.fromURL(url)("ISO-8859-1").mkString         
            val urlRegex = "(?s)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r          

            val url_list = urlRegex.findAllIn(download).matchData.toList.map(_.group(1))

            val all_images = url_list.map(x => imageCount(x))
        
            all_images.reduce(_+_)

        }

        val web_page_link = readLine()
        print("The number of images in the given web page is " + imageCount(web_page_link) + '\n')
        println("The total number of images from the urls from the given web page are " + webpage(web_page_link))

    }
}
