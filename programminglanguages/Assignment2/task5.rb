#Author: Thomas Curtis
#The program creates a random list of 50 objects and computes the total are of all the shapes

#Parent Class 
class Shape
    attr_accessor :color

    def initialize()
        @color = "blue"
    end

    def area()
        raise NotImplemnetedError
    end
end

class Octogon < Shape #Child of Shape 
    attr_accessor :side

    def initialize()
        super
        @side = 2.0
    end

    def octagon(side)
    end

    def area()
        area = 2 * (1 + Math.sqrt(2)) * side * side
    end
end

class Hexagon < Shape #Child of shape
    attr_accessor :side
    def initialize()
        super
        @side = 3.0
    end

    def hexagon(side)
    end

    def area()
        area = (3 * Math.sqrt(3)/2) * side * side
    end
end

elements = 50
shape = [] #array of shapes
i = 0
while i < 50

    type = rand(2) #generates random number between 0 and 1
    if type == 0
        shape.push(Octogon.new)
    else
        shape.push(Hexagon.new)
    end

    i = i+1
end

#computes the total area of all the shapes in the array
total = shape.inject(0) do |sum, currentShape|
    sum + currentShape.area() 
end 

puts "The total area of all the shapes is: #{total.round(3)}"


    
