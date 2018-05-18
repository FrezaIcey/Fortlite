//ChrisEden 5/18/18 Version: 0.1
public abstract class Weapon 
{
	public abstract String getName(); 
	public abstract int getDamage(); 
	public abstract int getMagazineSize(); 
	public abstract int getCurrentMagazine(); 
	
	public int fire(Weapon w)
	{
		if(canShoot(w))
		{	
			return w.getDamage(); 
		}	
		else 
			return -1; 
	}
	private boolean canShoot(Weapon w)
	{
		if(w.getName() != "Burst Rifle")
		{
			if(w.getCurrentMagazine() != 0)
				return true; 
			return false; 
		}
		else 
		{
			if(w.getCurrentMagazine() >= 3)
				return true; 
			return false; 
		}
	}
}
