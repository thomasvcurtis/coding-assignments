--Author: Thomas Curtis
--Description: A function which takes two integers x and y as input parameters and returns
--  the sum of all positive even integers (z)s’ cubes whereas z is bigger than x and smaller than y.

module Main where

    bar x y = foldl (+) (x^y) [x..y]
    main = do {

        print (bar 2 20)
    }
