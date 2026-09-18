
import java.util.*;

class Book {
    int id;
    String title;
    String author;
    double price;

    Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "ID: " + id +
               ", Title: " + title +
               ", Author: " + author +
               ", Price: " + price;
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        // 1. ArrayList to store book names
        ArrayList<String> bookNames = new ArrayList<>();

        bookNames.add("Java Programming");
        bookNames.add("Python Basics");
        bookNames.add("Data Structures");
        bookNames.add("Database Management");
        bookNames.add("Computer Networks");

        System.out.println("Book Names:");

        for (String name : bookNames) {
            System.out.println(name);
        }

        // 2. TreeSet to store book prices
        TreeSet<Double> prices = new TreeSet<>();

        prices.add(450.0);
        prices.add(300.0);
        prices.add(350.0);
        prices.add(250.0);
        prices.add(400.0);

        System.out.println("\nBook Prices (Ascending Order):");

        for (Double price : prices) {
            System.out.println(price);
        }

        // 3. HashMap to store Book ID and Book Name
        HashMap<Integer, String> bookMap = new HashMap<>();

        bookMap.put(101, "Java Programming");
        bookMap.put(102, "Python Basics");
        bookMap.put(103, "Data Structures");
        bookMap.put(104, "Database Management");
        bookMap.put(105, "Computer Networks");

        System.out.println("\nBook ID and Names:");

        for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
            System.out.println("ID: " + entry.getKey()
                    + ", Name: " + entry.getValue());
        }

        // 4. Store complete book records
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Programming",
                "James Gosling", 450.0));

        books.add(new Book(102, "Python Basics",
                "Guido van Rossum", 300.0));

        books.add(new Book(103, "Data Structures",
                "Mark Allen Weiss", 350.0));

        books.add(new Book(104, "Database Management",
                "Raghu Ramakrishnan", 250.0));

        books.add(new Book(105, "Computer Networks",
                "Andrew S. Tanenbaum", 400.0));

        // 5. Search book using title
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter book title to search: ");
        String searchTitle = sc.nextLine();

        boolean found = false;

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("\nBook Found:");
                System.out.println(book);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook not found.");
        }

        // 6. Display all book records
        System.out.println("\nAll Book Records:");

        for (Book book : books) {
            System.out.println(book);
        }

        sc.close();
    }
}