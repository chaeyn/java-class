package access.ex;

public class Movie extends ItemEx {
    public String director;
    public String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:" + this.director + ", 배우: " + this.actor);
    }
}
