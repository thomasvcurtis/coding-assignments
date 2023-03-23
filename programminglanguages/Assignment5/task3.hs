--Author: Thomas Curtis
--Description: Write a function that accepts a list (lst) of integers as the parameter, and returns x
--  where x is the number of perfect squares in the list lst.

module Main where

    check i = square - fromIntegral(truncate square) == 0.0 where square = sqrt(fromIntegral i)::Float

    squareList list = filter check list

    perfectSquare list = length(squareList list)

    main = do {

        print(perfectSquare [42,9,70,16,225,15,300])
        
    }