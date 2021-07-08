package animal;

import java.util.TimerTask;
import animal.animal_class.*;

public class TimerTest extends TimerTask {
    
    private Dog dog;

    public TimerTest(Dog _dog)
    {
        this.dog = _dog;
        //this.run();
    }

    public void run()
			{  
				System.out.println(this.dog.getName() + this.dog.getScream(" aboie"));
			}
}
