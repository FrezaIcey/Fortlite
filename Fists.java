// ChrisEden 5/30/18 Version 0.2
public class Fists extends Weapon
{
	private String name; 
	private int damage; 
	public Fists()
	{
		name = "Fists";
		damage = 100; 
	}
	public String getName()
	{
		return name; 
	}
	public int getDamage()
	{
	    return damage; 
	}
    public int getMagazineSize()
	{
		return -1; 
	}
	public int getCurrentMagazine()
	{
		return -1;
	}
	public int getDistance() 
	{
		return 10; 
	}
}
