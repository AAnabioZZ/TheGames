package Unit;

public class Shooters extends UnitBaes {

    int focus;
    int ammo;

    public Shooters(String name, Integer hp, Integer armor, Integer speed, int focus , int ammo) {
        super(name, hp, armor, speed);
        this.focus = focus;
        this.ammo = ammo;
    }

    void aim(){}; // целится
    void needFort(){}; // звать строить укрепление
    void needUpArms(){}; // звать принести снаряды
}
