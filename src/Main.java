import ArrayListExercise.ArrayListExercise;
import Book.*;

import java.util.ArrayList;

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

    }
}
