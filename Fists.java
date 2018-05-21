
public class Fists extends Weapon
{
		  private String name; 
		  private int damage; 
		  public Fists()
		  {
		  	  name = "Fists" 
		  		damage = 10; 
		  }
		  public String getName()
		  {
		   		return name; 
		  }
		  public int getDamage()
		  {
		      return damage; 
		  }
		  public int getmagazineSize()
		  {
		  		return -1; 
		  }
		  public int getCurrentMagazine()
		  {
		  		return -1;
		  }
}
