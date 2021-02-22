//Parrot
public final class Parrot extends Bird{
    //Properties
    String intelligence = "imitate speech";

    //Constructor
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
}
