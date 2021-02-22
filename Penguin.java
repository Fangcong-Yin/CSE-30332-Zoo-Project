//Penguin
public final class Penguin extends Bird{
    //Properties
    String colorOfFeathers;
    //Detailed Non-default Constructor

    Penguin(String name, String status, String loc, boolean alive,
         boolean hasChild, double age, double wingspan,
        double beakLength, String colorOfFeathers){

        this.name = name;
        this.conserveStatus = status;
        this.alive = alive;
        this.hasChild = hasChild;
        this.age = age;
        this.wingspan = wingspan;
        this.beakLength = beakLength;
        this.colorOfFeathers = colorOfFeathers;
        this.food = "fish";

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
      //Simplified Non-default constructor for user interaction: only take in the color argument
    Penguin(String name, String colorOfFeathers){

        this.name = name;
        this.colorOfFeathers = colorOfFeathers;
        //The following properties are set to some default values
        this.conserveStatus = "least concerned";
        this.alive = true;
        this.hasChild = false;
        this.age = 11.7;
        this.wingspan = 10.8;
        this.beakLength = 7.9;
        this.food = "fish";
        this.location = locationType.WATER;

    }
    //Methods
    void move(){
        if(this.location == locationType.LAND){
             System.out.println(this.name + " hops.");
        }
        else if(this.location == locationType.WATER){
            System.out.println(this.name + " swims.");
        }
        else if(this.location == locationType.ICE){
            System.out.println(this.name + " slides.");
        }
        else{
        }
    }

    void speak(){
        System.out.println(this.name + " honks.");
    }

    void eat(){
        if(this.hasChild){
            System.out.println(this.name + " eats " + this.food + " in turn with its mate.");
        }
        else{
            System.out.println(this.name + " usually eats " + this.food);
        }
    }

    String speciesDescription(){
        String result = this.name + " eats " + this.food + ".";
        return result;
    }

    //briefDescription only prints out the name of the penguin and its feather color.
    String briefDescription(){
        String result = this.name +" is a " + this.getClass().getName() + ". ";
        result+=this.name+"has a " + this.colorOfFeathers + " color of feathers.\n";;
        return result;
    }


}
