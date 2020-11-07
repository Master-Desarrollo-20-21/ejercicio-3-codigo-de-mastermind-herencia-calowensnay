package mastermind;

public class ProposedCombination extends Combination {
	
	public ProposedCombination() {
		super(proposeCombination());
	}
	
	public static String proposeCombination() {
		String answer = null;
		do {
			Console console = new Console();
			answer = console.inString("\nPropose a combination: ");
			if (!isValidLengthSequence(answer)) {
				console.out("Wrong proposed combination length.");
			}else if (!containValidColors(answer)) {
				console.out("Wrong colors, they must be: RBYGOP");
			}else if (containDuplicateValue(answer)) {
				console.out("Wrong combination: Duplicate Value(s)");
			}
		} while (!isValidSequence(answer));
		
		return(answer);
	}
	

	private static boolean isValidSequence(String answer) {
		return isValidLengthSequence(answer)&& containValidColors(answer) && !containDuplicateValue(answer);
	}
	
	private static boolean containValidColors(String answer) {
		for (int i=0;i<answer.length();i++) {
			if (!isValidColor(answer.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean containDuplicateValue(String answer) {
		
		for (int i=0;i<answer.length();i++) {
			if (getStringWithoutCharPosition(answer,i).contains(answer.charAt(i)+"")) {
				return true;
			}
		}
		return false;
	}
	
	private static String getStringWithoutCharPosition(String answer, int i) {
		String pre = "";
		String suf = "";
		if (i==0) {
			suf = answer.substring(1);
		}else if (i==answer.length()-1) {
			pre = answer.substring(0,answer.length()-2);
		}else {
			pre = answer.substring(0, i-1);
			suf = answer.substring(i+1, answer.length()-1);
		}
		
		return pre + suf;
	}

	private static boolean isValidLengthSequence(String answer) {
		return answer.length()==Combination.COMBINATION_LENGTH;
	}
	
	private static boolean isValidColor(char character) {
		Color[] colors = Color.values();
		for (int i = 0;i<colors.length;i++) {
			if (colors[i].name().charAt(0)==character) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void show() {
		Console console = new Console();
		for (int i=0;i<COMBINATION_LENGTH;i++) {
			console.out(getSequence()[i].toString());
		}
		
	}
}
