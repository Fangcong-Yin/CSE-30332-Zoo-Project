/*Zoo Project Milestone 1
Fangcong Yin (fyin2)
Joseph Capdevielle (jcapdevi)
Kenan Lumantas (klumanta)*/

//The Test Class
public class ZooTest {
    public static void main(String args[]) {

      Animal zoo[] = new Animal[6];

      Snake s = new Snake("s","threatened","WATER",true,false,8.1,68,true,false);
      zoo[0] = s;

      Crocodile c = new Crocodile("c","least concerned","LAND",true,true,43.2,86,true,false);
      zoo[1] = c;

      Kangaroo k = new Kangaroo("k", Animal.locationType.AIR, true, false, 3.2, Kangaroo.pouchSizeType.SMALL);
      zoo[2] = k;

      Monkey m = new Monkey("m", Animal.locationType.LAND, true, false, 1.4, "Endangered", Mammal.furType.NO, true, 1.5, Monkey.intelType.NOTHING);
      zoo[3] = m;

      Parrot pa = new Parrot("pa", "least concern", "AIR",true, false, 8.2, 6.7, 4, "imitate human speech", "seeds");

      zoo[4] = pa;

      Penguin pe = new Penguin("pe","least concern","WATER", true, true, 11.7, 10.8, 7.9, "black");
      zoo[5] = pe;

      for(int i = 0; i < 6; i++)
      {
        System.out.println(zoo[i].description());
        zoo[i].move();
        zoo[i].speak();
        zoo[i].eat();
        if((zoo[i] instanceof Bird) )
        {
          ((Bird)zoo[i]).layEggs();
        }
        else if((zoo[i] instanceof Reptile && ((Reptile)zoo[i]).layEggs)){
            ((Reptile)zoo[i]).layEggs();
        }

      }
    }
}
