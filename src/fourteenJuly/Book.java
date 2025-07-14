package fourteenJuly;
public class Book {
    private String name;
    private String author;
    private String edition;
    private int chapters;
    private int pages;
    private int quantity;

    public Book(String name, String author, String edition, int chapters, int pages, int quantity) {
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.chapters = chapters;
        this.pages = pages;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Name: " + name + ", Author: " + author + ", Edition: " + edition +
                ", Chapters: " + chapters + ", Pages: " + pages + ", Quantity: " + quantity);
    }
}
