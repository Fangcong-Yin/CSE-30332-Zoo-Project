/*Zoo Project Milestone 1
Fangcong Yin (fyin2)
Joseph Capdevielle (jcapdevi)
Kenan Lumantas (klumanta)*/

//The Test Class
public class ZooTest {
  Animal[] alist;

 public void setupAnimals(){
   //TODO based on your selected animals
   // create the zoo list of animals
   /*
       int numAnimals = 6;
       alist = new Animal[6];
       alist[0] = new Dodo("Daisy", “fruits”);
       alist[1] = new Dog("Marlee", “rope”);
       alist[2] = new Shark("Jawsy", 7);
       alist[3] = new Dog("Bagheera", “frisbee”);
   alist[3].setAge(10);
       alist[4] = new Whale("Shamu", 30);
       System.out.println("\n");

       printSummaryView();
       printVerboseList();
       */
   } // end of setupAnimals

 int addAnimal(Animal a){//}

 int deleteAnimal(int index){//}

 void displayAnimals(String name) {//}

 void printSummaryView(){//}

 public static void printVerboseList(){
       int numAnimals = alist.length;

       for(int i = 0; i < numAnimals; i++){
           System.out.println((i+1) + ": " + alist[i].getName() + "\t\t" + alist[i].getClass().getSimpleName() + "\t\t" +  alist[i]); // toString() needs to be defined for this to work correctly
       } // end for

} // end of printVerboseList


 static String printInteractiveOptions(){ … }

    public static void main(String args[]) {

      Animal zoo[] = new Animal[6];

      Snake s = new Snake("s","threatened","WATER",true,false,8.1,68,true,false);
      zoo[0] = s;

      Crocodile c = new Crocodile("c","least concerned","LAND",true,true,43.2,86,true,false);
      zoo[1] = c;

      Kangaroo k = new Kangaroo("k", Animal.locationType.AIR, true, false, 3.2, Kangaroo.pouchSizeType.SMALL);
      zoo[2] = k;

      Monkey m = new Monkey("m", Animal.locationType.LAND, true, false, 1.4, "Endangered", Mammal.furType.NO, true, 1.5, Monkey.intelType.NOTHING);
      zoo[3] = m;

      Parrot pa = new Parrot("pa", "least concern", "AIR",true, false, 8.2, 6.7, 4, "imitate human speech", "seeds");

      zoo[4] = pa;

      Penguin pe = new Penguin("pe","least concern","WATER", true, true, 11.7, 10.8, 7.9, "black");
      zoo[5] = pe;

      for(int i = 0; i < 6; i++)
      {
        System.out.println(zoo[i].description());
        zoo[i].move();
        zoo[i].speak();
        zoo[i].eat();
        if((zoo[i] instanceof Bird) )
        {
          ((Bird)zoo[i]).layEggs();
        }
        else if((zoo[i] instanceof Reptile && ((Reptile)zoo[i]).layEggs)){
            ((Reptile)zoo[i]).layEggs();
        }

      }
    }
}
