
/**
 * This is the Elf subtype class. 
 * Elves have a 10% chance to do magical damage. 
 * 
 * @author Michael Moretti 
 * @version 19 November 2018
 */
public class Elf extends Creature
{
   public Elf()
  {
    super();       
  }
  
    public Elf(int hp, int str)
  {
    super(hp, str);   
  }
  
   public int obtainDamage()
   {
    int luck = super.randomGenerator.nextInt(10);
    int inheritDamage = super.getDamage();
    
    if (luck == 0)
    {
       return inheritDamage*2;
    }
    else
    {
       return inheritDamage; 
    }
  }
}