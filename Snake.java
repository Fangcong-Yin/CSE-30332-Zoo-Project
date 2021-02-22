//Snake

//This class is one of the bottom classes, so it is final 
public final class Snake extends Reptile{
    //Properties
    boolean forkedTongue = true; //All snakes have forked tongue
    
    //Constructor
    
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
        String result = " It has a forked tongue. ";
        return result;
     }

  
    
}