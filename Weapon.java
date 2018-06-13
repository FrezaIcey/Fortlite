package dev.project.fortlite.weapon;

// ChrisEden 6/12/18 Version: 0.8;
public abstract class Weapon 
{
	public abstract String getName(); 
	public abstract int getDamage(); 
	public abstract int getMagazineSize(); 
	public abstract int getCurrentMagazine(); 
	public abstract int getDistance(); 
	public abstract int getReloadTime(); 
	public abstract void addAmmo(); 
	public abstract int getVelocity();
	
	public static boolean reloading = false; 
		
	public int fire()
	{
		if(canShoot())
		{	
			return this.getDamage(); 
		}	
		else 
			return 0; 
	}
	private boolean canShoot()
	{
		
		if(this.getName() != "Burst Rifle")
		{
			if(this.getCurrentMagazine() != 0)
				return true;  
		}
		else 
		{
			if(this.getCurrentMagazine() >= 3)
				return true; 
		}
		return false; 
	}
}
