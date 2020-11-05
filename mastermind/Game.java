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

		do {
			Console console = new Console();
			console.out(attempsCantity + " " + "attempt(s):\n");
			secretCombination.show();
			console.out("\nPropose a combination: ");
			String combination = console.inString();
			Color[] sequence = new Color[6];
			for (int i = 0; i < 6; i++) {
				sequence[i] = Combination.toColor(combination.charAt(i));
			}
			ProposedCombination proposedCombination = new ProposedCombination(sequence);
			
//			for (int i = 0;i<MAX_ATTEMPS;i++) {
//				
//			}
			
			attemps[attempsCantity] = new Attemp(attempsCantity);
			attemps[attempsCantity].setProposedCombination(proposedCombination);

			attempsCantity++;
		} while (this.isWinner() || this.isLooser());

	}

	private boolean isLooser() {

		return attempsCantity == MAX_ATTEMPS;
	}

	private boolean isWinner() {

		return secretCombination.isCorrect(attemps[attempsCantity - 1].getProposedCombination());
	}

}
