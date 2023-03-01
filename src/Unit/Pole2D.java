package Unit;

public class Pole2D {
    int x;
    int y;
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Pole2D(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public String getPosmini(){
    return String.format("x:"+x+"y:"+y);
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
