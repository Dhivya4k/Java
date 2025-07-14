package fourteenJuly;

// OOP: Inheritance (Student extends User), Encapsulation
public class Student extends User {
    private String name;
    private String className;

    public Student(String name, String className, String loginID, String password) {
        super(loginID, password);
        this.name = name;
        this.className = className;
    }

}
