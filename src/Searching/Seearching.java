package Searching;

import java.lang.reflect.Array;

public class Seearching {

    public int StringIndex (String[] string, String str2) {

        for (int i = 0; i < string.length; i++) {
            if (string[i].equalsIgnoreCase(str2)) {//Sammenligner ordene i arraylisten
                int indexOfString = i;//Står for indextallet af ordene i arraylisten
                return indexOfString; //Retunere indexet af ordet i Arraylisten
            }

        } return -1;

    }

}
