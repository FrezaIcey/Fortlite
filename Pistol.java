// ChrisEden 5/30/18 Version 0.2
public class Pistol extends Weapon
{
	private int damageP, magazineP, currentMagazine;
	private String name; 
	public Pistol()
	{
		  damageP = 10; 
		  magazineP = 16; 
		  currentMagazine = magazineP; 
		  name = "Pistol";
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
		return 170; 
	}
	public void addAmmo()
	{
		currentMagazine = magazineP; 
	}
	public int getReloadTime() 
	{
		return 2;
	}
}
