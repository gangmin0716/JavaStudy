package class1;

class MovieReview2 {
    String title;
    String review;

    public void info() {
        System.out.println("영화 제목: " + title + ", 리뷰: " + review);
    }
}

public class ClassEx2 {
    public static void main(String[] args) {

        MovieReview2[] movies = new MovieReview2[2];

        movies[0] = new MovieReview2();
        movies[0].title = "인셉션";
        movies[0].review = "인생은 무한 루프";

        movies[1] = new MovieReview2();
        movies[1].title = "어바웃 타임";
        movies[1].review = "인생 시간 영화!";

        for (int i = 0; i < movies.length; i++) {
            movies[i].info();
        }
    }
}