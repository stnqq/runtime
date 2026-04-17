package twelve.Task1;

public abstract class Duck {
    protected String name;

    protected Duck(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract void swim();

    public abstract void quack();
}
