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
        
    }
    
    public Weapon weaponHeld()
    {
        return w;
    }
}
