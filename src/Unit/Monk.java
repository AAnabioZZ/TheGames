package Unit;

public class Monk extends Magican implements GameInterface{



    public Monk(String name){
        this(12,7,name,30,5,-4,-4,1);
    }

    public Monk(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, mana);
    }

    void orison(){};

    void wrathOfGod(){};
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Монах, " +super.name+":Я служитель господа, с нами Бог!";
    }
}

