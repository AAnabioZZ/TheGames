package Unit;

public abstract class Shooters extends UnitBaes {

    int focus;
    int ammo;

    public Shooters(Integer atak, Integer defens,
                    String name, Integer hp,
                    Integer speed, Integer damagMax, Integer damagMin,
                    int focus, int ammo,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin,x,y);
        this.focus = focus;
        this.ammo = ammo;
    }


    void attack(UnitBaes target) {
        int shot;
        if (target.distance<5){shot = super.damagMax;}else {shot = super.damagMin;}
        if (super.atak - target.getDefens() > 0 ) {shot -= target.getDefens()/3;}
        if (super.atak - target.getDefens() == 0 ) {shot -= target.getDefens()/2;}
        if (super.atak - target.getDefens() < 0 ) {shot -= target.getDefens();}
        if (shot>0) {target.getDamag(shot);}
    }

    void aim(){}; // целится
    void needFort(){}; // звать строить укрепление
    void needUpArms(){}; // звать принести снаряды
}
