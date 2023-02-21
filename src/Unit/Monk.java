package Unit;

public class Monk extends Magican implements GameInterface{

    private String say = "Я служитель господа, с нами Бог!";
    private String info = String.format("\u001B[35m%s " +
            "\u001B[32mCкорость:%d ; " +
            "\u001B[37mкоординаты: %d/%d " +
            "\u001B[31mHP: %d " +
            "\u001B[0mrговорит:%s","Монах", super.speed,super.pole2D.x,super.pole2D.y,super.hp,say);


    public Monk(String name,int x,int y){
        this(12,7,name,30,5,-4,-4,1,x, y);
    }

    public Monk(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin, mana,x,y);
    }

    void orison(){};

    void wrathOfGod(){};
    @Override
    public String getInfo(){
        return "iniciativa:"+super.speed+" Монах, " +super.name+":Я служитель господа, с нами Бог!";
    }
}

