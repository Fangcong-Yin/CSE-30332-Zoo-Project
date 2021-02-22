//Crocodile

public final class Crocodile extends Reptile{
    //Properties
    double jawLength; //Each crocodile has a unique length of jaw

    //Detailed Non-default Constructor

    Crocodile(String name,String status, String loc, boolean alive, boolean hasChild, double age, double bodyTemp, boolean layEggs, boolean isVenomous,double jaw){
        this.name = name;
        this.conserveStatus = status;
        this.alive = alive;
        this.hasChild = hasChild;
        this.age = age;
        this.bodyTemp = bodyTemp;
        this.layEggs = layEggs;
        this.isVenomous = isVenomous;
        this.jawLength = jaw;
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

 //Simplified Non-default constructor for user interaction: only take in the jaw length
 Crocodile(String name,double jawLength){
     this.name = name;
     this.jawLength=jawLength;
     //The following properties are set to some default values
     this.conserveStatus = "least concerned";
     this.alive = true;
     this.hasChild = false;
     this.age = 43.2;
     this.bodyTemp = 86;
     this.layEggs = true;
     this.isVenomous = false;
     this.food = "any meat";
     this.location = locationType.WATER;

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
     //briefDescription only prints out the name of the crocodile and its jawlength.
     String briefDescription(){
         String result = this.name + " is a " + this.getClass().getName() + ". ";
         result += this.name + "\'s jaw length is " + this.jawLength + "cm.\n";
         return result;
     }

}
