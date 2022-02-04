package Kvadrat;

import java.util.Scanner;

public class Kvadrat {

    public void printASquare(int numbers, String sign) {

        for (int i = 1; i <= numbers ; i++) {
            for (int j = 1; j <= numbers ; j++) {
                System.out.println("" + sign + "");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Kvadrat kvadrat = new Kvadrat();
        Scanner scan = new Scanner(System.in);

        System.out.println("Giv us a number, any number will do; ");
        int userNumber = scan.nextInt();
        System.out.println("Giv us a sign; ");
        String sign = scan.next();

        System.out.println("Here are your square:");
        kvadrat.printASquare(userNumber,sign);

    }

}

