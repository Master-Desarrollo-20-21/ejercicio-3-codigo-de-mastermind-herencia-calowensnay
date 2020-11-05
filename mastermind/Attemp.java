package mastermind;

public class Attemp {

	private ProposedCombination proposedCombination;
	private int attempNumber;
	
	public Attemp(int attempNumber) {
		this.attempNumber = attempNumber;
	}

	public ProposedCombination getProposedCombination() {
		
		return proposedCombination;
	}

	public void proposeCombination() {
		
		setProposedCombination(new ProposedCombination());
	}

	public void setProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

}
