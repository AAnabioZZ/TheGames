package Unit;

import java.util.ArrayList;

public abstract class Shooters extends UnitBaes {

    int focus;
    int ammo;

    public Shooters(Integer atak, Integer defens,
                    String name, Integer hp,
                    Integer speed, Integer damagMax, Integer damagMin,
                    int focus, int ammo, int x, int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, x, y);
        this.focus = focus;
        this.ammo = ammo;
        this.emodji="\uD83C\uDFF9";
    }
    private void attack(UnitBaes target) {
        int shot=0;

        if (super.atak - target.getDefens() > 0) {
            if (target.distance < 5) {
                shot = super.damagMax;
            } else {
                shot =(super.damagMin+super.damagMax)/2;
            }
        }
        if (super.atak - target.getDefens() == 0) {
            if (target.distance < 5) {
                shot =(super.damagMin+super.damagMax)/2;
            } else {
                shot =super.damagMin;
            }
        }
        if (super.atak - target.getDefens() < 0) {
            if (target.distance < 5) {
                shot =(super.damagMin+super.damagMax)/2;
            } else {
                shot =super.damagMin;
            }
        }
        if (shot > 0) {
            super.howStep+="\uD83D\uDCA5"+target.getDamag(shot);
            return;
        }
//        super.howStep+="\uD83D\uDCA50";
    }
    public void step(ArrayList<UnitBaes> list1,ArrayList<UnitBaes> list2) {
        if (super.frandy == null){huIsHu(list1,list2);}
        if (this.ammo > 0 && super.hp > 0&& this.status != "Die") {
            super.howStep = "\uD83C\uDFF9⚡";
            UnitBaes target=findTarget();
            if(target.distance>100){super.howStep += "❌";
            return;}
            this.attack(target);
            this.ammo--;
            findFarmer();
            return;
        }
        super.howStep="\uD83D\uDC80";
    }
    private void findFarmer(){
        for (UnitBaes unit : super.frandy) {
            if(unit.getWho()=="Фермер    "&& unit.getStatus()=="Redy"){
                unit.status = "Gives ammo";
                this.ammo++;
                super.howStep += "  \uD83D\uDC49⚒"+unit.pole2D.getPosmini();
                return;
        }
            }
    super.howStep += "  \uD83D\uDC49⚒❌";
}
}
