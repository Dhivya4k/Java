package tenthJuly;
import java.util.Scanner;
public class CrudOperationusingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserManager userManager = new UserManager();
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n1. Create User\n2. Read Users\n3. Update User\n4. Delete User\n5. Exit");
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        userManager.createuser();
                        break;
                    case 2:
                        userManager.readuser();
                        break;
                    case 3:
                        userManager.updateuser();
                        break;
                    case 4:
                        userManager.deleteuser();
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
        sc.close();
    }
}


