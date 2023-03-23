--Author: Thomas Curtis
--Description: Write a function named productValue which takes a Hand and returns the product of all
--  values of cards in that Hand.

module Main where

    data Suit = Spades | Hearts deriving (Show)
    data Rank = Ten | Jack | Queen | King | Ace deriving (Show) 
    type Card = (Rank, Suit)
    type Hand = [Card] 

    value :: Rank -> Integer 
    value Ten = 1
    value Jack = 2
    value Queen = 3 
    value King = 4 
    value Ace = 5
 
    cardValue :: Card -> Integer 
    cardValue (rank, suit) = value rank 

    productValue :: Hand -> Integer
    productValue list = foldl (*) 1 [cardValue card | card <- list]

    higherCard :: Hand -> Hand -> Hand
    higherCard card0 card1
        | productValue card0 > productValue card1 = card0
        | productValue card0 < productValue card1 = card1
        | otherwise = card0

    main = do {

        print(higherCard[(Ten, Spades), (Jack, Hearts), (Queen, Spades)] [(King, Hearts), (Ace, Spades), (Queen, Spades)])

}


