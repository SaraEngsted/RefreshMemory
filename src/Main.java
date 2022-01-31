import Book.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("---Arraylist Exercise---");




        System.out.println("---Book Exercise---");

        Biblioteket b = new Biblioteket();
        Book testBook = new Book(1234567,"Kvinde",2020);
        System.out.println(b.doesBibliotekHaveBook(testBook));

    }
}
