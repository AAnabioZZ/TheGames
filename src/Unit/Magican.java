package Unit;

public class Magican extends UnitBaes{
    int mana;

    public Magican(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana) {
        super(atak, defens, name, hp, speed, damagMax, damagMin);
        this.mana = mana;
    }


    void needMana(){};
}
