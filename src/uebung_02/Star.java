package uebung_02;

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

	public void setDatabase(StarsDatabase database){

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// other getters and setters
	public String getId() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getApparentMagnitude() {
		return apparentMagnitude;
	}
	public void setApparentMagnitude(double apparentMagnitude) {
		this.apparentMagnitude = apparentMagnitude;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}