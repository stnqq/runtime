package twelve.Practice;

public class Point {
    private final int x;
    private final int y;
    private String name;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String makeName() {
        return "(" + x + "," + y + ")";
    }

    public String getName() {
        return name;
    }
}