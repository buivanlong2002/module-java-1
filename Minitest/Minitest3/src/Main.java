import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new ProgrammingBook("PB001", "Learn Java", 550000, "James Gosling", "Java", "Spring");
        books[1] = new ProgrammingBook("PB002", "Python Mastery", 480000, "Guido van Rossum", "Python", "Django");
        books[2] = new ProgrammingBook("PB003", "JavaScript Essentials", 500000, "Brendan Eich", "JavaScript", "React");

        books[3] = new FictionBook("FB001", "1984", 300000, "George Orwell", "Dystopian");
        books[4] = new FictionBook("FB002", "The Hobbit", 350000, "J.R.R. Tolkien", "Fantasy");
        books[5] = new FictionBook("FB003", "The Alchemist", 320000, "Paulo Coelho", "Philosophical");

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Menu Book ---");
            System.out.println("1. Show all books");
            System.out.println("2. Total price of all books");
            System.out.println("2. Find programming books by language");
            System.out.println("4. Find fiction books by category");
            System.out.println("5. Find fiction books by price");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    displayAllBooks(books);
                    break;
                case 2:
                    totalPriceAllBook(books);
                    break;
                case 3:
                    searchProgramningBookByLanguage(books, sc);
                    break;
                case 4:
                    searchFictionBookByCategory(books, sc);
                    break;
                case 5:
                    searchFictionBookByPrice(books, sc);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
        sc.close();
    }
    public static void displayAllBooks(Book[] books) {
        System.out.println("Show all books: ");
        for (Book book : books) {
            book.display();
        }
    }
    public static void totalPriceAllBook(Book[] books) {
        double sumPrice = 0;
        for (Book book : books) {
            sumPrice += book.getPrice();
        }
        System.out.println("Total price of all books is: " + sumPrice);
    }
    public static void searchProgramningBookByLanguage(Book[] books, Scanner sc) {
        System.out.println("Enter programming language: ");
        String language = sc.nextLine();
        int countLanguage = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook && ((ProgrammingBook) book).getLanguage().equals(language)) {
                countLanguage++;
                book.display();
            }
        }
        if (countLanguage == 0) {
            System.out.println("No programming books with language " + language + " found!");
        } else {
            System.out.println("Number of programming books with language " + language + " is: " + countLanguage);
        }
    }
    public static void searchFictionBookByCategory(Book[] books, Scanner sc) {
        System.out.println("Enter category: ");
        String category = sc.nextLine();
        int countCategory = 0;
        for (Book book : books) {
            if (book instanceof FictionBook && ((FictionBook) book).getCategory().equals(category)) {
                countCategory++;
                book.display();
            }
        }
        if (countCategory == 0) {
            System.out.println("No fiction books with Category " + category + " found!");
        } else {
            System.out.println("Number of fiction books with Category " + category + " is: " + countCategory);
        }
    }
    public static void searchFictionBookByPrice(Book[] books, Scanner sc) {
        System.out.println("Enter the maximum price for a book: ");
        double maxPrice = sc.nextDouble();
        int countBookMaxPrice = 0;
        for (Book book : books) {
            if (book instanceof FictionBook && book.getPrice() < maxPrice) {
                countBookMaxPrice++;
                book.display();
            }
        }
        if (countBookMaxPrice == 0) {
            System.out.println("There is no book that matches this price!");
        } else {
            System.out.println("The number of books priced lower than the price you offered is: " + countBookMaxPrice);
        }
    }
}