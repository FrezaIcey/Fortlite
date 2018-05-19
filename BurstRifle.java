//ChrisEden 5/18/18 Version: 0.1
public class BurstRifle extends Weapon 
{
	private int damageBR, magazineBR, currentMagazine;
	private String name; 
	public BurstRifle()
	{
		  damageBR = 20; 
		  magazineBR = 30; 
		  currentMagazine = magazineBR; 
		  name = "Burst Rifle";
	}
	public BurstRifle(int c)
	{
		  damageBR = 20; 
		  magazineBR = 30; 
		  currentMagazine = c; 
		  name = "Burst Rifle";
	}
	public String getName()
	{
		return name; 
	}
	public int getDamage()
	{
		return damageBR; 
	}
	public int getMagazineSize()
	{
		return magazineBR; 
	}
	public int getCurrentMagazine()
	{
		return currentMagazine; 
	}
}

