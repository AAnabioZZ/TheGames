package Unit;

import java.util.ArrayList;

public class Farmer extends UnitBaes implements GameInterface {

   int scared;
   int pocket;
   boolean ready;

   public Farmer(String name,int x, int y,int frakci){
      this(1,1,name,1,3,1,1,0,1,true,x,y,frakci);
   }

   public Farmer(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int scared, int pocket, boolean ready,int x,int y,int frakci) {
      super(atak, defens, name, hp, speed, damagMax, damagMin,x,y);
      this.scared = scared;
      this.pocket = pocket;
      this.ready = ready;
      this.say = "Готов вкалывать!";
      this.who = "Фермер    ";
      if(frakci>0)this.collor = "\u001B[33m";
      else this.collor = "\u001B[35m";
   }


   public void step(ArrayList<UnitBaes> frends) {

   }
   @Override
   public String getInfo(){
      return super.getInfo();}
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
