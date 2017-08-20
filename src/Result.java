//Show the result for each game
public class Result {
	
	private int time;
	private Athlete athlete;
	private int rank;
	
	public Result(Athlete athlete) {
		this.time = time;
		this.athlete = athlete;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Athlete getAthlete() {
		return athlete;
	}

	public void setAthlete(Athlete athlete) {
		this.athlete = athlete;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
