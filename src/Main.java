import Unit.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<UnitBaes> comandA = new ArrayList<>();
        ArrayList<UnitBaes> comandB = new ArrayList<>();

        Instrument.fillDarkCommand(comandA,10);
        Instrument.fillLightCommand(comandB,10);

        for (UnitBaes unit : comandA) {
            System.out.println(unit.getInfo());
        }
        System.out.println("____________________________________________");
        for (UnitBaes unit : comandB) {
            System.out.println(unit.getInfo());
        }


    }

}