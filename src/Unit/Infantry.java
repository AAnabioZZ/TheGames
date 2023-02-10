package Unit;

public class Infantry extends UnitBaes {
    int stamina;

    public Infantry(String name, Integer hp, Integer armor, Integer speed, int stamina) {
        super(name, hp, armor, speed);
        this.stamina = stamina;
    }

    void defend(){}; // защизатьсяэ
    void needFort(){};
    void needUpArms(){};
}
