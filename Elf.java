
/**
 * This is the Elf subtype class. 
 * Elves have a 10% chance to do magical damage. 
 * 
 * @author Michael Moretti 
 * @version 19 November 2018
 */
public class Elf extends Creature
{
    private final int TOP_HP = 25;
    private final int TOP_STR = 18;
   public Elf()
  {
    super();       
  }
  
    public Elf(int hp, int str)
  {
    super(hp, str);
    setHP(hp);
    setStrength(str);
  }
  
  public void setHP(int hp)
    {
       if (TOP_HP < hp)
       {
           super.setHP(TOP_HP);
       }
       else
       {
           super.setHP(hp);
       }
    }
    
    public void setStrength(int str)
    {
       if (TOP_STR < str)
       {
           super.setStrength(TOP_STR);
       }
       else
       {
           super.setStrength(str);
       }
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