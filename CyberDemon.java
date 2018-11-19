
/**
 * This is the CyberDemon subtype class.
 *
 * @author (Michael Moretti)
 * @version (19 November 2019)
 */
public class CyberDemon extends Demon 
{
   private final int TOP_HP = 100;
   private final int TOP_STR = 40;
   private final int LOW_HP = 25;
   private final int LOW_STR = 20; 
   public CyberDemon()
   {
      super();
   }
      
   public CyberDemon(int hp, int str)
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
       
       if(LOW_HP > hp)
       {
           super.setHP(LOW_HP);
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
       
       if(LOW_STR > str)
       {
           super.setStrength(LOW_STR);
       }
       else
       {
           super.setStrength(str);
       }
    }
   
   
   }