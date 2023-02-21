package Unit;

public class Witch extends Magican implements GameInterface{

    public Witch(String name,int x,int y){
        this(17,12,name,30,9,-5,-5,1,x,y);
    }

    public Witch(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, mana,x,y);
    }

    void curse() {

    }
    void buff(){}
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Колдун, " +super.name+":Сила переполняет меня!";
    }

}
