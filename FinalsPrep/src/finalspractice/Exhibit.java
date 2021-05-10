package finalspractice;

import java.util.ArrayList;

public class Exhibit {
	
	public enum Climate  {ARCTIC, FOREST, JUNGLE, DESERT};   		
	
	private ArrayList<Animal> animals;
	private ArrayList<String> decorations; 
	private Climate environment;   // a variable to store the climate type in
	
	public Exhibit() {
		animals = new ArrayList();
		decorations = new ArrayList();
		environment = Climate.FOREST;
	}
	
	public ArrayList<Animal> getAnimals() {
		return animals;
	}
	
	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
	public ArrayList<String> getDecorations() {
		return decorations;
	}
	
	public void setDecorations(ArrayList<String> decorations) {
		this.decorations = decorations;
	}
	
	public Climate getEnvironment() {
		return environment;
	}
	
	public void setEnvironment(Climate environment) {
		this.environment = environment;
	}
}
