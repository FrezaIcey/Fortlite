package dev.project.fortlite.weapon;

//ChrisEden 6/5/18 Version 0.4
public class Fists extends Weapon
{
	private String name; 
	private int damage, velocity, distance, reloadTime; 
	public Fists()
	{
		name = "Fists";
		damage = 100;
		velocity = 10; // pixels/second
		reloadTime = 5; // seconds 
		distance  = 10; // pixels 
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
		return distance; 
	}
	public void addAmmo()
	{
		return; 
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
