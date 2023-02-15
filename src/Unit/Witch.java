package Unit;

public class Witch extends Magican implements GameInterface{
    public Witch(String name, Integer hp, Integer armor, Integer speed, int mana) {
        super(name, hp, armor, speed, mana);
    }
    public Witch(String name){
        this(name,100,10,7,120);
    }
    void curse() {

    }
    void buff(){}
    @Override
    public String getInfo(){
        return "Колдун, " +super.name+":Сила переполняет меня!";
    }

}
