#Author: Thomas Curtis
#Discription: A program that outputs the last character and strings that are less than 4. It then builds a new array with all the strings in uppercase. 
#   Also the program get the sum of the length of the strings 

words = ["Apple", "App", "Candle", "Can", "All", "Awole", "guitar", "bulb", "maddening", "box", "zephyr", "error"]

def task2(words)
    
    #Get the last character of each string 
    words.each do |word|
        puts word[-1] 
    end

    p words.select{|word| word.length < 4} #Get words less than 4

    p words.map { |string| string.upcase } #Converts string to uppercase in the array

    #Calcuates the sum of the length of the strings
    stringSum = words.inject(0) do |a,x|
        a + x.length
    end
    p stringSum

end

task2(words)
