#Author: Thomas Curtis
#Program 5: Program simulates tossing a coin x times, then outputs the results 

def coinToss x
    
    arr = []
    hCount = 0
    tCount = 0

    count = x.chomp.to_i
    for i in 1..count do

       if rand(0..1) == 1
        arr.append("HEAD")
     
       else
        arr.append("TAIL")
       end
        
    end

    for i in arr do
        
        if i == "HEAD"
            hCount = hCount + 1
        elsif i == "TAIL"
            tCount = tCount + 1
        end
    end

    puts "Heads generated: #{hCount}"
    puts "Tails generated: #{tCount}"

end

toss = gets
coinToss toss