package animal.animal_class;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Pinscher extends Dog {



	// public void finalize() throws Throwable {
	// 	super.finalize();
	// }

	public Pinscher(String _name)
	{
		super(_name);
		scream();
	}
	

	public void scream(String _scream)
	{
		int delay = 0;
		int period = 10000; // Répéter toutes les secondes
		Timer timer = new Timer(); 
		timer.scheduleAtFixedRate(
		new TimerTask() 
		{	
			public void run()
			{  
				System.out.println(getName() + getScream(_scream));;
			}
		}, 
		delay, period);
	}

}