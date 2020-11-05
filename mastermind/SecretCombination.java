package mastermind;

import java.util.Random;

public class SecretCombination extends Combination{

	public SecretCombination() {
		for (int i = 0; i<6;i++) {
			sequence[i] = getRandomColor();
		}
	}

	public boolean isCorrect(ProposedCombination proposedCombination) {
		
		return this.equals(proposedCombination);
	}
	
	private Color getRandomColor() {
		Random rand = new Random();
		int i;
		do{
			i = rand.nextInt(6);
		}while (containColor(getColor(i)));
		return getColor(i);
	}

	@Override
	protected void show() {
		Console console = new Console();
		for (int i=0;i<6;i++) {
			console.out("X");
		}
		
	}
	


}
