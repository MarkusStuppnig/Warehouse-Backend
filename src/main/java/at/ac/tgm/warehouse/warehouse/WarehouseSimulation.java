package at.ac.tgm.warehouse.warehouse;

import at.ac.tgm.warehouse.model.WarehouseData;

import java.util.Random;

public class WarehouseSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public WarehouseData getData(String inID ) {
		
		String[][] cities = {
			{"Wien", "1010", "Jägerstraße 1", "Wien Hauptlager", "Österreich"},
			{"Salzburg", "5020", "Hauptstraße 5", "Salzbug Lager", "Österreich"},
			{"Graz", "8010", "Weinbergstraße", "Graz Lager", "Österreich"}
		};

		int r = new Random().nextInt(2);

		WarehouseData data = new WarehouseData();
		data.setWarehouseID(inID);
		data.setWarehouseName(cities[r][3]);
		data.setStreet(cities[r][2]);
		data.setPlz(cities[r][1]);
		data.setCity(cities[r][0]);
		data.setCountry(cities[r][4]);

		return data;
		
	}

}
