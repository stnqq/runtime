package twelve.Animals;

public class Spider extends Pet {
    protected Spider(){
        super(8);
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

