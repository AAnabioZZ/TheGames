package Unit;

public class UnitBaes implements GameInterface {
    protected String name;
    protected Integer hp;
    protected Integer armor;
    protected Integer speed;

    public UnitBaes(String name, Integer hp, Integer armor, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.speed = speed;
    }
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

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


}
