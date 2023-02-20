package Unit;

public class Spearman extends Infantry {
    boolean haveWeapons;



    public Spearman(String name){
        this(4,5,name,10,4,3,1,20,true);
    }

    public Spearman(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int stamina, boolean haveWeapons) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, stamina);
        this.haveWeapons = haveWeapons;
    }


    void swipe(){};
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Копейщик, " +super.name+":Не бросай Копье где попало, а то сгниет!";
    }
}
