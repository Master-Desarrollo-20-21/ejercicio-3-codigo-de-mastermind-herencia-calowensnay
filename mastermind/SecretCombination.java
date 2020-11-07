package mastermind;

import java.util.Random;

public class SecretCombination extends Combination {

	
	public SecretCombination() {
		for (int i = 0; i < COMBINATION_LENGTH; i++) {
			getSequence()[i] = getRandomColor();
		}
	}

	private  Color getRandomColor() {
		Random rand = new Random();
		int i;
		do {
			i = rand.nextInt(COMBINATION_LENGTH);
		} while (containColor(getColor(i)));
		return getColor(i);
	}

	@Override
	protected void show() {
		Console console = new Console();
		for (int i = 0; i < COMBINATION_LENGTH; i++) {
			console.out('X');
		}

	}

}
