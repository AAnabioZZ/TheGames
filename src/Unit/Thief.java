package Unit;

public class Thief extends Infantry implements GameInterface{


    public Thief(String name){
        this(8,3,name,10,6,4,2,15);
    }

    public Thief(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int stamina) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, stamina);
    }

    void steal(){};
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Вор, " +super.name+":Меня не увидят!";
    }
}
