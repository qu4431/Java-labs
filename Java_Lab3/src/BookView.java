public class BookView {
    public void displayBookByAuthor(Book[] books, String author) {
        IO.println("Books by " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                IO.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")\nPublisher: " + book.getPublisher() + "\nPages: " + book.getPages() + "\nPrice: $" + book.getPrice() + "\n");
            }
        }
    }
    public void displayBookByPublisher(Book[] books, String publisher) {
        IO.println("Books by " + publisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                IO.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")\nPublisher: " + book.getPublisher() + "\nPages: " + book.getPages() + "\nPrice: $" + book.getPrice() + "\n");
            }
        }
    }
    public void displayBookByYear(Book[] books, int year) {
        IO.println("Books published after " + year + ":");
        for (Book book : books) {
            if (book.getYear() > year) {
                IO.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getYear() + ")\nPublisher: " + book.getPublisher() + "\nPages: " + book.getPages() + "\nPrice: $" + book.getPrice() + "\n");
            }
        }
    }
}
