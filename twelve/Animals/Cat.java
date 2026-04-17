package twelve.Animals;

public class Cat extends Pet {
    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    protected Cat(){
        super(4);
    }

    @Override
    public void sleep() {
        System.out.println("Сплю");
    }

    @Override
    public void play() {
        System.out.println("Играю");
    }

    @Override
    public void giveVoice() {
        System.out.println("Я собачка");
    }
}
