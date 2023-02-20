package Unit;

public class UnitBaes implements GameInterface , Cloneable{
    protected Integer atak;
    protected Integer defens;
    protected String name;
    protected Integer hp;

    protected Integer speed;
    protected Integer damagMax;
    protected Integer damagMin;
    public Integer x;
    public Integer y;

    public int compareTo(UnitBaes unit){
        return this.speed;
    }
    public UnitBaes(Integer atak, Integer defens, String name, Integer hp,
                     Integer speed, Integer damagMax, Integer damagMin) {
        this.atak = atak;
        this.defens = defens;
        this.name = name;
        this.hp = hp;

        this.speed = speed;
        this.damagMax = damagMax;
        this.damagMin = damagMin;

    }
    /*
    /что нибудь тут напишем
    */


    @Override
    public void step(){    };

    void eat(){    };

    void sleep(){};

    void attack(){};

    void needHelp(){};
    @Override
    public String getInfo(){
        return "Юнит готов!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }



    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }




}
