package Unit;

public class Arbalester extends Shooters implements GameInterface{
private String say = "Болты в пазу!";
    private String info = String.format("\u001B[35m%s  " +
            "\u001B[32mCкорость:%d ; " +
            "\u001B[37mкоординаты: %d/%d " +
            "\u001B[31mHP: %d " +
            "\u001B[0mrговорит:%s","Арбалетчик", super.speed,super.pole2D.x,super.pole2D.y,super.hp,say);
    public Arbalester(String name,int x,int y) {

        this(6,3,name,10,4,3,2,10,16,x,y);
    }

    public Arbalester(Integer atak, Integer defens,
                      String name, Integer hp,
                      Integer speed, Integer damagMax, Integer damagMin,
                      int focus, int ammo,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, focus, ammo,x, y);
    }

    void breakdown(){};

    @Override
    public String getInfo(){
        return info;
    }


//    @Override
//    public String getInfo(){
//        return "iniciativa:"+super.speed+" Арбалетчик, " +super.name+":Болты в пазу!"+super.pole2D;
//    }

    @Override
    public void step() {
        if (super.ammo > 0){
            super.ammo--;
        };
    }
}
