package class1;

public class ClassEx1 {
    static class MovieReview1 {
        String title;
        String review;

        public MovieReview1(String title, String review) {
            this.title = title;
            this.review = review;
        }

        public void info() {
            System.out.println("영화 제목: " + title + ", 리뷰: " + review);
        }
    }

    public static void main(String[] args) {
        MovieReview1 review1 = new MovieReview1("인셉션", "인생은 무한 루프");
        MovieReview1 review2 = new MovieReview1("어바웃 타임", "인생 시간 영화!");

        review1.info();
        review2.info();
    }
}