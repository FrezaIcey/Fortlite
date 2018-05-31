//ChrisEden 5/30/18 Version: 0.2
public class PumpShotgun extends Weapon
{
	private int damagePS, magazinePS, currentMagazine;
	private String name; 
	public PumpShotgun()
	{
		  damagePS = 25; 
		  magazinePS = 8;
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
		return 86; 
	}
	public void addAmmo()
	{
		currentMagazine = magazinePS; 
	}
	public int getReloadTime() 
	{
		return 5;
	}
}
