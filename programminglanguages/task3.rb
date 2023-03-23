#Author:Thomas Curtis
#Program 3: A function that computes the value of x^x without using the exponent operator

def bar x
    
    power = 1
    for i in 1..x
        power = power * x
    end
        
    puts power

end

bar 9