#Author: Thomas Curtis
#Program 6: Program reads files and processes them to collects  x words and reports the the number of uniquewords in x, 
#the third-most frequent word in x and its frequency, then report the number of unique words that are in both files.

def func6 s
    
    aFile = File.new(s,"r")
    
    words = []
    freq = Hash.new(0)  
    sort = Hash.new(0)
    
    aFile.each_line do |line|

        parLine = line.split #spilts the file line into individual words 
        
        #clean words and insert them into the words array
        for i in parLine do
            i = i.downcase
            i = i.tr('!@#$%^&*()?<>,.":|','')
            words.append(i.chomp)
        end

    end
    words.uniq #Unique words in the file
    unique = words.size # number of unique words

    words.each{|key| freq[key] += 1} #get the frequency of the unique words
    
    sort = freq.sort_by {|key, value| -value}.to_h # sorted the words in acending order
    sort = sort.to_a #covert hash into and array
    puts "There are #{unique} unique words in this story. Third most common words is \"#{sort[2][0]}\" with #{sort[2][1]} occurances." #get the index of the array
    aFile.close
    
end

func6 "storyA.txt"
func6 "storyB.txt"
