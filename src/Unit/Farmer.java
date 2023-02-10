package Unit;

public class Farmer extends UnitBaes {
   int scared;
   int pocket;
   boolean ready;

   public Farmer(String name, Integer hp, Integer armor, Integer speed,int pocket) {
      super(name, hp, armor, speed);
      this.pocket = pocket;
   }

   void takeFood(){};
   void takeUpArms(){};
   void takeArrows(){};
   void takeTool(){};

   void giveFood(){};
   void giveUpArms(){};
   void giveArrows(){};
   void buildFort(){};
   void retreat(){};



}
