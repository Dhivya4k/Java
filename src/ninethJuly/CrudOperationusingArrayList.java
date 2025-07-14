package ninethJuly;

import java.util.ArrayList;
import java.util.Scanner;

class User{
    String name;
    int age;
    String email;

    User(String name,int age, String email){
        this.name=name;
        this. age=age;
        this. email=email;

    }
    void display(){
        System.out.println("Name :"+name +", Age : "+age+", Email : "+email);
    }
}

public class  CrudOperationusingArrayList{
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        int choice=0;

        while(choice !=5){
            System.out.println("\n1.Create User Details\n2.Read User List \n3.Update User Details\n4.Delete User\n5.Exit");
            System.out.println("Enter your choice :");
            choice = ab.nextInt();
            ab.nextLine();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter User name :");
                    String name = ab.nextLine();

                    System.out.println("Enter User age :");
                    if (ab.hasNextInt()) {
                        int age = ab.nextInt();
                        ab.nextLine();

                        System.out.println("Enter User email :");
                        String email = ab.nextLine();
                        if (!email.contains("@gmail.com")) {
                            System.out.println("Invalid Email. Email must contain '@gmail.com'. User not added.");
                        }
                        boolean duplicate = false;
                        for (User u : users) {
                            if (u.email.equals(email)) {
                                duplicate = true;
                                break;
                            }
                        }

                        if (duplicate) {
                            System.out.println("Email already exists! Cannot add duplicate.");
                        } else {
                            users.add(new User(name, age, email));
                            System.out.println("User added successfully!");
                        }
                    }else {
                            System.out.println("Invalid input! Please enter a valid integer for age.");
                            ab.nextLine();
                        }

                }
                case 2 -> {
                    System.out.println("User Details list :");
                    for(int i=0; i<users.size();i++){
                        System.out.println((i+1)+".");
                        users.get(i).display();
                    }
                }

                case 3 -> {
                    System.out.print("Enter user number to update: ");
                    if (ab.hasNextInt()) {
                        int updateIndex = ab.nextInt() - 1;
                        ab.nextLine();
                    if(updateIndex >=0 && updateIndex<users.size()) {
                        System.out.println("Enter User name :");
                        String newName = ab.nextLine();

                        System.out.println("Enter user age :");
                        int newAge = ab.nextInt();
                        ab.nextLine();

                        System.out.println("Enter User Email :");
                        String newMail = ab.nextLine();
                        if (!newMail.contains("@gmail.com")) {
                            System.out.println("Invalid Email. Email must contain '@gmail.com'. User not added.");
                        }
                            users.set(updateIndex, new User(newName, newAge, newMail));
                            System.out.println("User Details successfully updated.");

                        }
                    } else {
                            System.out.println("Invalid input! Please enter a valid number.");
                            ab.nextLine();
                        }

                    }

                case 4 -> {
                     System.out.println("Enter User number to Delete:");
                    if (ab.hasNextInt()) {
                        int deleteIndex = ab.nextInt()-1;
                        ab.nextLine();



                        if(deleteIndex >=0 && deleteIndex<users.size()){
                            users.remove(deleteIndex);

                            System.out.println("User deleted");

                        }
                        else{
                            System.out.println("Invalid user Number");

                        }
                    } else {
                        System.out.println("Invalid input! Please enter a valid integer for age.");
                        ab.nextLine();

                    }
                    }

                case 5 ->
                    System.out.println("Exiting Program");


                default -> System.out.println("Invalid choice. Try again!");

            }
        }
    }
}



