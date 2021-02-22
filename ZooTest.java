/*Zoo Project Milestone 1
Fangcong Yin (fyin2)
Joseph Capdevielle (jcapdevi)
Kenan Lumantas (klumanta)*/
import java.util.*;
import java.util.Scanner;
//The Test Class
public class ZooTest {
  ArrayList<Animal> alist;

 public void setupAnimals(){
   //TODO based on your selected animals
   // create the zoo list of animals

    alist = new ArrayList<Animal>();
    alist.add(new Snake("s","threatened","WATER",true,false,8.1,68,true,false));
    alist.add(new Crocodile("c","least concerned","LAND",true,true,43.2,86,true,false,20.1));
    alist.add(new Kangaroo("k", Animal.locationType.AIR, true, false, 3.2, Kangaroo.pouchSizeType.SMALL));
    alist.add(new Monkey("m", Animal.locationType.LAND, true, false, 1.4, "Endangered", Mammal.furType.NO, true, 1.5, Monkey.intelType.NOTHING));
    alist.add(new Parrot("pa", "least concern", "AIR",true, false, 8.2, 6.7, 4, "imitate human speech", "seeds"));
    alist.add(new Penguin("pe","least concern","WATER", true, true, 11.7, 10.8, 7.9, "black");
    System.out.println("\n");
    printSummaryView();
    printVerboseList();

   } // end of setupAnimals

   //addAnimal takes the input of an animal species name
   int addAnimal(String a){
     Animal new_a;
     //The scanner obeject
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter the name of this animal:");
     String name = sc.nextLine();
     if(a.equals("Kangaroo")){
       System.out.println("Please enter the pouch size of this kangaroo (Please choose from: SMALL, MEDIUM, LARGE)");
       String size = sc.nextLine();
       new_a = new Kangaroo(name,size);
     }
     else if(a.equals("Monkey")){
       System.out.println("Please enter how intelligence this monkey is (Please choose from: TOOLUSE, VERBALCOMMUNICATION, NOTHING)");
       System.out.println("It has skills in: ");
       String ability = sc.nextLine();
       new_a = new Monkey(name,ability);
   }
     else if(a.equals("Parrot")){
       System.out.println("Please enter how intelligent this parrot is (e.g. it can understand human speech.)");
       System.out.println("It can: ");
       String ability = sc.nextLine();
       new_a = new Parrot(name,ability);
     }
     else if(a.equals("Penguin")){
       System.out.println("Please enter this penguin's color of feathers: ");
       String color = sc.nextLine();
       new_a = new Penguin(name,color);
     }
     else if(a.equals("Snake")){
       System.out.println("Please enter whether this snake lays eggs (Y/N): ");
       boolean layEggs = (sc.nextLine().equals("Y")?true:false);
       new_a = new Snake(name,layEggs);
     }
     else if(a.equals("Crocodile")){
       System.out.println("Please enter the jaw length of this crocodile in cm: ");
       double len = sc.nextDouble();
       new_a = new Crocodile(name,len);
     }
     else{
       System.out.println("Error!\n");
       //If the animal species are not in the list, return an error code 1
       return 1;
     }
     alist.add(new_a);
     System.out.println(new_a.description());
     return 0;
   }
   //deleteAnimal take in the name of the animal to be deleted as an argument
   int deleteAnimal(String name){
     Scanner sc = new Scanner(System.in);
      for(int i = 0; i < alist.size(); i++)
      {
        if(alist.get(i).getName().equals(name)){
          alist.remove(i);
          System.out.println(name + " is deleted from the zoo.");
          return 0;
        }
      }
      System.out.println(name + " not found!");
      return 1;
   }

//displayAnimals take in the name of the animal as an argument and let the user choose whether display the brief/detailed description
 void displayAnimals(String name) {
  Scanner sc = new Scanner(System.in);
   for(int i = 0; i < alist.size(); i++)
   {
     if(alist.get(i).getName().equals(name)){
       System.out.println("Would you like to display the detailed or the brief information of this animal? (D/B)");
       boolean detail = (sc.nextLine().equals("D")?true:false);
       if(detail) System.out.println(alist.get(i).description());
       else{
         System.out.println(alist.get(i).briefDescription());
       }
       break;
     }
   }

 }

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

	System.out.println();
 }

	public void printVerboseList(){
		for(int i = 0; i < alist.size(); i++){
			System.out.println((i+1) + ": " + alist.get(i).getName() + "\t\t" + alist.get(i).getClass().getSimpleName() + "\t\t" +  alist.get(i).description());
		}
	} // end of printVerboseList


	static void printInteractiveOptions()
	{
		System.out.println("Option:\nAdd animal(add)\nDelete animal(delete)\nDisplay animal(display)\nDisplay all with full descriptions(full)\nExit(exit)\n\nSelect action: ");
		return;
	};

    public static void main(String args[])
	{
		ZooTest t = new ZooTest();
		t.setupAnimals();

		boolean exit = false;
		Scanner in = new Scanner(System.in);
		String input = "";

		do{
			t.printInteractiveOptions();
			input = in.nextLine();

			switch(input)
			{
				case "add":
					System.out.println("What kind of animal do you want to add? ");
					input = in.nextLine();
					System.out.println("\n\n------------------------------------------------------------------------\n");
					t.addAnimal(input);
					break;
				case "delete":
					System.out.println("Enter the name of the animal you want to delete: ");
					input = in.nextLine();
					System.out.println("\n\n------------------------------------------------------------------------\n");
					t.deleteAnimal(input);
					break;
				case "display":
					System.out.println("Enter the name of the animal you want to display: ");
					input = in.nextLine();
					System.out.println("\n\n------------------------------------------------------------------------\n");
					t.displayAnimals(input);
					break;
				case "full":
					System.out.println("\n\n------------------------------------------------------------------------\n");
					t.printVerboseList();
					break;
				case "exit":
					exit = true;
					System.out.println("\n\n------------------------------------------------------------------------\n");
					break;
			}
			t.printSummaryView();
		}while(exit == false);

		System.out.println("\n\nThank you for using our zoo management system!");
	}
}
