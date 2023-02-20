package Unit;

public class Farmer extends UnitBaes implements GameInterface {
   int scared;
   int pocket;
   boolean ready;


   public Farmer(String name){
      this(1,1,name,1,3,1,1,0,1,true);
   }

   public Farmer(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int scared, int pocket, boolean ready) {
      super(atak, defens, name, hp, speed, damagMax, damagMin);
      this.scared = scared;
      this.pocket = pocket;
      this.ready = ready;
   }

   @Override
   public String getInfo(){
      return "iniciativa:"+super.speed+" Фермер "+super.name+": Готов вкалывать!";
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
