package Unit;

import java.util.ArrayList;

public class Arbalester extends Shooters implements GameInterface {


    void hedShot() {
    }

    ;

    @Override
    public String getInfo() {
        return super.getInfo() + "\u001B[36m,Болты: " + super.ammo + "\u001B[0m";
    }


    public Arbalester(String name, int x, int y) {
        this(6, 3, name, 10, 4, 3, 2, 10, 16, x, y);

    }

    public Arbalester(Integer atak, Integer defens,
                      String name, Integer hp,
                      Integer speed, Integer damagMax, Integer damagMin,
                      int focus, int ammo, int x, int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, focus, ammo, x, y);
        this.say = "Болты в пазу!";
        this.who = "Арбалетчик";
        this.collor = "\u001B[33m";

    }

    void breakdown() {
    }

    ;


//    @Override
//    public String getInfo(){
//        return "iniciativa:"+super.speed+" Арбалетчик, " +super.name+":Болты в пазу!"+super.pole2D;
//    }

    @Override
    public void step(ArrayList<UnitBaes> aliens) {

        if (super.ammo > 0) {
            this.attack(findTarget(super.getX(), super.getY(), aliens));
            super.ammo--;
        }
        ;
    }
}
