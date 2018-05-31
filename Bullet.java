//ChrisEden 5/21/18 Version: 0.1
public class Bullet 
{
	private int damage, posX, posY; 
	public Bullet(int x, int y, Weapon w)
	{
		posX = x; 
		posY = y; 
		damage = w.getDamage(); 
	}
//	public int setPosition()
	{
		
	}
}
