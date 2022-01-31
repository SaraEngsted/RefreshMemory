package Book;

public class Book {

    private int ISBN;
    private String title;
    private int yearOfPublishing;

    public Book(int ISBN, String title, int yearOfPublishing) {
        this.ISBN = ISBN;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;

    }

    public int getISBN() {

        return ISBN;
    }

    public int setISBN() {
        return ISBN;
    }

    public String getTitle() {

        return title;
    }

    public String setTitle() {

        return title;
    }

    public int getYearOfPublishing() {

        return yearOfPublishing;
    }

    public int setYearOfPublishing() {

        return yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
