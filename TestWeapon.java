//ChrisEden 5/18/18 Version: 0.1

import java.util.ArrayList; 
public class TestWeapon 
{
	public static void main(String[] args) 
	{
		ArrayList<Weapon> list = new ArrayList<Weapon>(); 
		list.add(new AssaultRifle());
		list.add(new BurstRifle()); 
		list.add(new PumpShotgun());
		list.add(new Pistol()); 
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i).canShoot(list.get(i)));
	}
}
