package animal.animal_class;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Pinscher extends Dog {

	public Pinscher(String _name)
	{
		super(_name);
	}
	

	public void scream(String _scream)
	{
		int delay = 0;
		int period = 5000; // Répéter toutes les secondes
		Timer timer = new Timer(); 
		timer.schedule(
		new TimerTask() 
		{	
			public void run()
			{  
				System.out.println(getName() + getScream(_scream));
			}
		}, 
		delay, period);
	}

}