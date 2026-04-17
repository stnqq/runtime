package twelve.Animals;

public abstract class Pet {
    protected int pawsCount;

    protected Pet(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играемся!");
    }

    public abstract void giveVoice();
}
