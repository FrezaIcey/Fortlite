public class Player()
{
    private int health, shield;
    private Weapon w;
  
    public Player()
    {
        health = 100;
        shield = 0;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int getShield()
    {
        return shield;
    }
    
    public void setHealth()
    {
        health = 100;
    }
    
    public Weapon weaponHeld()
    {
        return w;
    }
}
