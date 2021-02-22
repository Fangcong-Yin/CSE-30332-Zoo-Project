
//Kangaroo
public final class Kangaroo extends Mammal
{
        //Constructor
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
 
}
