
/**
 * This is the Demon subtype class. 
 * Demons have a 5% chance to do magical damage.
 * 
 * @author Michael Moretti
 * @version 19 November 2019
 */
public class Demon extends Creature
{
     /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
      super();
    }
    
     public Demon(int hp, int str)
    {
      super(hp, str);  
    }
    
     public int getDamage()
    {
      int luck = super.randomGenerator.nextInt(30);
      int inheritDamage = super.getDamage();
      
      if (luck == 0)
      {
        return inheritDamage + 50; 
      }
      else
      {
        return inheritDamage;
      }
    }
}