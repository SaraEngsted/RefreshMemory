package Book;

import java.util.ArrayList;

public class Biblioteket {
    ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public Biblioteket(){
        Book bookOne = new Book(1234567, "Kvinde", 2020);
        Book bookTwo = new Book(1234576, "Mandens Verden", 2018);
        Book bookThree = new Book(1234756,"Alle sammen samlet", 2022);

        listOfBooks.add(bookOne);
        listOfBooks.add(bookTwo);
        listOfBooks.add(bookThree);
    }


    public boolean doesBibliotekHaveBook (Book book) {
        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getISBN() == book.getISBN()) {
                return true;
            }
        }
        return false;
    }

}
