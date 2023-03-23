--Author: Thomas Curtis
--Description: Define a data type named Song

module Main where

    type Song = ([Char], Double, [Char])

    song1 = ("another day", 290.2, "PC")
    song2 = ("leaving on a", 310.4, "JD")
    song3 = ("country roads", 297.3, "JD")

    main = do

        print song1
        print song2
        print song3

    