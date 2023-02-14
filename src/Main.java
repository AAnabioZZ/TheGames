import Unit.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        UnitBaes farmer = new Farmer(String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]));

        Infantry spar = new Spearman("Smit",100,45,2,80);
        Infantry thief = new Thief("Piter", 100, 25,9,70);

        Shooters arbal = new Arbalester("Good",100,20,5,10,20);
        Shooters sniper = new Sniper("Robin",100,17,5,10,22);

        Magican monah = new Monk("Sten",100,0,7,100);
        Magican witch = new Witch("Gerald",100,10,7,100);

        System.out.println(farmer.getInfo());
    }
}