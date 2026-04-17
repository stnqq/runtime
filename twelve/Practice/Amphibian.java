package twelve.Practice;

public abstract class Amphibian {
    protected String color;

    protected Amphibian(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public abstract void move();

    public void eat() {
        System.out.println("Кушаю насекомых");
    }
}
