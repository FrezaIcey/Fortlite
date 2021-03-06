package dev.project.fortlite.weapon;

//ChrisEden 6/4/18 Version: 0.3
public class PumpShotgun extends Weapon
{
	private int damagePS, magazinePS, currentMagazine, velocity, distance, reloadTime;
	private String name; 
	public PumpShotgun()
	{
		  damagePS = 25; 
		  magazinePS = 8;
		  distance = 86; //pixels 
		  velocity = 43; // pixels/second 
		  reloadTime = 5; // seconds
		  currentMagazine = magazinePS; 
		  name = "Pump Shotgun ";
	}
	public String getName()
	{
		return name; 
	}
	public int getDamage()
	{
		return damagePS; 
	}
	public int getMagazineSize()
	{
		return magazinePS; 
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
		currentMagazine = magazinePS; 
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
