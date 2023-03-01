package Unit;


import java.util.ArrayList;

public abstract class UnitBaes implements GameInterface, Cloneable {


    String emodji;
    ArrayList<UnitBaes> frandy;
    ArrayList<UnitBaes> aliens;
    public double distance;
    protected Integer atak;
    protected String howStep;
    protected String status = "Redy";
    protected Integer defens;
    protected String name;
    protected Integer maxHp;
    protected Integer hp;
    protected String collor;
    protected String say = "Юнит готов!";
    protected Integer speed;
    protected Integer damagMax;
    protected Integer damagMin;
    protected String who = "Юнит";
    protected Pole2D pole2D;
    public int compareTo(UnitBaes unit) {
        return this.speed;
    }
    public UnitBaes(Integer atak, Integer defens, String name, Integer hp,
                    Integer speed, Integer damagMax, Integer damagMin, int x, int y) {
        this.atak = atak;
        this.defens = defens;
        this.name = name;
        this.hp = hp;
        this.pole2D = new Pole2D(x, y);
        this.speed = speed;
        this.damagMax = damagMax;
        this.damagMin = damagMin;

    }
    public String getWho() {
        return who;
    }
    @Override
    public String getInfo() {
        return String.format("%s%s " +
                "\u001B[32mCкорость:%d ; " +
                "\u001B[37mкоординаты: %d/%d " +
                "\u001B[31mHP: %d " +
                "\u001B[0mговорит:%s", this.collor, this.who, this.speed, this.pole2D.x, this.pole2D.y, this.hp, this.say);
    }
    public String getDamag(int attak) {
        int i = attak - this.defens;
        this.hp -= i;
        if (this.hp > this.maxHp) {
            this.hp = this.maxHp;
        }
        if (this.hp <= 0) {
            this.hp = 0;
            this.status = "Die";
            this.speed = 0;
        }
        return Integer.toString(i);
    }
    protected UnitBaes findTarget() {
        double[] lensTarget = new double[this.aliens.size()];
        for (int i = 0; i < aliens.size(); i++) {
            if (aliens.get(i).getStatus() != "Die") {
                lensTarget[i] = Math.sqrt((aliens.get(i).getY() - this.getY()) * (aliens.get(i).getY() - this.getY()) + (frandy.get(i).getX() - this.getX()) * (frandy.get(i).getX() - this.getX()));
            } else {
                lensTarget[i] = aliens.size() + 100;
            }
        }
        int targetIndex = findMinIndex(lensTarget);
        aliens.get(targetIndex).distance = lensTarget[targetIndex];
        this.howStep += aliens.get(targetIndex).emodji + aliens.get(targetIndex).pole2D.getPosmini();
        return aliens.get(targetIndex);
    }
    protected int findMinIndex(double[] array) {
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
    protected void huIsHu(ArrayList<UnitBaes> list1, ArrayList<UnitBaes> list2) {

        if (list1.contains(this)) {
            this.frandy = list1;
            this.aliens = list2;
        } else {
            this.frandy = list2;
            this.aliens = list1;
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
    public Integer getMaxHp() {
        return maxHp;
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
    public Integer getDefens() {
        return defens;
    }
    public String getStatus() {
        return status;
    }
    public void step(ArrayList<UnitBaes> comandB, ArrayList<UnitBaes> comandA) {

    }
    public String getEmodji() {
        return emodji;
    }

    @Override
    public String toString() {
        return this.getEmodji()+": "+"\u001B[31m"+getHp()+" \u001B[34m: "+this.pole2D.getPosmini()+" "+this.howStep+"\u001B[00m";
    }
}
