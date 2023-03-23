--Author: Thomas Curtis
--Description: a function named higherCard which takes two Cards and returns the higher value
-- Card. If there is a tie, then either Card can be returned

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

    higherCard :: Card -> Card -> Card
    higherCard card0 card1
        | cardValue card0 > cardValue card1 = card0
        | cardValue card0 < cardValue card1 = card1
        | otherwise = card0
        
    main = do {

        print(higherCard (Jack, Hearts) (Jack, Spades))

}