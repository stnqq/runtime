package twelve.Animals;

public class Dog extends Pet{
    public void bringStick(){
        System.out.println("Принес палочку, хороший мальчик");
    }

    protected Dog(){
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Я собачка. Гав-гав!");
    }
}
