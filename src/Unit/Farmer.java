package Unit;

public class Farmer extends UnitBaes implements GameInterface {
   private String say = "Готов вкалывать!";
   private String info = String.format("\u001B[35m%s  " +
           "\u001B[32mCкорость:%d ; " +
           "\u001B[37mкоординаты: %d/%d " +
           "\u001B[31mHP: %d " +
           "\u001B[0mrговорит:%s","Фермер", super.speed,super.pole2D.x,super.pole2D.y,super.hp,say);


   int scared;
   int pocket;
   boolean ready;


   public Farmer(String name,int x, int y){
      this(1,1,name,1,3,1,1,0,1,true,x,y);
   }

   public Farmer(Integer atak, Integer defens, String name, Integer hp, Integer speed, Integer damagMax, Integer damagMin, int scared, int pocket, boolean ready,int x,int y) {
      super(atak, defens, name, hp, speed, damagMax, damagMin,x,y);
      this.scared = scared;
      this.pocket = pocket;
      this.ready = ready;
   }

   @Override
   public String getInfo(){
      return info;
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
