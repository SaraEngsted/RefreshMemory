package Kvadrat;

import java.util.Scanner;

public class Kvadrat {

    public void printASquare(int numbers, String sign) {

        for (int i = 1; i <= numbers ; i++) {//Rows
            for (int j = 1; j <= numbers ; j++) {//Columns
                System.out.print(" " + sign + " ");//Print side-by-side
            }
            System.out.println();//Print a new, empty, line
        }
    }
}

