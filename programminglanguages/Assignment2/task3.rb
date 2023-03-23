#Author: Thomas Curtis
#Discription: The program computes the fibonacci sequence iteratively and recursivly 
#   and give benchmark results of both algorithms


require 'benchmark'

def iterativeFib(num)

    num0 = 1
    num1 = 1
    n = 0
    print num1

    while n < num - 1 do
        n = n + 1
        print ", #{num0}"
    
        total =  num0 + num1
        num1 = num0
        num0 = total
 
    end

end

def recursivefib(n)
    #Base Case
    if n <= 2
        return 1
    else
        return recursivefib(n-1) + recursivefib(n-2) #Recursion
    end
end

#Iterative benchmark 
iterativeTime = Benchmark.measure do
    iterativeFib 38
  end
puts iterativeTime


#Recurive benchmark
recursiveTime = Benchmark.measure do
    for i in 0..38 do
        print "#{recursivefib i}, "
     end
end
puts recursiveTime



