package tenthJuly;
import java.util.ArrayList;
import java.util.Scanner;
public class UserManager {
    ArrayList<User> users = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

void createuser() {
    System.out.println("Enter user name:");
    String name = sc.nextLine();

    System.out.println("Enter user age :");
    if (!sc.hasNextInt()) {
        System.out.println("Invalid input, Please enter a number!");
        sc.nextLine();
    }
    int age = sc.nextInt();
    sc.nextLine();
        System.out.println("Enter user email:");
        String email = sc.nextLine();
        if (email.contains("@gmail.com")) {
            System.out.println("Vaild Email!");}
        else{
                System.out.println("Invalid Email, Email must contain '@gmail.com'");
                sc.nextLine();
            }
            boolean duplicate = false;
            for (User u : users) {
                if (email.equals(email)) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate) {
                System.out.println("Email already exit, Please Use Another Email");
            }

        users.add(new User(name,age,email));
    }
 void readuser(){
    if(users.isEmpty()) {
        System.out.println("User list is Empty");
    }
    System.out.println("Enter user details list");
    for(int i=0; i<users.size();i++){
        System.out.println((i+1)+".");
        users.get(i).display();
    }
}
 void updateuser(){
    if(users.isEmpty()) {
        System.out.println("User list is Empty");
        return;
    }
    readuser();
    System.out.println("Enter user number to Update");
    if (!sc.hasNextInt()) {
        System.out.println("Invalid input. Update cancelled.");
        sc.nextLine();

    }
    int updateIndex = sc.nextInt() - 1;
    sc.nextLine();
    if(updateIndex>=0 && updateIndex<users.size()){
        System.out.println("Enter user name:");
        String newName = sc.nextLine();

        System.out.println("Enter user age :");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input, Please enter a number!");
            sc.nextLine();
        }
        int newAge = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter user email:");
        String newMail = sc.nextLine();
        if (newMail.contains("@gmail.com")) {
            System.out.println("Vaild Email!");
        } else {
            System.out.println("Invalid Email, Email must contain '@gmail.com'");
            sc.nextLine();
        }
        boolean duplicate = false;
        for (User u : users) {
            if (newMail.equals(newMail)) {
                duplicate = true;
                break;
            }
        }
        if (duplicate) {
            System.out.println("Email already exit, Please Use Another Email");
        }
        users.set(updateIndex,new User(newName,newAge,newMail));
    }

    }
 void deleteuser(){
    if(users.isEmpty()) {
        System.out.println("User list is Empty");
        return;
    }
    readuser();
    System.out.println("Enter User number to Delete:");
    if (sc.hasNextInt()) {
        int deleteIndex = sc.nextInt()-1;
        sc.nextLine();
        if(deleteIndex >=0 && deleteIndex<users.size()){
            users.remove(deleteIndex);
            System.out.println("User deleted");
        }
        else{
            System.out.println("Invalid user Number");
        }
    } else {
        System.out.println("Invalid input! Please enter a valid integer for age.");
        sc.nextLine();

    }
}
}





