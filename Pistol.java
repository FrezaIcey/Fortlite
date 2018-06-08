package dev.project.fortlite.weapon;

//ChrisEden 6/5/18 Version: 0.3
public class Pistol extends Weapon
{
	private int damageP, magazineP, currentMagazine, distance, reloadTime, velocity;
	private String name; 
	public Pistol()
	{
		name = "Pistol";
		damageP = 10; 
        	magazineP = 16; 
		currentMagazine = magazineP; // initial set for the ammo
		distance = 170; // pixels 
		reloadTime = 2; // seconds
		velocity = 113; // pixels/second
	}
	public String getName()
	{
		return name; 
	}
	public int getDamage()
	{
		return damageP; 
	}
	public int getMagazineSize()
	{
		return magazineP; 
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
		currentMagazine = magazineP; 
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
