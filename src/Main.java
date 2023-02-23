import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<UnitBaes> comandA = new ArrayList<>();
        ArrayList<UnitBaes> comandB = new ArrayList<UnitBaes>();
        ArrayList<UnitBaes> initiative = new ArrayList<>();


        Instrument.fillDarkCommand(comandA, 10);
        Instrument.fillLightCommand(comandB, 10);

//        comandA.add(new Sniper("макс",1,1));
//        comandB.add(new Spearman("Петр",10,1));

        initiative.addAll(comandA);
        initiative.addAll(comandB);

        initiative.sort(new Comparator<UnitBaes>() {
            @Override
            public int compare(UnitBaes o1, UnitBaes o2) {
                if (o1.getSpeed() == o2.getSpeed()) {
                    return o1.getHp() - o2.getHp();
                }
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
//        for (UnitBaes item: comandA) {
//            item.step(comandB);}

        System.out.println("____________________________________________");
        for (UnitBaes unit : initiative) {
            System.out.println(unit.getInfo());
        }
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter для продолжения или n + Enter для выхода");
            String res = sc.nextLine();
            if (res == "n") {
                flag = false;
            } else {
                for (UnitBaes item : initiative) {
                    if (comandA.contains(item)) {
                        item.step(comandB);
                    }
                    if (comandB.contains(item)) {
                        item.step(comandA);
                    }
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
        }

    }

}