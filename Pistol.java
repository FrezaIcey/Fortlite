//ChrisEden 5/18/18 Version: 0.1
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
	public Pistol(int c)
	{
		  damageP = 10; 
		  magazineP = 16; 
		  currentMagazine = c; 
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
}

