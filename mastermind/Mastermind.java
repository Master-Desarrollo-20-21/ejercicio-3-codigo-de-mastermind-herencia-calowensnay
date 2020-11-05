package mastermind;

public class Mastermind {

	private Game game;
	
	public Mastermind() {
		this.game = new Game();
	}

	private void play() {
		do {
			this.game.play();
		} while (isResumed());

	}

	private boolean isResumed() {
		char answer;
		Console console = new Console();
		do {
			answer = console.inChar("RESUME? (y/n): ");
		} while (answer != 's' && answer != 'n');
		return answer == 's';
	}

	public static void main(String[] args) {
		new Mastermind().play();

	}

}
