import java.util.ArrayList;
import java.util.Random;

public class Swimming extends Game {

	public Swimming(String gameID, Referee referee, ArrayList<Result> Result) {
		super(gameID, referee, Result);
	}

	@Override
	public int compete() {
		Random r = new Random();
		return (r.nextInt(101) + 100);
	}

}
