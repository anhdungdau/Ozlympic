import java.util.ArrayList;

public class Database {

	public static Referee CreateReferee() {
		Referee rf = new Referee("R1", "Wayne", 31, "VIC");
		return rf;
	}
	
	public static ArrayList<Athlete> CreateAthlete() {
		
		Athlete ath1 = new Athlete("A01", "Betty Cuthbert", 18, "TAS", "Running");
		Athlete ath2 = new Athlete("A02", "Murray Rose", 17, "VIC", "Running");
		Athlete ath3 = new Athlete("A03", "Lorraine Crapp", 18, "QLD", "Running");
		Athlete ath4 = new Athlete("A04", "Dawn Fraser", 19, "NSW", "Running");
		Athlete ath5 = new Athlete("A05", "John Devitt", 21, "TAS", "Running");
		Athlete ath6 = new Athlete("A06", "Shirley Herricks", 23, "VIC", "Swimming");
		Athlete ath7 = new Athlete("A07", "Gary Chapman", 21, "QLD", "Swimming");
		Athlete ath8 = new Athlete("A08", "Faith Leech", 25, "VIC", "Swimming");
		Athlete ath9 = new Athlete("A09", "Marlene Matthews", 27, "WA", "Swimming");
		Athlete ath10 = new Athlete("A10", "Ian Browne", 22, "VIC", "Swimming");
		Athlete ath11 = new Athlete("A11", "Norma Fleming", 22, "SA", "Cycling");
		Athlete ath12 = new Athlete("A12", "Elizabeth", 23, "NSW", "Cycling");
		Athlete ath13 = new Athlete("A13", "Margaret Gibson", 18, "SA ", "Cycling");
		Athlete ath14 = new Athlete("A14", "Graham Hamilton", 20, "NSW", "Cycling");
		Athlete ath15 = new Athlete("A15", "Tony Marchant", 19, "SA ", "Cycling");
		Athlete ath16 = new Athlete("A16", "David Theile", 24, "QLD", "SuperAthlete");
		Athlete ath17 = new Athlete("A17", "Kevin Goodman", 24, "QLD", "SuperAthlete");
		Athlete ath18 = new Athlete("A18", "Stuart MacKenzie", 19, "TAS", "SuperAthlete");
		Athlete ath19 = new Athlete("A19", "Peter Bennett", 20, "VIC", "SuperAthlete");
		Athlete ath20 = new Athlete("A20", "Alan Barblett", 22, "TAS", "SuperAthlete");
		return null;
	}
	
	
}
