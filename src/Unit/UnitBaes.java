package Unit;

import java.util.ArrayList;

public abstract class UnitBaes implements GameInterface , Cloneable{
    public double distance;
    protected Integer atak;



    protected Integer defens;
    protected String name;
    protected Integer hp;
    protected String collor;

    protected String say = "Юнит готов!";
    protected Integer speed;
    protected Integer damagMax;
    protected Integer damagMin;
    protected String who = "Юнит";
    protected Pole2D pole2D;

    public int compareTo(UnitBaes unit){
        return this.speed;
    }
    public UnitBaes(Integer atak, Integer defens, String name, Integer hp,
                     Integer speed, Integer damagMax, Integer damagMin,int x,int y) {
        this.atak = atak;
        this.defens = defens;
        this.name = name;
        this.hp = hp;
        this.pole2D = new Pole2D(x,y);
        this.speed = speed;
        this.damagMax = damagMax;
        this.damagMin = damagMin;

    }
    /*
    /что нибудь тут напишем
    */



//    public void step(ArrayList<UnitBaes> us){    };

    void eat(){    };

    void sleep(){};

    void attack(){};

    void needHelp(){};
    @Override
    public String getInfo(){
        return String.format("%s%s " +
                    "\u001B[32mCкорость:%d ; " +
                    "\u001B[37mкоординаты: %d/%d " +
                    "\u001B[31mHP: %d " +
                    "\u001B[0mговорит:%s",this.collor,this.who, this.speed,this.pole2D.x,this.pole2D.y,this.hp,this.say);
        } ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void getDamag(int attak) {
        this.hp = this.hp-(attak-this.defens);
        if(this.hp<=0){this.hp =0;
            this.pole2D.setX(-100);
            this.pole2D.setY(-100);
            this.speed=0;
        }
    }

    public Integer getX() {
        return this.pole2D.getX();
    }
    public Integer getY() {
        return this.pole2D.getY();
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    public Integer getDefens() {
        return defens;
    }






}
