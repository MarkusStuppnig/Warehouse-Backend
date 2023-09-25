package at.ac.tgm.warehouse.warehouse;

import at.ac.tgm.warehouse.model.WarehouseData;
import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
	
	public String getGreetings( String inModule ) {
        return "Greetings from " + inModule;
    }

    public WarehouseData getWarehouseData(String inID ) {
    	
    	WarehouseSimulation simulation = new WarehouseSimulation();
        return simulation.getData(inID);
        
    }
    
}