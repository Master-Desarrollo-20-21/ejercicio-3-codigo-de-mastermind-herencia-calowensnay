package mastermind;

public class Mastermind {

	private Game game;
	
	private void play() {
		do {
			this.game = new Game();
			game.play();
		} while (isResumed());
	}

	private boolean isResumed() {
		char answer;
		Console console = new Console();
		do {
			answer = console.inChar("RESUME? (Y/N): ");
		} while (answer != 'Y' && answer != 'N');
		return answer == 'Y';
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
