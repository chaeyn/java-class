package class1;

public class ClassEx3 {
    static class MovieReview3 {
        private String title;
        private String review;

        public MovieReview3(String title, String review) {
            this.title = title;
            this.review = review;
        }

        public String getTitle() {
            return title;
        }

        public String getReview() {
            return review;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setReview(String review) {
            this.review = review;
        }

        public void showMovieReview() {
            System.out.println("영화 제목: " + title + ", 리뷰: " + review);
        }
    }

    public static void main(String[] args) {
        MovieReview3 review1 = new MovieReview3("인셉션", "인생은 무한 루프");
        MovieReview3 review2 = new MovieReview3("어바웃 타임", "인생 시간 영화!");

        review1.showMovieReview();
        review2.showMovieReview();
    }
}