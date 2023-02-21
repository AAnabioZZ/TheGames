package Unit;

public class Thief extends Infantry implements GameInterface{


    public Thief(String name,int x,int y){
        this(8,3,name,10,6,4,2,15,x,y);
    }

    public Thief(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int stamina,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, stamina,x,y);
    }

    void steal(){};
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Вор, " +super.name+":Меня не увидят!";
    }
}
