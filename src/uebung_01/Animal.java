package uebung_01;

import java.util.UUID;

public class Animal {
    private UUID id;
    private String name;

    private Plant[] plantfood = new Plant[10];
    private int p = 0;
    private Animal[] animalfood = new Animal[10];
    private int a = 0;

    public Animal(){
    	this.id = UUID.randomUUID();
    }
    
    public Animal(String name){
        this();
        this.name = name;
    }
    
    public UUID getId() {
		return id;
	}
    
	public void setName(String name) {
        this.name = name;
    }
	
    public String getName() {
        return this.name;
    }

    public void addPlantFood(Plant plant) {
        plantfood[this.p] = plant;
        this.p++;
    }
    public void addAnimalFood(Animal animal) {
        animalfood[this.a] = animal;
        this.a++;
    }
        
    public String getDiet() { 
        String food = "";
        if (this.p > 0 && this.a == 0) {
            food = "herbivore";
        }
        else if (this.p == 0 && this.a > 0) {
            food = "carnivore";
        }
        else if (this.p > 0 && this.a > 0) {
            food = "omnivore";
        }
        else {
            food = "Does not have any food sources";
        }
        return food;
    }

}
