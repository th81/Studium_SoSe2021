package uebung_01;

import java.util.UUID;


public class Plant {
	private UUID id;
	private String name;
	private String description;
	
	public Plant() {
		this.id = UUID.randomUUID();
	}
	
	public Plant(String name) {
		this();
		this.name = name;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
