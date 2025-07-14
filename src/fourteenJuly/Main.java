package fourteenJuly;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);



        System.out.println(" Library Management System");

        while (true) {
            System.out.println("\n1. Admin Login/Signup\n2. Student Login/Signup\n3. Exit");
            System.out.println("Enter your Choice :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Login\n2. Signup");
                    int adminChoice = sc.nextInt();
                    if (adminChoice == 1) {
                        if (lib.adminLogin()) {
                            System.out.println("Admin logged in.");
                            adminMenu(lib, sc);

                        } else {
                            System.out.println("Invalid Admin details.\n");
                        }
                    } else {
                        lib.adminSignup();
                    }
                    break;
                case 2:
                    System.out.println("1. Login\n2. Signup");
                    int studentChoice = sc.nextInt();
                    if (studentChoice == 1) {
                        Student s = lib.studentLogin();
                        if (s != null) {
                            System.out.println("Student logged in.");
                             // Polymorphism demonstration
                            studentMenu(lib, sc);
                        } else {
                            System.out.println("Invalid Student detials.\n");
                        }
                    } else {
                        lib.studentSignup();
                    }
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    return;
            }
        }
    }

    static void adminMenu(Library lib, Scanner sc) {
        while (true) {
            System.out.println("\nAdmin Menu:\n 1.Add Book\n 2.Show All Books\n 3.Search Book\n 4.Update Book Quantity\n 5.Logout");
            System.out.println("Enter your Choice :");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    lib.addBook();
                    break;
                case 2:
                    lib.showAllBooks();
                    break;
                case 3:
                    lib.searchBook();
                    break;
                case 4:
                    lib.updateBookQuantity();
                    break;
                case 5:
                    return;
            }
        }
    }

    static void studentMenu(Library lib, Scanner sc) {
        while (true) {
            System.out.println("\nStudent Menu:\n 1.Show All Books\n 2.Search Book\n 3.Logout");
            System.out.println("Enter your Choice :");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    lib.showAllBooks();
                    break;
                case 2:
                    lib.searchBook();
                    break;
                case 3:
                    return;
            }
        }
    }
}
