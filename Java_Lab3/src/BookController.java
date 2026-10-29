import java.util.Arrays;

public class BookController {
    private BookView view;
    private Book[] books;

    public BookController(BookView view, Book[] books) {
        this.view = view;
        this.books = books;
    }

    public void displayBooksByAuthor(String author) {
        view.displayBookByAuthor(books, author);
    }

    public void displayBooksByPublisher(String publisher) {
        view.displayBookByPublisher(books, publisher);
    }

    public void displayBooksByYear(int year) {
        view.displayBookByYear(books, year);
    }

    public void sortBooksByPublisher() {
        Arrays.sort(books, new BookComparator.sortByPublisher());
    }

    public void displayAllBooks() {
        for (Book book : books) {
            IO.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")\nPublisher: " + book.getPublisher() + "\nPages: " + book.getPages() + "\nPrice: $" + book.getPrice() + "\n");
        }
    }
}
