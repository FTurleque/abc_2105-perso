package animal.animal_class;

import java.util.Timer;
import animal.*;

/**
 * @author Stagiaire
 * @version 1.0
 * @created 30-juin-2021 08:40:07
 */
public class Pinscher extends Dog {

	//private String scream;

	public Pinscher(String _name)
	{
		super(_name);
	}
	

	public void scream()
	{
		int delay = 0;
		int period = 500; // Répéter toutes les secondes
		Timer timer = new Timer(); 
		timer.schedule(
		new TimerTest(this), 
		delay, period);
	}

}