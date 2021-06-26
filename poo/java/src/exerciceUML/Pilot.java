package exerciceUML;

import java.util.Scanner;

public class Pilot {
    
    static Scanner scanner = new Scanner(System.in);
    private String pilotName;
    private String typesOfPlanes;

    public Pilot()
    {
        //System.out.println("Constructor of pilot");

        this.pilotName = " ";
        this.typesOfPlanes = " ";

    }

    public String getPilotName()
    {
        return this.pilotName;
    }


    public void choosePilotName()
    {
        System.out.println("Choose the pilot name : ");
        System.out.println("Wright, Piche, Deroche.");

        setPilotName(scanner.nextLine());
    }

    public void setPilotName(String _pilotName)
    {
        this.pilotName = _pilotName;
    }

    public String getTypesOfPlanes()
    {
        if (this.pilotName == "Wright") {
            return "business planes";
        } else if (this.pilotName == "Piche") {
            return "Long haul";
        } else {
            return "Short haul";
        }
        //return this.typesOfPlanes;
    }

    


}
