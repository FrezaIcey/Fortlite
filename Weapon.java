package dev.project.fortlite.weapon;

// ChrisEden 6/8/18 Version: 0.4;
import java.awt.event.*;
import javax.swing.Timer; 
import edu.wpi.first.wpilibj.XboxController;
public abstract class Weapon 
{
	public abstract String getName(); 
	public abstract int getDamage(); 
	public abstract int getMagazineSize(); 
	public abstract int getCurrentMagazine(); 
	public abstract int getDistance(); 
	public abstract int getReloadTime(); 
	public abstract void addAmmo(); 
	public abstract int getVelocity();
	
	public static boolean reloading = false; 
		
	public int fire(Weapon w)
	{
		if(canShoot(w))
		{	
			return w.getDamage(); 
		}	
		else 
			return 0; 
	}
	private boolean canShoot(Weapon w)
	{
		if(!reloading)
		{
			if(w.getName() != "Burst Rifle")
			{
				if(w.getCurrentMagazine() != 0)
					return true;  
			}
			else 
			{
				if(w.getCurrentMagazine() >= 3)
					return true; 
			}
		}
		return false; 
	}
	public void updateWeapon(Weapon w, XboxController x)
	{
		//creates a timer object that whenever there is user input on the x button, it sets reloading to true 
		//and doesn't allow for other input
		Timer t = new Timer(w.getReloadTime() * 1000, new ActionListener() 
		{
		     public void actionPerformed(new ActionEvent(x, 3, "Reload"))
		     {
		    	 if(a.getModifiers() == 3)
		    	 { 
		    		 t.start(); 
		    		 reloading = true;
		    		 w.addAmmo();
		    	 }
		     }
		}); 
		
		if(reloading && t.isRunning())
		{	
			t.stop(); 
		}
	}
}
