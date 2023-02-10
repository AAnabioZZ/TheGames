package Unit;

public class Magican extends UnitBaes{
    int mana;

    public Magican(String name, Integer hp, Integer armor, Integer speed, int mana) {
        super(name, hp, armor, speed);
        this.mana = mana;
    }

    void needMana(){};
}
