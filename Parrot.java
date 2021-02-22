//Parrot
public final class Parrot extends Bird{
    //Properties
    String intelligence = "imitate speech";

    //Detailed Non-default Constructor
    Parrot(String name, String status, String loc, boolean alive,
       boolean hasChild, double age, double wingspan,
        double beakLength, String intelligence, String food){

        this.name = name;
        this.conserveStatus = status;
        this.alive = alive;
        this.hasChild = hasChild;
        this.age = age;
        this.wingspan = wingspan;
        this.beakLength = beakLength;
        this.food = food;
        this.intelligence = intelligence;

        //parse the location from String to locationType
        if(loc == "LAND"){
            this.location = locationType.LAND;
        }
        else if(loc == "WATER"){
            this.location = locationType.WATER;
        }
        else if(loc == "AIR"){
            this.location = locationType.AIR;
        }
        else{
            this.location = locationType.ICE;
        }
    }
      //Simplified Non-default constructor for user interaction: only take in the intelligence
      Parrot(String name, String intelligence){

          this.name = name;
          this.intelligence = intelligence;
          //The following properties are set to some default values
          this.conserveStatus = "least concerned";
          this.alive = true;
          this.hasChild = false;
          this.age = 8.2;
          this.wingspan = 6.7;
          this.beakLength = 4;
          this.food = "seeds";
          this.location = locationType.AIR;

      }
    //Methods
    void move(){
        System.out.println(this.name + " flies.");
    }

    void speak(){
        System.out.println(this.name + " squawks.");
    }

    String speciesDescription(){
        String result = this.name + " eats " + this.food + ".";
        result += this.name + " can " + this.intelligence + ".";
        return result;
    }
    //briefDescription only prints out the name of the parrot and its intelligence level.
    String briefDescription(){
        String result = this.name +" is a " + this.getClass().getName() + ". ";
        result+=this.name+" is able to " + this.intelligence+ "\n";
        return result;
    }

}
