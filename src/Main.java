import Book.*;

public class Main {

    public static void main(String[] args) {

        Biblioteket b = new Biblioteket();
        Book testBook = new Book(1234567,"Kvinde",2020);
        System.out.println(b.doesBibliotekHaveBook(testBook));

    }
}
