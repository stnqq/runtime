package twelve.Practice;

public class Toad extends Amphibian {
    @Override
    public void move() {
        System.out.println("Я важно хожу");
    }

    protected Toad() {
        super("коричневая");
    }

    @Override
    public String getColor() {
        return color;
    }
}
