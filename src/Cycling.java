import java.util.ArrayList;
import java.util.Random;

public class Cycling extends Game {

	public Cycling(String gameID, Referee referee, ArrayList<Result> Result) {
		super(gameID, referee, Result);
	}

	@Override
	public int compete() {
		Random r = new Random();
		return (r.nextInt(301) + 500);
	}
	
}

