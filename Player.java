import java.util.ArrayList;

public class Player()
{
    private int health;
    private Position p;
    Controller c;
    Weapon w;
  
    public Player()
    {
        health = 100;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public Position getPosition()
    {
        return p;
    }
    
    public void setWeapon(ArrayList<Weapon> weapons)
    {
        int i = (int)(Math.random() * weapons.size()) + 1;
        w = weapons.remove(i);
    }
    
    public void setController(Arraylist<Controller> controllers)
    {
        int i = (int)(Math.random() * controllers.size()) + 1;
        c = controllers.remove(i);
    }
    
    public Controller getController()
    {
        return c;
    }
}
