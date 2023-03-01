import Unit.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
   public static ArrayList<UnitBaes> comandA = new ArrayList<>();
    public static ArrayList<UnitBaes> comandB = new ArrayList<UnitBaes>();
    public static ArrayList<UnitBaes> initiative = new ArrayList<>();
    public static void main(String[] args) {



        Instrument.fillDarkCommand(comandA, 10);
        Instrument.fillLightCommand(comandB, 10);

//        comandA.add(new Sniper("макс",1,1));
//        comandB.add(new Spearman("Петр",10,1));
//        comandB.add(new Monk("Петр",10,2));

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
        Collections.reverse(initiative);
        View.view();
//        for (UnitBaes unit : initiative) {
//            System.out.println(unit.getInfo());
//        }

//
//        for (UnitBaes unit : comandA) {
//            System.out.println(unit.getInfo());
//        }
//        System.out.println("____________________________________________");
//        for (UnitBaes unit : comandB) {
//            System.out.println(unit.getInfo());
//        }
//
//        System.out.println("____________________________________________");
//
//
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("для продолжения Enter");
            String res = sc.nextLine();
            View.view();

                for (UnitBaes item : initiative)
                {item.step(comandA,comandB);}
//                    System.out.println("Команда 1______________________________________");
//                    for (UnitBaes unit : comandA) {
//                        System.out.println(unit.getInfo());
//                    }
//                    System.out.println("Команда 2______________________________________");
//                    for (UnitBaes unit : comandB) {
//                        System.out.println(unit.getInfo());
//                    }
//                    System.out.println("Очередь инициативы_____________________________");
//
//                    for (UnitBaes unit : initiative) {
//                        System.out.println(unit.getInfo());
//                    }
//                }
            }
  }

    }

