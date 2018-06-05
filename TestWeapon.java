package dev.project.fortlite.weapon;

//ChrisEden 6/5/18 Version: 0.2
import java.util.ArrayList; 
public class WeaponTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Weapon> list = new ArrayList<Weapon>(); 
		list.add(new AssaultRifle());
		list.add(new BurstRifle()); 
		list.add(new PumpShotgun());
		list.add(new Pistol()); 
		for(int i = 0; i < list.size(); i++) 
		{	
			System.out.print(list.get(i).getVelocity() + " ");
			System.out.print(list.get(i).getDistance() + " ");
			System.out.print(list.get(i).getReloadTime() + " ");
			System.out.print(list.get(i).getName());
			System.out.println();; 
		}
			
	}
}
