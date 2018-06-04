//ChrisEden 6/4/18 Version: 0.3
public class BurstRifle extends Weapon 
{
	private int damageBR, magazineBR, currentMagazine, reloadTime, distance, velocity;
	private String name; 
	public BurstRifle()
	{
		  damageBR = 15; 
		  magazineBR = 30; 
		  distance = 342; 
		  velocity = 228; 
		  reloadTime = 4; 
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
		return distance; 
	}
	public void addAmmo()
	{
		currentMagazine = magazineBR; 
	}
	public int getReloadTime() 
	{
		return reloadTime;
	}
	public int getVelocity()
	{
		return velocity; 
	}
}
