void main() {
    Book[] books = new Book[]{
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925, 218, new BigDecimal("10.99")),
            new Book("To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, 278, new BigDecimal("12.99")),
            new Book("1984", "George Orwell", "Secker & Warburg", 1948, 328, new BigDecimal("11.99")),
            new Book("Pride and Prejudice", "Jane Austen", "T. Egerton", 1813, 426, new BigDecimal("9.99")),
            new Book("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", 1951, 270, new BigDecimal("13.99")),
            new Book("The Hobbit", "J.R.R. Tolkien", "George Allen & Unwin", 1937, 310, new BigDecimal("14.99")),
            new Book("Moby-Dick", "Herman Melville", "Harper & Brothers", 1851, 544, new BigDecimal("15.99")),
            new Book("War and Peace", "Leo Tolstoy", "The Russian Messenger", 1869, 1225, new BigDecimal("16.99")),
            new Book("The Odyssey", "Homer", "Ancient Greece", -800, 541, new BigDecimal("17.99")),
            new Book("The Divine Comedy", "Dante Alighieri", "Italy", 1320, 906, new BigDecimal("18.99"))
    };
    boolean run = true;
    BookView view = new BookView();
    BookController controller = new BookController(view, books);

    while(run) {
        IO.println("Choose an option:\n1. Display books by author\n2. Display books by publisher\n3. Display books published after a certain year\n4. Sort books by publisher\n5. Display all books\n6. Exit");
        int choice = Integer.parseInt(IO.readln());
        switch (choice) {
            case 1:
                IO.println("Enter author name:");
                String author = IO.readln();
                controller.displayBooksByAuthor(author);
                break;
            case 2:
                IO.println("Enter publisher name:");
                String publisher = IO.readln();
                controller.displayBooksByPublisher(publisher);
                break;
            case 3:
                IO.println("Enter year:");
                int year = Integer.parseInt(IO.readln());
                controller.displayBooksByYear(year);
                break;
            case 4:
                controller.sortBooksByPublisher();
                IO.println("Books sorted by publisher.");
                break;
            case 5:
                IO.println("All books:");
                controller.displayAllBooks();
                break;
            case 6:
                run = false;
                break;
            default:
                IO.println("Invalid choice. Please try again.");
        }
    }
}
