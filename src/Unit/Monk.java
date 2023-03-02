package Unit;

import java.util.ArrayList;

public class Monk extends Magican implements GameInterface{

    public Monk(String name,int x,int y){
        this(12,7,name,30,5,-5,-5,1,x, y);
    }

    public Monk(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, mana,x,y);
        this.say = "Я служитель господа, с нами Бог!";
        this.who = "Монах     ";
        this.collor = "\u001B[33m";
        super.maxHp=hp;
        this.emodji="\uD83E\uDDD9";
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\u001B[36mМана: " + this.mana+"\u001B[0m"+howStep;
    }
}

