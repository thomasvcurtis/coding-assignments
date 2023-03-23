--Author: Thomas Curtis
--Description: code to create an album which has the above three songs

module Main where

    type Song = ([Char], Double, [Char])

    song1 = ("another day", 290.2, "PC")
    song2 = ("leaving on a", 310.4, "JD")
    song3 = ("country roads", 297.3, "JD")

    type Album = [Song]
    testAlbum = [song1, song2, song3]

    main = do {

        print testAlbum
    }