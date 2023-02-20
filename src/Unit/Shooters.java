package Unit;

public class Shooters extends UnitBaes {

    int focus;
    int ammo;

    public Shooters(Integer atak, Integer defens,
                    String name, Integer hp,
                    Integer speed, Integer damagMax, Integer damagMin,
                    int focus, int ammo) {
        super(atak, defens, name, hp, speed, damagMax, damagMin);
        this.focus = focus;
        this.ammo = ammo;
    }


    void aim(){}; // целится
    void needFort(){}; // звать строить укрепление
    void needUpArms(){}; // звать принести снаряды
}
