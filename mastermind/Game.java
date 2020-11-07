package mastermind;

public class Game {
	private Attemp[] attemps = new Attemp[MAX_ATTEMPS];
	private int attempsCantity;
	private SecretCombination secretCombination;
	private static int MAX_ATTEMPS = 10;

	public Game() {
		attempsCantity = 0;
		secretCombination = new SecretCombination();
	}

	public void play() {
		Console console = new Console();
		console.out("----- MASTERMIND -----\n");
		do {
			showState();
			Attemp attemp = new Attemp(secretCombination);
			attemp.play();
			attemps[attempsCantity] = attemp;
			attempsCantity++;
		} while (!isWinner() && !isLooser());
		showResult();
	}

	private void showResult() {
		Console console = new Console();
		showState();
		if (this.isWinner()) {
			console.out("\nYou've won!!! ;-) \n");
		}else {
			console.out("\nYou've lost!!! ;-) \n");
		}
		
	}

	private void showState() {
		Console console = new Console();
		console.out("\n"+attempsCantity+" "+"attemp(s):\n");
		secretCombination.show();
		for (int i = 0;i<attempsCantity;i++) {
			attemps[i].show();
		}
	}

	private boolean isLooser() {
		return attempsCantity == MAX_ATTEMPS;
	}

	private boolean isWinner() {
		return attemps[attempsCantity - 1].isCorrect();
	}

}
