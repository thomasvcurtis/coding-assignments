//Author: Thomas Curtis
//Description: The program creates a random list of 25 objects and computes the total are of all the shapes

import scala.math

object task2 {

    def main(args: Array[String]):Unit  = {

        class Shape {
            val color:String = "blue"
        }

        class Circle(radius:Double) extends Shape {
            val r = 3  
             def area():Double = {
                return scala.math.Pi*scala.math.pow(r,2)
            }            
        }

        class Hexagon(side:Double) extends Shape {
            val s = 2    
            def area():Double = {
                return (3*scala.math.sqrt(3)/2) * scala.math.pow(s,2)
            }
        }

        var shape_list:List[Shape] = List()

        val b = new scala.util.Random
        var total_area:Double = 0

        for(i <- 0 until 25) {
            
            var x:Int = b.nextInt(2)

            if(x == 0) {
                shape_list = shape_list :+ new Hexagon(3.0)
            }
            if(x == 1) {
                shape_list = shape_list :+ new Circle(2.0)      
            }
        }

        shape_list.foreach{
            case x: Hexagon => total_area += x.area()
            case x: Circle => total_area += x.area()
        }

        println("The total area of all the shapes is " + total_area)

    }
}

