package Unit;

public class Monk extends Magican implements GameInterface{

    public Monk(String name, Integer hp, Integer armor, Integer speed, int mana) {
        super(name, hp, armor, speed, mana);
    }

    public Monk(String name){
        this(name,100,25,10,120);
    }
    void orison(){};

    void wrathOfGod(){};
    @Override
    public String getInfo(){
        return "Монах, " +super.name+":Я служитель господа, с нами Бог!";
    }
}

