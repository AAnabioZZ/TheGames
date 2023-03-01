package Unit;
import java.util.ArrayList;
public class Witch extends Magican implements GameInterface{
    public Witch(String name,int x,int y){
        this(17,12,name,30,9,-5,-5,1,x,y);
    }
    public Witch(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, mana,x,y);
        this.say = "Сила переполняет меня!";
        this.who = "Колдун    ";
        this.collor = "\u001B[35m";
        super.maxHp=hp;
        this.emodji="\uD83E\uDDD9";
    }
    public void step(ArrayList<UnitBaes> list1,ArrayList<UnitBaes> list2) {
        super.step(list1,list2);
    }
    @Override
    public String getInfo(){
        return super.getInfo()+"\u001B[36mМана: " + this.mana+"\u001B[0m"+howStep;
    }

}
