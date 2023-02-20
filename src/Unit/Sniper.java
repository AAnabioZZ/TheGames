package Unit;

public class Sniper extends Shooters implements GameInterface{

    public Sniper(String name){
        this(12,10,name,15,9,10,8,10,32);
    }

    public Sniper(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int focus, int ammo) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, focus, ammo);
    }

    @Override
    public void step() {
        if (super.ammo > 0){
            super.ammo--;
        };
    }
    void hedShot(){};
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Cнайпер, " +super.name+": один выстрел - один труп!";
    }
}
