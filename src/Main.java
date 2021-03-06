import ArrayListExercise.ArrayListExercise;
import Book.*;
import Grass.Grass;
import Kvadrat.Kvadrat;
import ProperCase.ProperCase;
import Searching.Seearching;
import Sorting.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        System.out.println("---Arraylist Exercise---");

        ArrayListExercise newArrayList = new ArrayListExercise();
        ArrayList<String> listOfString = new ArrayList<String>();
        listOfString.add("Hello");
        System.out.println(newArrayList.doesArraylistContainString(listOfString, "Hej"));
        for (int i = 0; i < listOfString.size(); i++) {
            System.out.println(listOfString.get(i));
        }


        System.out.println("---Book Exercise---");

        Biblioteket b = new Biblioteket();
        Book testBook = new Book(1234567, "Kvinde", 2020);
        System.out.println(b.doesBibliotekHaveBook(testBook));


        System.out.println("---Grass Exercise---");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How long is your current grass");
        double currentGrassHeight = scanner.nextDouble();

        System.out.println("How long must your grass be?");
        double grassMaxHeight = scanner.nextDouble();

        Grass grass = new Grass();
        double daysUntilCutting = (grass.cutGrassIfMaxIs(currentGrassHeight, grassMaxHeight));

        System.out.println("Days until cutting " + daysUntilCutting);
        //der er noget fejl i koden, hvor den ikke vil retunere de dage der er til græsset skal slåes.
        //Vi har taget lidt inspiration fra Elisa for at se om det ville virke



        System.out.println("---Kvadrat Exercise---");
        //Inspireret af Laura

        Kvadrat kvadrat = new Kvadrat();
        Scanner scan = new Scanner(System.in);

        System.out.println("Giv us a number, any number will do; ");
        int userNumber = scan.nextInt();
        System.out.println("Giv us a sign; ");
        String userSign = scan.next();

        System.out.println("Here are your square:");
        kvadrat.printASquare(userNumber,userSign);


        System.out.println("---Proper Case Exercise---");

        ProperCase properCase = new ProperCase();
        System.out.println(properCase.sentence("HEJ jeg er DEN BedsTe"));


        System.out.println("---Sorting Exercise---");

        Sorting sorting = new Sorting();
        sorting.sortingStrings();


        System.out.println("---Searching Exercise---");

        Seearching searching = new Seearching();

        String Array[] = {"Elisa", "Søs", "Mo", "Laura", "Sara"};
        String chooseWord = "Erik";

        System.out.println(searching.StringIndex(Array, chooseWord));



        int notFound = searching.StringIndex(Array, chooseWord);
        System.out.println(notFound);

    }
}
