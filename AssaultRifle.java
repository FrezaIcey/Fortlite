// ChrisEden 6/4/18 Version: 0.3

public class AssaultRifle extends Weapon
{
	private int damageAR, magazineAR, currentMagazine,velocity, distance, reloadTime;
	private String name; 
	public AssaultRifle()
	{
		  damageAR = 20; 
		  magazineAR = 30; 
		  velocity = 228; // pixels/second
		  distance = 342; // pixles 
		  reloadTime = 4; // seconds
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
		return distance; 
	}
	public void addAmmo()
	{
		currentMagazine = magazineAR; 
	}
	public int getReloadTime() 
	{
		return reloadTime;
	}
}
