//Bird
public abstract class Bird extends Animal{
    //Properties
    double wingspan;
    double beakLength;
    
    //Methods
    final double getWingspan(){
        return this.wingspan;
    }
    
    final void layEggs(){
        System.out.println(this.name + " lays eggs.");
    }
 
    String classDescription(){
        String result = " Its wingspan is is  " + this.wingspan + ".";
        result += " Its beak length is " + this.beakLength + ".";
        result += this.speciesDescription();
        return result;
    }
}