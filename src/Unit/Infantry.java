package Unit;

public class Infantry extends UnitBaes {


    int stamina;

    public Infantry(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int stamina,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin,x,y);
        this.stamina = stamina;
    }




    void defend(){}; // защизатьсяэ
    void needFort(){};
    void needUpArms(){};
}
