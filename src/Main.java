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


//        comandA.add(new Farmer("макс",1,1,0));
//        comandA.add(new Farmer("макс",1,2,0));
//        comandA.add(new Farmer("макс",1,3,0));
//        comandA.add(new Farmer("макс",1,4,0));
//        comandA.add(new Farmer("макс",1,5,0));
//        comandA.add(new Sniper("макс",1,6));
//        comandA.add(new Farmer("макс",1,7,0));
//        comandA.add(new Farmer("макс",1,8,0));
//        comandA.add(new Farmer("макс",7,6,0));
//        comandA.add(new Farmer("макс",1,10,0));
//
//        comandB.add(new Farmer("макс",10,1,1));
//        comandB.add(new Farmer("макс",10,2,1));
//        comandB.add(new Farmer("макс",10,3,1));
//        comandB.add(new Farmer("макс",10,4,1));
//        comandB.add(new Monk("Петр",10,5));
//        comandB.add(new Spearman("Петр",10,6));
//        comandB.add(new Monk("Петр",10,7));
//        comandB.add(new Farmer("макс",10,8,1));
//        comandB.add(new Farmer("макс",10,9,1));
//        comandB.add(new Farmer("макс",10,10,1));

        initiative.addAll(comandA);
        initiative.addAll(comandB);


//        View.view();
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
            boolean viner = true;
            for (UnitBaes item : comandA)
            {if(item.getStatus() != "Die") viner = false;}
            if (viner){
                System.out.println("Победила комадна а");
                break;
            }viner = true;
            for (UnitBaes item : comandB)
            {if(item.getStatus() != "Die") viner = false;}
            if (viner){
                System.out.println("Победила комадна b" +
                        "" +
                        "");
                break;
            }
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
            Scanner sc = new Scanner(System.in);
            System.out.print("для продолжения Enter");
            String res = sc.nextLine();


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

