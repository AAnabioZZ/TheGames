package Unit;

public class Spearman extends Infantry {
    boolean haveWeapons;

    public Spearman(String name, Integer hp, Integer armor, Integer speed, int stamina) {
        super(name, hp, armor, speed, stamina);
    }
    public Spearman(String name){
        this(name,100,45,4,20);
    }
 void swipe(){};
    @Override
    public String getInfo(){
        return "Не бросай Копье где попало, а то сгниет!";
    }
}
