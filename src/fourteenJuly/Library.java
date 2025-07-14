package fourteenJuly;
import java.util.ArrayList;
import java.util.Scanner;

public class Library  {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private Admin admin;
    private Scanner sc = new Scanner(System.in);

    public void adminSignup() {
        System.out.print("Create Admin Login ID: ");
        String id = sc.next();
        System.out.print("Create Admin Password: ");
        String pass = sc.next();
        admin = new Admin(id, pass);
        System.out.println("Admin registered.\n");
    }

    public boolean adminLogin() {
        System.out.print("Enter Admin Login ID: ");
        String id = sc.next();
        System.out.print("Enter Admin Password: ");
        String pass = sc.next();
        return admin != null && admin.loginID.equals(id) && admin.password.equals(pass);
    }

    public void studentSignup() {
        System.out.print("Enter Student Name: ");
        String name = sc.next();
        System.out.print("Enter Student Class: ");
        String cls = sc.next();
        System.out.print("Create Student Login ID: ");
        String id = sc.next();
        System.out.print("Create Student Password: ");
        String pass = sc.next();
        students.add(new Student(name, cls, id, pass));
        System.out.println("Student registered.\n");
    }

    public Student studentLogin() {
        System.out.print("Enter Student Login ID: ");
        String id = sc.next();
        System.out.print("Enter Student Password: ");
        String pass = sc.next();
        for (Student s : students) {
            if (s.loginID.equals(id) && s.password.equals(pass)) {
                return s;
            }
        }
        return null;
    }


    public void addBook() {
        System.out.print("Enter Book Name: ");
        String name = sc.next();
        System.out.print("Enter Author: ");
        String author = sc.next();
        System.out.print("Enter Edition: ");
        String edition = sc.next();
        System.out.print("Enter Chapters: ");
        int chapters = sc.nextInt();
        System.out.print("Enter Pages: ");
        int pages = sc.nextInt();
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        books.add(new Book(name, author, edition, chapters, pages, quantity));
        System.out.println("Book added successfully.\n");
    }


    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.\n");
        } else {
            for (Book b : books) {
                b.display();
            }
            System.out.println("the Book List:");
        }
    }


    public void searchBook() {
        System.out.print("Enter book name to search: ");
        String name = sc.next();
        boolean found = false;
        for (Book b : books) {
            if (b.getName().toLowerCase().contains(name.toLowerCase())) {
                b.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found.\n");
        }
    }


    public void updateBookQuantity() {
        System.out.print("Enter book name to update quantity: ");
        String name = sc.next();
        for (Book b : books) {
            if (b.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new quantity: ");
                b.setQuantity(sc.nextInt());
                System.out.println("Quantity updated.\n");
                return;
            }
        }
        System.out.println("Book not found.\n");
    }
}
