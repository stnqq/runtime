package twelve.Animals;

public class Hamster extends Pet{
    protected Hamster() {
        super(4);
    }

    public void hideFood(){
        System.out.println("Все еда - в щёчках!");
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
        System.out.println("Я хомяк");
    }
}
