package mastermind;

public class Attemp {

	private ProposedCombination proposedCombination;
	private SecretCombination secretCombination;
	private int blacksCantity;
	private int whitesCantity;

	
	public Attemp(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}

	public void  play() {
		proposedCombination =  new ProposedCombination();
		blacksCantity =secretCombination.evaluateBlacks(proposedCombination);
		whitesCantity = secretCombination.evaluateWhites(proposedCombination);
	}
	
	public void show() {
		Console console = new Console();
		console.out("\n");
		proposedCombination.show();
		console.out(" --> "+blacksCantity +" blaks "+whitesCantity+ " whites");
		
	}

	public boolean isCorrect() {
		return blacksCantity == 4;
	}
}
