//ChrisEden 5/18/18 Version: 0.1
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
	public PumpShotgun(int c)
	{
		  damagePS = 25; 
		  magazinePS = 8;
		  currentMagazine = c; 
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
}
