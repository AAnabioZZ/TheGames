package Unit;

public class Arbalester extends Shooters implements GameInterface{
    public Arbalester(String name, Integer hp, Integer armor, Integer speed, int focus, int ammo) {
        super(name, hp, armor, speed, focus, ammo);
    }
    public Arbalester(String name) {

        this(name, 100, 30, 4, 10, 12);
    }
    void breakdown(){};

    @Override
    public String getInfo(){
        return "Арбалетчик, " +super.name+":Болты в пазу!";
    }
}
