package class1;

class MovieReview3 {
    private String title;
    private String review;
    private int member;

    public MovieReview3(String title, String review, int member) {
        this.title = title;
        this.review = review;
        this.member = member;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public void info() {
        System.out.println("영화제목: " + title + ", 리뷰: " + review);
    }
}

public class ClassEx3 {
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
