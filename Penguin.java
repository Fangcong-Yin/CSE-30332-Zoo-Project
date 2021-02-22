//Penguin
public final class Penguin extends Bird{
    //Properties
    String colorOfFeathers;
    //Constructor
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

}
