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

        if (this.mana > 0 && super.hp > 0) {
            this.attack(this.findTarget());

        }}
    private void attack(UnitBaes target){
        if (target.getHp() > 0 & target.getHp() < target.getMaxHp()){
            target.getDamag(super.atak);
        }
    }
    @Override
    protected UnitBaes findTarget() {
        double[] lensTarget = new double[this.frandy.size()];
        for (int i = 0; i < frandy.size(); i++) {
            if (frandy.get(i).getStatus() != "Die") {
                lensTarget[i] = frandy.get(i).getMaxHp()-frandy.get(i).getHp() * -1;
            } else {
                lensTarget[i] = frandy.size() + 100;
            }
        }
        int targetIndex = findMinIndex(lensTarget);
        frandy.get(targetIndex).distance = lensTarget[targetIndex];
        this.howStep = frandy.get(targetIndex).emodji + frandy.get(targetIndex).pole2D.getPosmini();
        return frandy.get(targetIndex);
    }

}
