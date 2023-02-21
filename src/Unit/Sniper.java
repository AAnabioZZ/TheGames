package Unit;

public class Sniper extends Shooters implements GameInterface{
    private String say = "Один выстрел - один труп!";
    private String info = String.format("\u001B[35m%s " +
            "\u001B[32mCкорость:%d ; " +
            "\u001B[37mкоординаты: %d/%d " +
            "\u001B[31mHP: %d " +
            "\u001B[0mrговорит:%s","Снайпер", super.speed,super.pole2D.x,super.pole2D.y,super.hp,say);


    public Sniper(String name,int x,int y){
        this(12,10,name,15,9,10,8,10,32,x,y);
    }

    public Sniper(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int focus, int ammo,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, focus, ammo,x,y);
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
