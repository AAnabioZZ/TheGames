package Unit;

public class Sniper extends Shooters implements GameInterface{
    public Sniper(String name, Integer hp, Integer armor, Integer speed, int focus, int ammo) {
        super(name, hp, armor, speed, focus, ammo);
    }
    public Sniper(String name){
        this(name,100,20,10,12,12);
    }
    void hedShot(){};
    @Override
    public String getInfo(){
        return "Cнайпер, " +super.name+": один выстрел - один труп!";
    }
}
