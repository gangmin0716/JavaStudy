package class1;

public class BookMain {
    public static void main(String[] args) {
        Book b = new Book("흰", "한강", 15000);
        System.out.println("도서명: " +b.title+", 작가: " +b.author+", 가격:" +b.price+"원");
    }
}
