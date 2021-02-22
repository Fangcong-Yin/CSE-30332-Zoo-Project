
//Monkey
public final class Monkey extends Mammal
{
        //Detailed Non-default Constructor
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

   //Simplified Non-default constructor for user interaction: only take in the intelligence
   Monkey( String name, String intel  )
   {
           this.name = name;
           //Parse the intelligence level from String
           if(intel.equals("TOOLUSE")){
             this.intelligence = Monkey.intelType.NOTHING;
           }
           else if(intel.equals("VERBALCOMMUNICATION")){
             this.intelligence = Monkey.intelType.VERBALCOMMUNICATION;
           }
           else if(intel.equals("NOTHING")){
             this.intelligence = Monkey.intelType.NOTHING;
           }
           //The following properties are set to some default values
           this.location =  Animal.locationType.LAND;
           this.alive = true;
           this.hasChild = false;
           this.age = 1.4;
           this.conserveStatus = "endangered";
           this.fur = Mammal.furType.NO;
           this.bipedal = true;
           this.weanAge = 1.5;
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

        //briefDescription only prints out the name of the monkey and its intelligence level.
        String briefDescription(){
            String result = this.name +" is a " + this.getClass().getName() + ".";
            result+=this.speciesDescription();
            return result;
        }

}
