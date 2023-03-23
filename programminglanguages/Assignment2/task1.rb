#Author: Thomas Curtis
#Discription: a program that takes a filename as input, and checks whether the file contains 
#   any word which starts with a capital letter (i.e., A-Z) and ends with a small letter (i.e., a-z)

upper = /[A-Z]/
lower = /[a-z]/
lineNumber = 0

aFile = File.new("task1file.txt", 'r')

#read entire file and searched for words
aFile.each do |line|
    lineNumber = lineNumber + 1
    check = false

    line.split.each do |string|
        if string[0] =~ upper
            if string[-1,1] =~ lower
                check = true
            end
        end
    end
    
    if check == true 
        puts "Line number: #{lineNumber}: #{line}"
    end
end

aFile.close
