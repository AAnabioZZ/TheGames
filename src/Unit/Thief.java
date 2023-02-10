package Unit;

public class Thief extends Infantry{

    public Thief(String name, Integer hp, Integer armor, Integer speed, int stamina) {
        super(name, hp, armor, speed, stamina);
    }

    void steal(){};
}
