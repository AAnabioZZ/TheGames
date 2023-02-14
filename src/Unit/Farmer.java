package Unit;

public class Farmer extends UnitBaes implements GameInterface {
   int scared;
   int pocket;
   boolean ready;

   public Farmer(String name, Integer hp, Integer armor, Integer speed,int pocket) {
      super(name, hp, armor, speed);
      this.pocket = pocket;
   }
   public Farmer(String name){
      this(name,100,1,6,2);
   }
   @Override
   public String getInfo(){
      return "Фермер "+super.name+" Готов вкалывать!";
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
