package Unit;

public class Arbalester extends Shooters implements GameInterface{

    public Arbalester(String name) {

        this(6,3,name,10,4,3,2,10,16);
    }

    public Arbalester(Integer atak, Integer defens,
                      String name, Integer hp,
                      Integer speed, Integer damagMax, Integer damagMin,
                      int focus, int ammo) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, focus, ammo);
    }

    void breakdown(){};

    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Арбалетчик, " +super.name+":Болты в пазу!";
    }

    @Override
    public void step() {
        if (super.ammo > 0){
            super.ammo--;
        };
    }
}
