//Mammal
public abstract class Mammal extends Animal {
        //Properties
        enum furType{FULL, LOCALIZED, NO};
        furType fur;
        boolean bipedal;
        double weanAge;
 
        //Behaviors
        void eat() 
        {
                if(this.age < this.weanAge)
                {
                        System.out.println(this.name + "drinks milk");
                }
                else
                {
                        System.out.println(this.name + " eats " + this.food + " in general.");
                }
        }
        String classDescription()
        {
                String result = " It has " + this.fur + " fur.";
                result += " It is " + ((bipedal) ? "bipedal." : "quadripedal.");
                result += this.speciesDescription();
                return result;
        }
}
