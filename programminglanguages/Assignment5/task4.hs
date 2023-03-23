-- Author: Thomas Curtis
-- Description: A function that accepts an integer as the parameter,
--  and if the integer is a non-negative integer then it breaks it into its digits and the output is a list of digits.

module Main where

    toDigitList :: Integer -> [Integer]

    toDigitList n
        | n > 9 = toDigitList(n `div` 10) ++ [n `mod` 10]
        | n <= 9 && n > 0 = [n]
        | n == 0 = [0]
        | otherwise = []

    main = do 

        print(toDigitList 2354)
        print(toDigitList 0)
        print(toDigitList $ -25)

    



