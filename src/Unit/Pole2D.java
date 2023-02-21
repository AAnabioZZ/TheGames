package Unit;

public class Pole2D {
    int x;
    int y;

    public Pole2D(int x, int y) {
        this.x = x;
        this.y = y;

    }
public String getPosishen(){
        return this.toString();
}
    @Override
    public String toString() {
        return String.format("x = "+x+"y = "+y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
