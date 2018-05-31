//ChrisEden 5/30/18 Version: 0.2
public class BurstRifle extends Weapon 
{
	private int damageBR, magazineBR, currentMagazine;
	private String name; 
	public BurstRifle()
	{
		  damageBR = 15; 
		  magazineBR = 30; 
		  currentMagazine = magazineBR; 
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
	public int getDistance() 
	{
		return 342; 
	}
	public void addAmmo()
	{
		currentMagazine = magazineBR; 
	}
	public int getReloadTime() 
	{
		return 4;
	}
}
