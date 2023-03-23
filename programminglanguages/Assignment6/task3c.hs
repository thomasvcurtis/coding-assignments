--Author: Thomas Curtis
--Description: a function named contains which takes two parameters: a song s and an album x
--  The function returns a boolean depending on whether album x contains song s.

module Main where

    type Song = ([Char], Double, [Char])
    type Album = [Song]

    song1 = ("another day", 290.2, "PC")
    song2 = ("leaving on a", 310.4, "JD")
    song3 = ("country roads", 297.3, "JD")

    testAlbum = [song1, song2, song3]

    contains :: Album -> Song -> Bool 
    contains list song_search
        | length list == 0 = False
        | head list == song_search = True
        | head list /= song_search = contains (tail list) song_search
        | otherwise = False

    main = do {

        print(contains testAlbum song1)

    }