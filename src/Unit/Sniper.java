package Unit;

import java.util.ArrayList;

public class Sniper extends Shooters implements GameInterface{


    void hedShot(){};
    @Override
    public String getInfo(){
        return super.getInfo()+"\u001B[36m,Стрелы: " + this.ammo+"\u001B[0m";
    }

    public Sniper(String name,int x,int y){
        this(12,10,name,15,9,10,8,10,32,x,y);
    }

    public Sniper(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int focus, int ammo,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, focus, ammo,x,y);
        this.say = "Один выстрел - один труп!";
        this.who = "Снайпер   ";
        this.collor = "\u001B[35m";
    }


    public void step(ArrayList<UnitBaes> aliens) {

        if (super.ammo > 0 && super.hp > 0){
            this.attack(findTarget(super.getX(),super.getY(),aliens));
            super.ammo--;
        };
    }



}
