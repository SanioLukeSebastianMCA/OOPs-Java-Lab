import java.util.Arrays;
import java.util.Scanner;

class Publisher {
    int publisher_id;
    String publisher_name;

    Publisher(int publisher_id, String publisher_name) {
        this.publisher_id = publisher_id;
        this.publisher_name = publisher_name;
    }
}

class Book extends Publisher {

    int book_id;
    String book_name;

    Book(int publisher_id, String publisher_name, int book_id, String book_name) {
        super(publisher_id, publisher_name);
        this.book_id = book_id;
        this.book_name = book_name;
    }
}

class Literature extends Book {

    int literature_id;
    String literature_theme;

    Literature(int publisher_id, String publisher_name, int book_id, String book_name, int literature_id,
            String literature_theme) {
        super(publisher_id, publisher_name, book_id, book_name);
        this.literature_id = literature_id;
        this.literature_theme = literature_theme;
    }

    void displayDetails() {
        System.out.println("\n\nLiterature book details - ");
        System.out.println("\nThe publisher ID of the book is: " + this.publisher_id);
        System.out.println("The publisher name of the book is: " + this.publisher_name);
        System.out.println("The Book ID of the book is: " + this.book_id);
        System.out.println("The Book name of the book is: " + this.book_name);
        System.out.println("The Literature ID of the book is: " + this.literature_id);
        System.out.println("The Literature theme of the book is: " + this.literature_theme);
    }

}

class Fiction extends Book {

    int fiction_id;
    String fiction_theme;

    Fiction(int publisher_id, String publisher_name, int book_id, String book_name, int fiction_id,
            String fiction_theme) {
        super(publisher_id, publisher_name, book_id, book_name);
        this.fiction_id = fiction_id;
        this.fiction_theme = fiction_theme;
    }

    void displayDetails() {
        System.out.println("\n\nFiction book details - ");
        System.out.println("\nThe publisher ID of the book is: " + this.publisher_id);
        System.out.println("The publisher name of the book is: " + this.publisher_name);
        System.out.println("The Book ID of the book is: " + this.book_id);
        System.out.println("The Book name of the book is: " + this.book_name);
        System.out.println("The Fiction ID of the book is: " + this.fiction_id);
        System.out.println("The Fiction theme of the book is: " + this.fiction_theme);
    }
}

public class ques04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, type;
        int publisher_id, book_id, literature_id, fiction_id;
        String publisher_name, book_name, literature_theme, fiction_theme;
        System.out.print("\nEnter the number of book items : ");
        n = sc.nextInt();

        Literature[] lit = new Literature[0];
        Fiction[] fit = new Fiction[0];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter the Publisher ID : ");
            publisher_id = sc.nextInt();

            System.out.print("Enter the Publisher Name : ");
            publisher_name = sc.next();

            System.out.print("Enter the Book ID : ");
            book_id = sc.nextInt();

            System.out.print("Enter the Book Name : ");
            book_name = sc.next();

            System.out.print("BOOK TYPE? 1. Literature 2. Fiction : ");
            type = sc.nextInt();

            if (type == 1) {
                int item_no= lit.length;
                lit= Arrays.copyOf(lit, lit.length + 1);
                System.out.print("Enter the Literature ID : ");
                literature_id = sc.nextInt();

                System.out.print("Enter the Literature Name : ");
                literature_theme = sc.next();

                lit[item_no] = new Literature(publisher_id, publisher_name, book_id, book_name, literature_id, literature_theme);

            } else {
                int item_no= fit.length;
                fit= Arrays.copyOf(fit, fit.length + 1);
                System.out.print("Enter the Fiction ID : ");
                fiction_id = sc.nextInt();
                System.out.print("Enter the Fiction Name : ");
                fiction_theme = sc.next();
                fit[item_no] = new Fiction(publisher_id, publisher_name, book_id, book_name, fiction_id, fiction_theme);
            }
        }

        if (lit.length > 0) {
            for (int i = 0; i < lit.length; i++) {
                lit[i].displayDetails();
            }
        }
        if (fit.length > 0) {
            for (int i = 0; i < fit.length; i++) {
                fit[i].displayDetails();
            }
        }
        sc.close();
    }
}