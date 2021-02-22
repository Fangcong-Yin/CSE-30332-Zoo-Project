
//Monkey
public final class Monkey extends Mammal
{
        //Constructor
        Monkey( String name,
                        locationType location,
                        boolean alive,
                        boolean hasChild,
                        double age,
                        String conserveStatus,
                        furType fur,
                        boolean bipedal,
                        double weanAge,
                        intelType intelligence  )
        {
                this.name = name;
                this.location = location;
                this.alive = alive;
                this.hasChild = hasChild;
                this.age = age;
                this.conserveStatus = conserveStatus;
                this.fur = fur;
                this.bipedal = bipedal;
                this.weanAge = weanAge;
                this.intelligence = intelligence;       
 
                //Definitions
                this.food = "fruits and small animals";
        }
 
        //Properties
        enum intelType{TOOLUSE, VERBALCOMMUNICATION, NOTHING};
        intelType intelligence;
        
 
 
 
 
 
 
 
 
 
 
        //Behaviors
        void move()
        {
                if(this.location == Animal.locationType.LAND)
                {
                        System.out.println(this.name + " walks.\n");
                }
                else if(this.location == Animal.locationType.WATER)
                {
                        System.out.println(this.name + " swims.\n");
                }
                else
                {
                        System.out.println(this.name + " can't move in/on " + this.location + ".\n");
                }
        }
        void speak()
        {
                double n = Math.random();
                if(n > 0.5)
                {
                        System.out.println(this.name + " grunts.\n");
                }
                else
                {
                        System.out.println(this.name + " squeaks.\n");
                }
        }
        String speciesDescription()
        {
                String result = " It has skill in " + intelligence + ".";
                return result;
        }
 
}
