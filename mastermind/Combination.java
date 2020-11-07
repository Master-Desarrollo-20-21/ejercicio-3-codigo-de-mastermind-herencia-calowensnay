package mastermind;

public abstract class Combination {
	public static int COMBINATION_LENGTH = 4;
	private Color[] sequence = new Color[COMBINATION_LENGTH];
	
	public Combination () {
		
	}
	
	public Combination (String phrase) {
		for (int i=0;i<phrase.length();i++) {
			getSequence()[i]=toColor(phrase.charAt(i));
		}
	}	
	
	protected  boolean containColor(Color color) {
		for (int i = 0;i<COMBINATION_LENGTH;i++) {
			if (getSequence()[i]!=null && getSequence()[i].equals(color)) {
				return true;
			}
		}
		return false;
	}
	
	protected int evaluateBlacks(Combination proposedCombination) {
		int counter = 0;
		for (int i = 0; i < this.getSequence().length; i++) {
			if (this.getSequence()[i].equals(proposedCombination.getSequence()[i])) {
				counter++;
			}
		}
		return counter;
	}
	
	protected int evaluateWhites(Combination proposedCombination) {
		int counter = 0;
		for (int i = 0; i < this.sequence.length; i++) {
			if (!this.sequence[i].equals(proposedCombination.getSequence()[i])) {
			   if (isWhiteColor(proposedCombination.getSequence()[i])) {
				   counter ++;
			   }
			}
		}
		return counter;
	}
	
	
	private boolean isWhiteColor (Color color) {
		for (int i=0;i<getSequence().length;i++) {
			if (color.equals(getSequence()[i])) {
				return true;
			}
		}
		return false;
	}
	
	
	
	protected abstract void show();

	protected Color[] getSequence() {
		return sequence;
	}
	
	protected  Color getColor(int position) {
		Color color = null;
		switch (position) {
		case 0:
			color = Color.R;
			break;
		case 1:
			color = Color.B;
			break;
		case 2:
			color = Color.G;
			break;
		case 3:
			color = Color.Y;
			break;
		case 4:
			color = Color.P;
			break;
		case 5:
			color = Color.O;
			break;
		}
		return color;
	}

	private static Color toColor(char charColor) {

		Color color = null;
		switch (charColor) {
		case 'R':
			color = Color.R;
			break;
		case 'B':
			color = Color.B;
			break;
		case 'G':
			color = Color.G;
			break;
		case 'Y':
			color = Color.Y;
			break;
		case 'P':
			color = Color.P;
			break;
		case 'O':
			color = Color.O;
			break;

		}
		return color;
	}
}
