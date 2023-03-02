package Unit;

import java.util.ArrayList;

public abstract class Magican extends UnitBaes{
    int mana;
    public Magican(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int mana,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin,x,y);
        this.mana = mana;

    }
    public void step(ArrayList<UnitBaes> list1,ArrayList<UnitBaes> list2) {
        if (super.frandy == null){huIsHu(list1,list2);}
if(super.status != "Die"){
        if (this.mana > 0 && super.hp > 0) {
            this.attack(this.findTarget());}
        if(this.mana==0&& super.hp > 0){
            super.howStep+="🙏💧";
        }}else{super.howStep="\uD83D\uDC80";}}
    private void attack(UnitBaes target){
        if (target.getHp() > 0 & target.getHp() < target.getMaxHp()){
            super.howStep+= target.emodji+"🙌\u001B[32m" +target.getDamag(super.damagMax)+"\u001B[0m";
        }
    }
    @Override
    protected UnitBaes findTarget() {
        double[] lensTarget = new double[this.frandy.size()];
        for (int i = 0; i < frandy.size(); i++) {
            if (frandy.get(i).getStatus() != "Die") {
                lensTarget[i] = (double)frandy.get(i).getHp() / ((double)frandy.get(i).getMaxHp() / 100);
            } else {
                lensTarget[i] = frandy.size() + 1000;
            }
        }
        int targetIndex = findMinIndex(lensTarget);
        frandy.get(targetIndex).distance = lensTarget[targetIndex];
        this.howStep = frandy.get(targetIndex).emodji + frandy.get(targetIndex).pole2D.getPosmini();
        return frandy.get(targetIndex);
    }

}
