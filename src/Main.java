import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<UnitBaes> comandA = new ArrayList<>();
        ArrayList<UnitBaes> comandB = new ArrayList<>();
        ArrayList<UnitBaes> initiative = new ArrayList<>();


        Instrument.fillDarkCommand(comandA,10);
        Instrument.fillLightCommand(comandB,10);

        initiative.addAll(comandA);
        initiative.addAll(comandB);


        initiative.sort(new Comparator<UnitBaes>() {
            @Override
            public int compare(UnitBaes o1, UnitBaes o2) {
                if(o1.getSpeed()==o2.getSpeed()){return  o1.getHp() - o2.getHp();}
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        for (UnitBaes unit : comandA) {
            System.out.println(unit.getInfo());
        }
        System.out.println("____________________________________________");
        for (UnitBaes unit : comandB) {
            System.out.println(unit.getInfo());
        }
        System.out.println("____________________________________________");
        for (UnitBaes unit : initiative) {
            System.out.println(unit.getInfo());
        }


    }

}