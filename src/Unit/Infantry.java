package Unit;

import java.util.ArrayList;

public abstract class Infantry extends UnitBaes {
    int stamina;
    public Infantry(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int stamina,int x,int y) {
        super(atak, defens, name, hp, speed, damagMax, damagMin,x,y);
        this.stamina = stamina;
        this.emodji="⚔";
    }

    @Override
    public void step(ArrayList<UnitBaes> comandB, ArrayList<UnitBaes> comandA) {
        if (super.frandy == null){huIsHu(comandA,comandB);}
        if (this.status != "Die") {
            UnitBaes target=findTarget();
            if(target.distance>=2) {
                if (super.getY() == target.getY()&&super.getX()>target.getX()) {super.pole2D.x=super.pole2D.x-1;
                }else if(super.getY() == target.getY()&&super.getX()<target.getX()){super.pole2D.x=super.pole2D.x+1;
                }
            }else {attack(target);}
            }else {
        super.howStep="\uD83D\uDC80";}


        }
    private void attack(UnitBaes target){
        if(super.atak>target.defens)
            super.howStep+= target.emodji+"💥\u001B[31m" +target.getDamag(super.damagMax)+"\u001B[0m";
        }
    }

