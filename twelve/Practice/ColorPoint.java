package twelve.Practice;

public class ColorPoint extends Point {
private final String color;

public ColorPoint(int x, int y, String color) {
    super(x, y);
    this.color = color;
    setName(makeName());
}

@Override
protected String makeName(){
    return "координаты " + super.makeName() + ", цвет " + color;
}

}