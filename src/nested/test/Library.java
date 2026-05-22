package nested.test;

public class Library {

    private Book[] books;
    private int bookCount;

    // 생성자: 저장할 책의 최대 개수를 받아 배열 초기화
    public Library(int size) {
        this.books = new Book[size];
        this.bookCount = 0;
    }

    // 책 추가 메서드
    public void addBook(String title, String author) {
        // 검증: 배열 용량을 초과하여 책을 추가하려고 할 때
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정적 중첩 클래스 객체를 생성하여 배열에 저장
        books[bookCount] = new Book(title, author);
        bookCount++;
    }

    // 저장된 모든 책 정보 출력 메서드
    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    // 요구사항: Library 내 클래스는 정적 중첩 클래스로 구현한다.
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}