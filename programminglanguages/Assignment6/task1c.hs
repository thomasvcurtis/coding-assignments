--Author: Thomas Curtis
--a Haskell function shrtStrCount which takes a list of strings as input, and counts how
--  many strings have length less than 4, and returns the count.

module Main where

    check :: [Char] -> Bool 
    check str = length str < 4

    shrtStrCount :: [[Char]] -> Int
    shrtStrCount list = length (filter check list)

    main = do {

    print(shrtStrCount(["abcd", "de","fghtestwsd"]))

}