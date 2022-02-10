package com.cullenkuch;

import java.util.Arrays;

public class MoviesArrayList {
        int currentLength = 0;
        //constructor to create movieArrayList object
        String[] movieArrayList = new String[1];
        public MoviesArrayList(){
            //any parameter would live here
        }

//     The Get method that returns a movie at a given index
        public String getMovieAtIndex(int n) {
            return movieArrayList[n];
        }

        // The Add method to add a movie to the array
        public void addMovieToArray(String movie){
            if(currentLength + 1 > movieArrayList.length){
                String[] biggerArray = new String[currentLength*2];
                //Get the previous movies from the old array and recreate the new larger array with those too
                for(int i = 0; i < movieArrayList.length; i++){
                    biggerArray[i] = movieArrayList[i];
                }
                movieArrayList = biggerArray;
                movieArrayList[currentLength] = movie;
                currentLength++;
            } else {
                movieArrayList[currentLength] = movie;
                currentLength++;
            }
            System.out.println("Movie Array: " + Arrays.toString(movieArrayList));
        }

        //A method that can return a boolean determining if your array list contains a certain item
        public boolean checkForMovie(String movie) {
            for (int i = 0; i < movieArrayList.length; i++) {
                if (movieArrayList[i] == movie) {
                    return true;
                }
            }
            return false;
        }

        //A method that can determine if your arraylist is identical to another one
        public boolean compareTwoArrays(String[] arr){
            if(Arrays.equals(movieArrayList, arr)){
                return true;
            }
            return false;
        }

        //A method to set a given index to a particular value
        public void setMovieIndex(String movie, int index){
            for (int i = 0; i < movieArrayList.length; i++){
                movieArrayList[index] = movie;
            }
            System.out.println("Updated Movie Array: " + Arrays.toString(movieArrayList));
        }




}
