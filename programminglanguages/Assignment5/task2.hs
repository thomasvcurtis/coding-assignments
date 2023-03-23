-- Author: Thomas Curtis
-- Description: a function that accepts a list (lst) of integers as the parameter, 
--  and filters out a sub-list (of lst) which contains only the 3’s multiples and 5’s multiples in lst (if any).

module Main where

multiple n = (n `mod` 3 == 0) || (n `mod` 5 == 0)  -- gets multiple of 3 and 5

numFilter list = filter multiple list  -- function that takes in a list as input and filters 

main = do {

    print(numFilter [10,2,12,35,15,32,20])

}

