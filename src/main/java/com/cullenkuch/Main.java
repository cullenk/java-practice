package com.cullenkuch;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //create new movie array list object
        MoviesArrayList myMovieList = new MoviesArrayList();

        //Call the add movie method to add movies to our array object
        myMovieList.addMovieToArray("The Avengers");
        myMovieList.addMovieToArray("Wall-E");
        myMovieList.addMovieToArray("The Ring");
        myMovieList.addMovieToArray("Gone Girl");
        myMovieList.addMovieToArray("Twister");
        myMovieList.addMovieToArray("Interstellar");

        //Call the check for movie method to check for a certain movie, Twister, within our array. Print whether true or false.
        System.out.println("Does the movie appear in this array?: " + myMovieList.checkForMovie("Big fish"));

        //Create new array of movie Strings to compare to the first one
        String[] arrayToCompare = new String[8];
        arrayToCompare[0] = ("The Avengers");
        arrayToCompare[1] = ("Wall-E");
        arrayToCompare[2] = ("The Ring");
        arrayToCompare[3] = ("Gone Girl");
        arrayToCompare[4] = ("Finding Nemo");
        arrayToCompare[5] = ("Interstellar");
        arrayToCompare[6] = null;
        arrayToCompare[7] = null;

        //Call the compare method to see if the new array is identical to our original one
        System.out.println("Are these two arrays equal?: " + myMovieList.compareTwoArrays(arrayToCompare));

        //Call the set movie index method to add a new movie to the index you want
        myMovieList.setMovieIndex("Alien", 2);

    }
}
