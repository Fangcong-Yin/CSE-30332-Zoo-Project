//Crocodile

public final class Crocodile extends Reptile{
    //Properties
    double jawLength; //Each crocodile has a unique length of jaw
    
    //Constructor
    
    Crocodile(String name,String status, String loc, boolean alive, boolean hasChild, double age, double bodyTemp, boolean layEggs, boolean isVenomous){
        this.name = name;
        this.conserveStatus = status;
        this.alive = alive;
        this.hasChild = hasChild;
        this.age = age;
        this.bodyTemp = bodyTemp;
        this.layEggs = layEggs;
        this.isVenomous = isVenomous;
        //Crocodile in general eats any meat
        this.food = "any meat";
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
        //Crocodiles can swim in water and walk on land, so we have the conditionals
        if(this.location == locationType.LAND){
            System.out.println(this.name + " walks.");
        }
        else if (this.location == locationType.WATER) System.out.println(this.name + " swims.");
        else System.out.println(this.name + "has an invalid location type.."); 
    }
    
    //Overloaded
    void speak(){
        System.out.println(this.name + " yelps, growls, and bellows.");
    }
    
    //All crocodiles layEggs and take care of their eggs (other reptiles do not!)
    void layEggs(){
            System.out.println(this.name + " lays eggs and take care of its eggs."); 
  
    }
  
 String speciesDescription()
     {
        String result = " Its jaw length is " + this.jawLength + "." ;
        return result;
     }

    
}