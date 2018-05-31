// ChrisEden 5/30/18 Version 0.2

public class AssaultRifle extends Weapon
{
	private int damageAR, magazineAR, currentMagazine;
	private String name; 
	public AssaultRifle()
	{
		  damageAR = 20; 
		  magazineAR = 30; 
		  currentMagazine = magazineAR; 
		  name = "Assault Rifle";
	}
	public String getName()
	{
		return name; 
	}
	public int getDamage()
	{
		return damageAR; 
	}
	public int getMagazineSize()
	{
		return magazineAR; 
	}
	public int getCurrentMagazine()
	{
		return currentMagazine; 
	}
	public int getDistance() 
	{
		return 342; 
	}
}

