//Snake

//This class is one of the bottom classes, so it is final
public final class Snake extends Reptile{
    //Properties
    boolean forkedTongue = true; //All snakes have forked tongue

    //Detailed Non-default Constructor

    Snake(String name,String status, String loc, boolean alive,  boolean hasChild, double age, double bodyTemp, boolean layEggs, boolean isVenomous){
        this.name = name;
        this.conserveStatus = status;
        this.alive = alive;
        this.hasChild = hasChild;
        this.age = age;
        this.bodyTemp = bodyTemp;
        this.layEggs = layEggs;
        this.isVenomous = isVenomous;
        //Snake in general eats small rodents
        this.food = "small rodents";
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
    //Simplified Non-default constructor for user interaction: only take in the layEggs argument
    Snake(String name,boolean layEggs){
        this.name = name;
        this.layEggs = layEggs;
        //The following properties are set to some default values
        this.conserveStatus = "least concerned";
        this.alive = true;
        this.hasChild = false;
        this.age = 8.0;
        this.bodyTemp = 68;
        this.isVenomous = false;
        this.food = "small rodents";
        this.location = locationType.LAND;

    }
    //Methods
    void move(){
        System.out.println(this.name + " slithers.");
    }

    void speak(){
        System.out.println(this.name + " hisses.");
    }

    void layEggs(){
        if(layEggs){
            System.out.println(this.name + " lays eggs."); //Oviparous Snakes lay eggs
        }
        else{
            System.out.println(this.name + " does not lay eggs."); //Viviparous snake does not lay eggs
        }
    }
    String speciesDescription()
    {
        String result = " It has a forked tongue.";
        return result;
    }
    //briefDescription only prints out the name of the snake and whether it lays eggs.
    String briefDescription(){
        String result = this.name +" is a " + this.getClass().getName() + ". ";
        result+=this.name+(this.layEggs?" lays eggs.":" does not lay eggs.")+"\n";
        return result;
    }

}
