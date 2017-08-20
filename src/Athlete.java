public class Athlete extends Participant {

	private int points = 0;
	private String type;
	public Athlete (String ID, String name, int age, String state, String type) {
		super(ID, name, age, state);
		this.type = type;
	}
	
	public int getPoints() {
		return points;
	}
	
	public void set5Points() {
		this.points += 5;
	}
	
	public void set2Points() {
		this.points += 2;
	}
	
	public void set1Points() {
		this.points += 1;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType (String type) {
		this.type = type;
	}
	
}
