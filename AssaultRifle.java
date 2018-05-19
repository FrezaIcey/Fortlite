// ChrisEden 5/18/18 Version 0.1

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
	public AssaultRifle(int c)
	{
		  damageAR = 20; 
		  magazineAR = 30; 
		  currentMagazine = c; 
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
}

