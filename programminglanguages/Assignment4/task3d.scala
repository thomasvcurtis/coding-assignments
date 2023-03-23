//Author: Thomas Curtis
//Discription: A extention of task3b, a program that using parallel collection to calcuate the images. Then gives the time
//  difference between the serial and parallel functions.

import scala.io.Source
import scala.util.matching.Regex
import scala.io.StdIn.readLine

object task3b {

    def main(args: Array[String]):Unit = {

        def imageCount(page:String):Int = {

            val web_page = io.Source.fromURL(page)("ISO-8859-1").mkString           //Downloads webpage
            val imgRegex = """(http)?s?:?(\/\/[^"']*\.(jpg|jpeg|gif|png|svg))""".r  //Gets images
            val img_count = imgRegex.findAllIn(web_page).matchData.toList.size      //Gets count of images
            return img_count     
        }



        def webpage(url:String):Int = {

            val download = io.Source.fromURL(url)("ISO-8859-1").mkString         //Downloads webpage
            val urlRegex = "(?s)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r          //Get url

            val url_list = urlRegex.findAllIn(download).matchData.toList.map(_.group(1))

            val all_images = url_list.map(x => imageCount(x))
        
            return all_images.reduce(_+_)

        }

        def webpageParallel(url:String):Int = {

            val download = io.Source.fromURL(url)("ISO-8859-1").mkString         //Downloads webpage
            val urlRegex = "(?s)<a.+?href=\"(http.+?)\".*?>(.+?)</a>".r          //Get url

            val url_list = urlRegex.findAllIn(download).matchData.toList.map(_.group(1)).par

            val all_images = url_list.map(x => imageCount(x))
        
             return all_images.reduce(_+_)

        }

        val web_page_link = readLine()

        val time1 = System.currentTimeMillis()
        println(webpage(web_page_link))

        val time2 = System.currentTimeMillis()
        println(webpageParallel(web_page_link))

        val time3 = System.currentTimeMillis()
        
        println("Serial exwcution time: " + (time2 - time1))
        println("Par execution time " + (time3 - time2))
        
    }
}