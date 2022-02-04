import ArrayListExercise.ArrayListExercise;
import Book.*;
import Grass.Grass;
import Kvadrat.Kvadrat;

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
        Book testBook = new Book(1234567,"Kvinde",2020);
        System.out.println(b.doesBibliotekHaveBook(testBook));


        /*System.out.println("---Grass Exercise---");
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

         */

        System.out.println("---Kvadrat Exercise---");





    }
}
