public abstract class Animal 
{
        //Properties
        String name;
        String conserveStatus;
        enum locationType{LAND, WATER, AIR, ICE};
        locationType location;
        boolean alive;
        boolean hasChild;
        double age;
        String food;
 
        //Behaviors
        abstract void move();
        abstract void speak();
        abstract String classDescription();
        abstract String speciesDescription();
        void eat()
        {
                System.out.println(this.name + " eats " + this.food + " in general.");
        }
        final String getName()
        {
                return this.name;
        }
        final String getStatus()
        {
                return this.conserveStatus;
        }
        final locationType getLocation()
        {
                return this.location;
        }
        final double getAge()
        {
                return this.age;
        }
        final void die()
        {
                this.alive = false;
        }
 
        String description()
        {
                String result = this.name + " is a " + this.getClass().getName() + ". ";
                result += "It is currently in " + this.location + ". ";
                result += "Its conservation status is " + this.conserveStatus + ". ";
                result += "It is " + this.age + " years old. ";
                result += "It is currently " + ((this.alive) ? "alive. " : "dead. ");
                result += "It currently has " + ((this.hasChild) ? "children." : "no children.");
                result += this.classDescription(); // Call next level of description
                result += "\n";
 
                return result;
        }
}