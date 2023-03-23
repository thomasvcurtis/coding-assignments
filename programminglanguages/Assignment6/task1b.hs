--Author: Thomas Curtis
--Description: Write a Haskell function charCount which takes a string word as input, and counts how many
--letters (say c1) in word are vowels and how many letters (say c2) in word are consonants, and returns two
--counts (c1, c2) as a single tuple.
module Main where

    vowel :: Char -> Bool 
    vowel char = char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' || char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U'

    charCount :: [Char] -> (Int, Int)
    charCount string = (length (filter vowel string), length string - length (filter vowel string))  
        

    main = do {


        print(charCount("AbCdGie"))


    }