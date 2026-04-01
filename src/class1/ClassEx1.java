package class1;

class MovieReview1 {
    String title;
    String review;
    private int member;

    public void info() {
        System.out.println("영화제목: " + title + ", 리뷰: " + review);
    }
}

public class ClassEx1 {
    public static void main(String[] args) {
        MovieReview1 M1 = new MovieReview1();
        M1.title = "인셉션";
        M1.review = "인생은 무한 루프";
        M1.info();
        MovieReview1 M2 = new MovieReview1();
        M2.title = "어바웃 타임";
        M2.review = "인생 시간 영화";
        M2.info();
    }
}
