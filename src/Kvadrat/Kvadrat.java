package Kvadrat;

import java.util.Scanner;

public class Kvadrat {

    public void printASquare(int numbers, String sign) {

        for (int i = 1; i <= numbers ; i++) {
            for (int j = 1; j <= numbers ; j++) {
                System.out.print(" " + sign + " ");
            }
            System.out.println();
        }
    }
}

