
//Kangaroo
public final class Kangaroo extends Mammal
{
        //Detailed Non-default Constructor
        Kangaroo(       String name,
                                Animal.locationType loc,
                                boolean alive,
                                boolean hasChild,
                                double age,
                                pouchSizeType pouchSize         )
        {
                this.name = name;
                this.location = loc;
                this.alive = alive;
                this.hasChild = hasChild;
                this.age = age;
                this.pouchSize = pouchSize;

                //Definitions
                this.fur = Mammal.furType.FULL;
                this.bipedal = true;
                this.weanAge = 1.5;
                this.food = "tree leaves and fruit";
                this.conserveStatus = "least Concern";
        }
         //Simplified Non-default constructor for user interaction: only take in the pouchsize
         Kangaroo(       String name,   String size         )
         {
                 this.name = name;
                 //Parse the pouchsize from String
                 if(size.equals("SMALL")){
                   this.pouchSize = Kangaroo.pouchSizeType.SMALL;
                 }
                 else if(size.equals("MEDIUM")){
                   this.pouchSize = Kangaroo.pouchSizeType.MEDIUM;
                 }
                 else if(size.equals("LARGE")){
                   this.pouchSize = Kangaroo.pouchSizeType.LARGE;
                 }
                 //The following properties are set to some default values
                 this.location = Animal.locationType.LAND;
                 this.alive = true;
                 this.hasChild = false;
                 this.age = 15.1;
                 this.fur = Mammal.furType.FULL;
                 this.bipedal = true;
                 this.weanAge = 1.5;
                 this.food = "tree leaves and fruit";
                 this.conserveStatus = "Least Concern";
         }
        //Properties
        enum pouchSizeType{SMALL, MEDIUM, LARGE};
        pouchSizeType pouchSize;

        //Behaviors
        void move()
        {
                if(this.location == Animal.locationType.LAND)
                {
                        System.out.println(this.name + " hops on land.\n");
                }
                else if(this.location == Animal.locationType.WATER)
                {
                        System.out.println(this.name + " swims in water.\n");
                }
                else
                {
                        System.out.println(this.name + " can't move in/on " + this.location + ".\n");
                }
        }
        void speak()
        {
                System.out.println(this.name + " growls.\n");
        }
        String speciesDescription()
        {
                String result = " Its pouch is " + pouchSize + ".";
                return result;
        }

        //briefDescription only prints out the name of the kangaroo and its pouchsize.
        String briefDescription(){
            String result = this.name +" is a " + this.getClass().getName() + ".";
            result+=this.speciesDescription();
            return result;
        }

}
