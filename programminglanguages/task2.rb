#Author: Thomas Curtis
#Program 2: The program searches the context of the given file and then tells if it is a valuable file

#Input for file name
puts "Enter file name"
fileName = gets.chomp;

#opening and reading the file
File.open(fileName) do |file|

    while line = file.gets

       if line.chomp == "Python" || line.chomp == "Ruby"
            puts "This file is important"
        
        elsif line.chomp == "Scala"
            puts "The file is interesting"
        
        elsif line.chomp == "Haskell"
            puts "The file is valuable"
        
        else 
            puts "The file is worthless"
        end
        
    end

end
