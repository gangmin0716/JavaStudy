package class2;

public class ClassElementEx3 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();
        Book book2 = new Book("Hello Java", "seo");
        book2.displayInfo();
        Book book3 = new Book("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        this("", "", 0);
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + pages);
    }
}
