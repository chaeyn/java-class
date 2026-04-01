package class1;

public class ClassEx2 {
    static class MovieReview2 {
        String title;
        String review;

        public MovieReview2(String title, String review) {
            this.title = title;
            this.review = review;
        }

        public void info() {
            System.out.println("영화 제목: " + title + ", 리뷰: " + review);
        }
    }

    public static void main(String[] args) {
        MovieReview2[] reviews = new MovieReview2[2];

        reviews[0] = new MovieReview2("인셉션", "인생은 무한 루프");
        reviews[1] = new MovieReview2("어바웃 타임", "인생 시간 영화!");

        for (int i = 0; i < reviews.length; i++) {
            reviews[i].info();
        }
    }
}