package Sorting;

public class Sorting {

    public void sortingStrings(){

        int numberOfWords = 5;//Setting our limit to 5 words

        String words[] = {"spegepølse","avocado","timian", "radiser", "jalapeons"};//Making an array of words
        String temp; //Making a temporary string

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {

                if (words[i].compareTo(words[j]) > 0) {//comparing one string to another string
                    temp = words[i]; //swapping first for loop to the temporary string
                    words[i] = words[j]; //swapping second for loop to the first for loop
                    words[j] = temp; //changing the first for loop, back to the second for loop
                }
            }
        }
        for (int i = 0; i < numberOfWords; i++) {//goes through the limit of words
            System.out.println("In alphabetical order: " + words[i]); //print out the arrays in ascending order

        }
    }
}
