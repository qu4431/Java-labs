import java.util.Comparator;

public class BookComparator {
    public static class sortByPublisher implements Comparator<Book> {
        @Override
        public int compare(Book b1, Book b2) {
            return b1.getPublisher().compareTo(b2.getPublisher());
        }
    }
}
