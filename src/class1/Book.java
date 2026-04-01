package class1;

public class Book {
    String title;
    String author;
    int price;

    //생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //메서드
    public void info() {
        System.out.println(title + " - " + author + " / 가격: " + price + "원");
    }
}
