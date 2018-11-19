import java.util.ArrayList;
import java.util.Random;
/**
 * Battle of Dagorlad
 * 
 * @author Michael Moretti
 * @version 19 November 2019
 */
public class BattleofDagorlad
{
  private ArrayList<Creature> MordorForces;
  private ArrayList<Creature> LastAlliance;
  private Random randomGenerator;
  
   public BattleofDagorlad()
   {
     MordorForces = new ArrayList<Creature>();
     LastAlliance = new ArrayList<Creature>();
     randomGenerator = new Random();
     setUpBattle();
     battle();
   }
   
  private void setUpBattle()
  {
     int theMordorForces = 10;
     int theLastAlliance = 10;
     System.out.println("\tHitpoints \tStrength");
     
     System.out.println("Human \n");
     for (int i = 0; i < theMordorForces/2; i++)
     {
         int hp = randomGenerator.nextInt(20);
         int str = randomGenerator.nextInt(20);
         
         MordorForces.add(new Human(hp, str));
         System.out.println("\t\t" + MordorForces.get(i).getHP() + "\t\t" 
         + MordorForces.get(i).getStrength()); 
     }
     
     System.out.println("Elf \n");
     for (int i = theMordorForces/2; i < theMordorForces; i++)
     {
         int hp = randomGenerator.nextInt(24);
         int str = randomGenerator.nextInt(13);
         
         MordorForces.add(new Elf(hp, str));
         System.out.println("\t\t" + MordorForces.get(i).getHP() + "\t\t" 
         + MordorForces.get(i).getStrength());
     }
     
     System.out.println("Demon \n");
     for (int i = 0; i < theMordorForces/2; i++)
     {
         int hp = randomGenerator.nextInt(20);
         int str = randomGenerator.nextInt(20);
         
         MordorForces.add(new Demon(hp, str));
         System.out.println("\t\t" + MordorForces.get(i).getHP() + "\t\t" 
         + MordorForces.get(i).getStrength());
     }
     
     System.out.println("Balrog \n");
     for (int i = theMordorForces/2; i < theMordorForces; i++)
     {
         int hp = randomGenerator.nextInt(20);
         int str = randomGenerator.nextInt(20);
         
         MordorForces.add(new Balrog(hp, str));
         System.out.println("\t\t" + MordorForces.get(i).getHP() + "\t\t" 
         + MordorForces.get(i).getStrength());
     }
  }
  
  private void battle()
  {
   int i = 0;
   int y = 0;
   
   boolean startTheWar = true;
   
   int IsildurStrike;
   int MordorForcesStrike;
   
  
  while (startTheWar && (MordorForces.get(i).getHP() > 0 && LastAlliance.get(y).getHP() > 0))
  {
      System.out.println("A last alliance of men and elves marches against the "
  + "armies of Mordor, and on the plains of Dagorlad, they will fight one last"
  + " battle for the fate of Middle-Earth."); 
       
       IsildurStrike = LastAlliance.get(y).getDamage();
       System.out.println(MordorForces.get(i).getHP());
       System.out.println(IsildurStrike);
       
       LastAlliance.get(i).BattleWound(IsildurStrike);
       System.out.println(MordorForces.get(i).getHP() + "[" + i + "]");
       
       System.out.println(LastAlliance.get(y).getHP());
       MordorForcesStrike = MordorForces.get(i).getDamage();
       System.out.println(MordorForcesStrike);
       LastAlliance.get(y).BattleWound(MordorForcesStrike);
       
       System.out.println(LastAlliance.get(y).getHP() + "[" + y + "]");
       
         if (LastAlliance.size() > y && LastAlliance.get(y) instanceof Balrog)
         {
             if (MordorForces.get(i).getHP() <= 0)
             {
                 i++;
                 if (MordorForces.size() > i)
                 {
                     System.out.println("Balrog gets to attack a second time!");
                     IsildurStrike = LastAlliance.get(y).getDamage();
                     System.out.println(MordorForces.get(i).getHP());
                     System.out.println(IsildurStrike);
                     MordorForces.get(i).BattleWound(IsildurStrike);
                     System.out.println(MordorForces.get(i).getHP() 
                     + "[" + i + "]");
                 }
         
             }
       
         }
    if (MordorForces.size() > i && LastAlliance.size() > y)
    {
        if (MordorForces.get(i).getHP() <= 0)
        {
             i++;             
        }
        if (MordorForces.get(y).getHP() <= 0)
        { 
            y++;                
        }
    if (MordorForces.size() == i || LastAlliance.size() == y)
    {
         startTheWar = false;
    }
    if (i == y)
    {
       System.out.println("Nobody won this round!");
    }
    if (i < y)
    { 
       System.out.println("The Forces of Mordor won with " 
       + (MordorForces.size()- i) + "troop(s) alive.");
       System.out.println("A shadow is cast of Middle-earth, the power "
       +"of the Ring could not be undone");
    } 
    if (i > y)
    {
       System.out.println("The Last Alliance won with " 
       + (LastAlliance.size()- i) + "troop(s) alive.");
       System.out.println("Isildur, prince of Gondor and Arnor, took up his "
       + "father's sword. And Sauron, enemy of the free peoples of Middle-Earth,"
       + "was defeated. ");
    }
}
}
}
}
