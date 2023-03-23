#Author: Thomas Curtis
#Program 1: Takes user from input and writes data to file, then the program reads the file and outputs the number of character in the file 

#Asking the user to enter three lines of words
puts "Enter three lines of words"
line0 = gets
line1 = gets
line2 = gets

#Creating a new file and putting the contents on line0..line2 in it
aFile = File.new("myFile.txt", "w")
aFile.write(line0,line1,line2)
aFile.close

#Reading the file("myFile.txt") and count the total number of characters
aFile = File.open("myFile.txt", "r")
lines = File.readlines("myFile.txt")
numLines = lines.size
char = lines.join
totalChar = char.length
puts "#{totalChar} characters"
aFile.close
