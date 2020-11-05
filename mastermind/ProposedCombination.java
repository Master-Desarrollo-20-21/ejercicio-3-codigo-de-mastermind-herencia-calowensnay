package mastermind;

public class ProposedCombination extends Combination {


	public ProposedCombination() {
	
	}
	
	public ProposedCombination(Color[] sequence) {
		this.sequence = sequence;
	}

	@Override
	protected void show() {
		Console console = new Console();
		for (int i=0;i<6;i++) {
			console.out(sequence[i].toString());
		}
		
	}
	

}
