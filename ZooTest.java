import java.util.ArrayList;

public class ZooTest { 
  ArrayList<Animal> alist = new ArrayList<Animal>();

  public void setupAnimals(){
    // TODO based on your selected animals
    // create the zoo list of animals
    alist.add(new Snake("s","threatened","WATER",true,false,8.1,68,true,false));
    alist.add(new Crocodile("c","least concerned","LAND",true,true,43.2,86,true,false));
    alist.add(new Kangaroo("k", Animal.locationType.AIR, true, false, 3.2, Kangaroo.pouchSizeType.SMALL));
    alist.add(new Monkey("m", Animal.locationType.LAND, true, false, 1.4, "Endangered", Mammal.furType.NO, true, 1.5, Monkey.intelType.NOTHING));
    alist.add(new Parrot("pa", "least concern", "AIR",true, false, 8.2, 6.7, 4, "imitate human speech", "seeds"));
    System.out.println("\n");

    printSummaryView();
    printVerboseList();
  } // end of setupAnimals

  // int addAnimal(Animal a){...}

  // int deleteAnimal(int index){...}

  // void displayAnimals(String name) {...}

  void printSummaryView(){
    int numCroc = 0;
    int numKang = 0;
    int numMonkey = 0;
    int numParrot = 0;
    int numPeng = 0;
    int numSnake = 0;


    System.out.println("Summary:");
    System.out.println("There are " + alist.size() + " animals in the zoo.");

    for(Object o : alist){
      if(o instanceof Crocodile){
        numCroc++;
      }
      else if(o instanceof Kangaroo){
        numKang++;
      }
      else if(o instanceof Monkey){
        numMonkey++;
      }
      else if(o instanceof Parrot){
        numParrot++;
      }
      else if(o instanceof Penguin){
        numPeng++;
      }
      else if(o instanceof Snake){
        numSnake++;
      }
    }

    if(numCroc > 0){
      System.out.println(numCroc + " Crocodile(s)");
    }
    if(numKang > 0){
      System.out.println(numKang + " Kangaroo(s)");
    }
    if(numMonkey > 0){
      System.out.println(numMonkey + " Monkey(s)");
    }
    if(numParrot > 0){
      System.out.println(numParrot + " Parrot(s)");
    }
    if(numPeng > 0){
      System.out.println(numPeng + " Penguin(s)");
    }
    if(numSnake > 0){
      System.out.println(numSnake + " Snake(s)");
    }
    
  }

  public void printVerboseList(){
    for(int i = 0; i < alist.size(); i++){
      System.out.println((i+1) + ": " + alist.get(i).getName() + "\t\t" + alist.get(i).getClass().getSimpleName() + "\t\t" +  alist.get(i).description()); // toString() needs to be defined for this to work correctly
    } // end for

} // end of printVerboseList


  // static String printInteractiveOptions(){ … }

  public static void main(String[]args) {
    ZooTest t = new ZooTest();
    t.setupAnimals();
    //TODO	interactively take input from user to manage zoo.
  } // end of main function

} // end of ZooTest class
