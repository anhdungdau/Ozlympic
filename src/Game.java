
//This is an abstract class for 3 games: Swimming, Running & Cycling
import java.util.ArrayList;

public abstract class Game {
	
	private String gameID;
	private Referee referee;
	private ArrayList<Result> Result;
	private Athlete predictWinner;
	
	public Game(String gameID, Referee referee, ArrayList<Result> Result) {
		this.gameID = gameID;
		this.referee = referee;
		this.Result = Result;
	}
	
	abstract int compete();

	public String getGameID() {
		return gameID;
	}

	public void setGameID(String gameID) {
		this.gameID = gameID;
	}

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	public ArrayList<Result> getResult() {
		return Result;
	}

	public void setResult(ArrayList<Result> result) {
		Result = result;
	}

	public Athlete getPredictWinner() {
		return predictWinner;
	}

	public void setPredictWinner(Athlete predictWinner) {
		this.predictWinner = predictWinner;
	}
	
}
