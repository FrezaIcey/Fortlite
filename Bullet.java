// ChrisEden 5/30/18 Version 0.2
public class Bullet 
{
	private int damage, distance, xPos, yPos; 
	private Position p; 
	public Bullet(int x, int y, Weapon w)
	{
		p = new Position(x,y); 
		xPos = x; 
		yPos = y; 
		damage = w.getDamage();
		distance = w.getDistance(); 
	}
	public Position setPosition(int x, int y)
	{ 
		p = new Position(xPos + x, yPos + y);
		return p; 
	}
	public int getDamage()
	{
		return damage; 
	}
	public int getDistance()
	{
		return distance; 
	}
}
