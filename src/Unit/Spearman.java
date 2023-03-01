package Unit;

import java.util.ArrayList;

public class Spearman extends Infantry {
    boolean haveWeapons;
    public Spearman(String name,int x,int y){
        this(4,5,name,10,4,3,1,20,true,x,y);
    }
    public Spearman(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int stamina, boolean haveWeapons,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, stamina,x,y);
        this.haveWeapons = haveWeapons;
        this.say = "Не бросай Копье где попало, а то сгниет!";
        this.who = "Копейщик  ";
        this.collor = "\u001B[33m";
        super.maxHp=hp;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"в меня целились с расстояния:"+super.distance+howStep;
    }
}
