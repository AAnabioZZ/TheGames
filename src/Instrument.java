import Unit.*;

import java.util.ArrayList;
import java.util.Random;

public class Instrument {
    public static String newName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
    /**
     * Наполняет команду темными бойцами
     */
    static void fillDarkCommand(ArrayList<UnitBaes> command, int quantity){
        for (int i=0;i<quantity;i++) {
            switch (new Random().nextInt(1,5)) {
                case 1 -> command.add(new Farmer(newName(),1,i+1,0));
                case 2 -> command.add(new Sniper(newName(),1,i+1));
                case 3 -> command.add(new Thief(newName(),1,i+1));
                case 4 -> command.add(new Witch(newName(),1,i+1));
            }
            }
        }

    /**
     * Наполняет команду светлыми юнитами
     * command:  лист куда можно положить юнитов
     * quantity: колличество юнитов
     */

    static void fillLightCommand(ArrayList<UnitBaes> command, int quantity){
        int x = quantity;
        for (int i=0;i<quantity;i++) {
            switch (new Random().nextInt(1,5)) {
                case 1 -> command.add(new Farmer(newName(),x,i+1,1));
                case 2 -> command.add(new Arbalester(newName(),x,i+1));
                case 3 -> command.add(new Spearman(newName(),x,i+1));
                case 4 -> command.add(new Monk(newName(),x,i+1));
            }}}}
