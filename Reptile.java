
//Reptile
public abstract class Reptile extends Animal{
    //Properties
    double bodyTemp; //Reptiles have inconstant body temperature that are different to each individual
    boolean layEggs; //Some reptiles lay eggs, while some do not
    boolean isVenomous; //Some reptiles are venomous, while some are not
    
    //Methods
    abstract void layEggs();
    
    final double getBodyTemp(){
        return this.bodyTemp;
    }
String classDescription()
    {
        String result = " Its body temperature is  " + this.bodyTemp + ".";
        result += " It can " + ((layEggs) ? "lay eggs" : "not lay eggs.");
        result += " It is " + ((isVenomous) ? "venomous" : "not venomous.");
        result += this.speciesDescription();
        return result;
    }

}