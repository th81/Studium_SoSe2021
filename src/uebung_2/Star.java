package uebung_2;

public class Star {
	private StarsDatabase database;
	private String name;
	private String id;
	private double distance;
	private double apparentMagnitude;
	private String type;
	
	public Star() { }
	public Star (String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// other getters and setters
}

