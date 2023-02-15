package Unit;

public class Thief extends Infantry implements GameInterface{

    public Thief(String name, Integer hp, Integer armor, Integer speed, int stamina) {
        super(name, hp, armor, speed, stamina);
    }
    public Thief(String name){
        this(name,100,10,15,20);
    }
    void steal(){};
    @Override
    public String getInfo(){
        return "Вор, " +super.name+":Меня не увидят!";
    }
}
